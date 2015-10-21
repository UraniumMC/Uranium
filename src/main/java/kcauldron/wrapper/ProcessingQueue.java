package kcauldron.wrapper;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;

public class ProcessingQueue<T> extends QueueWrapper<T> {
	public class ProcessingIterator implements Iterator<T> {
		private Iterator<T> mRealIterator = mCollection.iterator();

		@Override
		public boolean hasNext() {
			return mRealIterator.hasNext();
		}

		@Override
		public T next() {
			return mRealIterator.next();
		}

		@Override
		public void remove() {
			mRealIterator.remove();
			mSize.decrementAndGet();
		}
	}

	private final AtomicInteger mSize;

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
		return new ProcessingIterator();
	}

	@Override
	public String toString() {
		if (size() == 0)
			return "[]";
		StringBuilder builder = new StringBuilder();
		for (T t : this) {
			builder.append(',');
			builder.append(t == null ? "null" : t.getClass().getSimpleName());
		}
		builder.setCharAt(0, '[');
		builder.append(']');
		return builder.toString();
	}
}
