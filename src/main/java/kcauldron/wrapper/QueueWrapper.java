package kcauldron.wrapper;

import java.util.Queue;

public class QueueWrapper<T> extends CollectionWrapper<T, Queue<T>> implements Queue<T>{
    public QueueWrapper(Queue<T> collection) {
        super(collection);
    }

    @Override
    public T element() {
        return mCollection.element();
    }

    @Override
    public boolean offer(T e) {
        return mCollection.offer(e);
    }

    @Override
    public T peek() {
        return mCollection.peek();
    }

    @Override
    public T poll() {
        return mCollection.poll();
    }

    @Override
    public T remove() {
        return mCollection.remove();
    }
}
