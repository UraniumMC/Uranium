package kcauldron.wrapper;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;

public class ProcessingQueue<T> extends QueueWrapper<T> {
    public class ProcessingIterator implements Iterator<T> {
        private Iterator<T> mRealIterator = mCollection.iterator();
        private AtomicInteger mPosition = new AtomicInteger(0);

        @Override
        public boolean hasNext() {
            final int size = mSize.get();
            final int position = mPosition.get();
            if (size == 0 || position >= size) {
                mPosition.compareAndSet(position, 0);
                mRealIterator = mCollection.iterator();
                return false;
            }
            boolean value = mRealIterator.hasNext();
            if (!value) {
                mRealIterator = mCollection.iterator();
                value = mRealIterator.hasNext();
            }
            return value;
        }

        @Override
        public T next() {
            T value = mRealIterator.next();
            mPosition.incrementAndGet();
            return value;
        }

        @Override
        public void remove() {
            mRealIterator.remove();
            mSize.decrementAndGet();
            mPosition.decrementAndGet();
        }

        public void reset() {
            mPosition.set(0);
        }
    }

    private final AtomicInteger mSize;
    private final ProcessingIterator mIterator = new ProcessingIterator();

    @Override
    public boolean add(T e) {
        boolean result = super.add(e);
        if (result) {
            mSize.incrementAndGet();
        }
        return result;
    };

    @Override
    public boolean offer(T e) {
        boolean result = super.offer(e);
        if (result) {
            mSize.incrementAndGet();
        }
        return result;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        boolean result = false;
        for (T t : c) {
            result |= add(t);
        }
        return result;
    }

    @Override
    public T remove() {
        T result = super.remove();
        mSize.decrementAndGet();
        return result;
    }

    @Override
    public boolean remove(Object o) {
        boolean result = super.remove(o);
        if (result) {
            mSize.decrementAndGet();
        }
        return result;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        boolean result = false;
        for (Object t : c) {
            result |= remove(t);
        }
        return result;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        boolean result = super.retainAll(c);
        if (result) {
            mSize.set(mCollection.size());
        }
        return result;
    }

    @Override
    public T poll() {
        T result = super.remove();
        if (result != null) {
            mSize.decrementAndGet();
        }
        return result;
    }

    public ProcessingQueue(Queue<T> collection) {
        super(collection);
        mSize = new AtomicInteger(collection.size());
    }

    @Override
    public ProcessingIterator iterator() {
        mIterator.reset();
        return mIterator;
    }
}
