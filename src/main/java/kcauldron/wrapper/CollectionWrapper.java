package kcauldron.wrapper;

import java.util.Collection;
import java.util.Iterator;

public class CollectionWrapper<T, C extends Collection<T>> implements Collection<T> {
    protected C mCollection;

    public CollectionWrapper(C collection) {
        mCollection = collection;
    }

    @Override
    public boolean add(T e) {
        return mCollection.add(e);
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        return mCollection.addAll(c);
    }

    @Override
    public void clear() {
        mCollection.clear();
    }

    @Override
    public boolean contains(Object o) {
        return mCollection.contains(o);
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return mCollection.containsAll(c);
    }

    @Override
    public boolean isEmpty() {
        return mCollection.isEmpty();
    }

    @Override
    public Iterator<T> iterator() {
        return mCollection.iterator();
    }

    @Override
    public boolean remove(Object o) {
        return mCollection.remove(o);
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return mCollection.removeAll(c);
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return mCollection.retainAll(c);
    }

    @Override
    public int size() {
        return mCollection.size();
    }

    @Override
    public Object[] toArray() {
        return mCollection.toArray();
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return mCollection.toArray(a);
    }

    public C unwrap() {
        return mCollection;
    }
}
