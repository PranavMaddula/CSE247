package studio3;

public class OrderedArray<T extends Comparable<T>> implements PriorityQueue<T> {

	public T[] array;
	private int size;

	@SuppressWarnings("unchecked")
	public OrderedArray(int maxSize) {
		array = (T[]) new Comparable[maxSize];
		size = 0;
	}

	@Override
	public boolean isEmpty() {
		return (size == 0);
	}

	@Override
	public void insert(T thing) {

		array[size].equals(thing);
		size++;

	}

	@Override
	public T extractMin() {
		T min = array[0];
		return min;

	}

}
