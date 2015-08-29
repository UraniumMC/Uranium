package kcauldron.wrapper;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class LinkedHelper<T> {
    private Iterable<T> mIterable;
    private Iterator<T> mIterator;
    private int iteratorIndex;
    private T indexValue;

    public LinkedHelper(Iterable<T> iterable) {
        mIterable = iterable;
    }

    public T get(int index) {
        if (iteratorIndex > index || mIterator == null) {
            mIterator = mIterable.iterator();
            iteratorIndex = -1;
        }
        while (iteratorIndex < index) {
            if (mIterator.hasNext()) {
                indexValue = mIterator.next();
                iteratorIndex++;
            } else {
                throw new IndexOutOfBoundsException();
            }
        }
        return indexValue;
    }

    public int indexOf(Object o) {
        int i = 0;
        for (T value : mIterable) {
            if (o == null ? value == null : o.equals(value))
                return i;
            i++;
        }
        return -1;
    }

    public int lastIndexOf(Object o) {
        if (!(mIterable instanceof List)) {
            throw new UnsupportedOperationException();

        }
        ListIterator<T> iterator = ((List<T>) mIterable).listIterator();
        int i = 0;
        while (iterator.hasPrevious()) {
            T value = iterator.previous();
            if (o == null ? value == null : o.equals(value))
                return i;
            i++;
        }
        return -1;
    }

    public ListIterator<T> listIterator() {
        if (mIterable instanceof List) {
            return ((List<T>) mIterable).listIterator();
        }
        return new LinkedListIterator<T>(mIterable.iterator(), 0);
    }

    public ListIterator<T> listIterator(int index) {
        if (mIterable instanceof List) {
            return ((List<T>) mIterable).listIterator(index);
        }
        Iterator<T> iterator = mIterable.iterator();
        for (int i = 0; i < index; i++)
            iterator.next();
        return new LinkedListIterator<T>(iterator, index);
    }

    private static final class LinkedListIterator<T> implements ListIterator<T> {
        private final Iterator<T> mIterator;
        private final ListIterator<T> mListIterator;
        private int mNextIndex;

        public LinkedListIterator(Iterator<T> iterator, int index) {
            mIterator = iterator;
            mListIterator = iterator instanceof ListIterator ? (ListIterator<T>) iterator : null;
            mNextIndex = index;
        }

        private void ensureListIterator() {
            if (mListIterator == null)
                throw new UnsupportedOperationException();
        }

        @Override
        public void add(T e) {
            ensureListIterator();
            mListIterator.add(e);
        }

        @Override
        public boolean hasNext() {
            return mIterator.hasNext();
        }

        @Override
        public boolean hasPrevious() {
            ensureListIterator();
            return mListIterator.hasPrevious();
        }

        @Override
        public T next() {
            mNextIndex++;
            return mIterator.next();
        }

        @Override
        public int nextIndex() {
            return mNextIndex;
        }

        @Override
        public T previous() {
            ensureListIterator();
            return mListIterator.previous();
        }

        @Override
        public int previousIndex() {
            ensureListIterator();
            return mListIterator.previousIndex();
        }

        @Override
        public void remove() {
            ensureListIterator();
            mListIterator.remove();
        }

        @Override
        public void set(T e) {
            ensureListIterator();
            mListIterator.set(e);
        }
    }
}
