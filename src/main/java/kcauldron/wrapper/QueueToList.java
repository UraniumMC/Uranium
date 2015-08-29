package kcauldron.wrapper;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.Queue;

public class QueueToList<T> extends CollectionWrapper<T, Queue<T>>implements List<T> {
    private final Queue<T> mQueue;
    private final LinkedHelper<T> mHelper;

    public QueueToList(Queue<T> queue) {
        super(queue);
        mQueue = queue;
        mHelper = new LinkedHelper<T>(mQueue);
    }

    @Override
    public void add(int index, T element) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T get(int index) {
        return mHelper.get(index);
    }

    @Override
    public int indexOf(Object o) {
        return mHelper.indexOf(o);
    }

    @Override
    public int lastIndexOf(Object o) {
        return mHelper.lastIndexOf(o);
    }

    @Override
    public ListIterator<T> listIterator() {
        return mHelper.listIterator();
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        return mHelper.listIterator(index);
    }

    @Override
    public T remove(int index) {
        T object = mHelper.get(index);
        return mQueue.remove(object) ? object : null;
    }

    @Override
    public T set(int index, T element) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException();
    }
}
