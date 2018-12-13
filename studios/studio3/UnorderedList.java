package studio3;

import java.util.LinkedList;
import java.util.List;

public class UnorderedList<T extends Comparable<T>> implements PriorityQueue<T> {

	public LinkedList<T> list;

	public UnorderedList() {
		list = new LinkedList<T>();
	}

	@Override
	public boolean isEmpty() {
		return (list.size() == 0);
	}

	@Override
	public void insert(T thing) {
		list.add(thing);
	}

	@Override
	public T extractMin() {
		int min = 0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).compareTo(list.get(min)) < 0) {
				min = i;
			}
		}
		return list.remove(min);
	}

}
