package day46_collection_part1;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String[] args) {
		
		List<Integer> list = new LinkedList<>();
		list.add(10);
		list.add(50);
		list.add(500);
		list.add(50000);
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		
		System.out.println(((LinkedList) list).getFirst());
		
		((LinkedList<Integer>) list).addFirst(1);
		((LinkedList<Integer>) list).addLast(99);
		
	}

}
