package week15;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;

public class CollectionsReview {
	
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		//list.pop();
		
		Vector<Integer> list2 = new Vector<>();
		//list2.pop();
		
		
		Stack<Integer> list3 = new Stack<>();
		list3.addAll( Arrays.asList(1,2,3,4,5,6,7,8) );
		
		System.out.println(list3);
		
		//int r = list3.peek();// returns the last object from stack, does not remove
		int r = list3.pop();
		
		System.out.println(list3);
		
		System.out.println(r);
		
		
		HashSet<Integer> numbers = new HashSet<>();
		numbers.addAll( Arrays.asList(2,2,2,3,3,3,4,4,5,5,5,13,3,3,4,4,5, 99, null)); // order is random
		
		System.out.println(numbers);
		
		LinkedHashSet<String> characters= new LinkedHashSet<>();
		characters.addAll(  Arrays.asList("D", "D", "A", "A", "B", "B", "A", "C", null)); // keeps the insertion order
		
		System.out.println(characters);
		
		
		LinkedHashSet<Integer> numbers2 = new LinkedHashSet<>();
		numbers2.addAll( Arrays.asList(2,2,2,3,3,3,4,4,5,5,5,13,3,3,4,4,5, 99, null)); // keeps the insertion order
		
		System.out.println(numbers2);
		
		

		TreeSet<String> characters2= new TreeSet<>();
		characters2.addAll(  Arrays.asList("D", "D", "A", "A", "B", "B", "A", "C")); // sorted order
		
		System.out.println(characters2);
		
		System.out.println("------------------------------------------------");
		
		Queue<Integer>  queue1 = new ArrayDeque<>();  //FIFO
		queue1.addAll(Arrays.asList(10,10,11,11,12,12,13,5,4,3,2,1));
		System.out.println(queue1);
		
		queue1.poll(); // 10
		queue1.poll(); //10
		queue1.poll(); // 11
		
	//	queue1.add(null); // arrayDeque does not accept null
		
		System.out.println(queue1);
	//	System.out.println( queue1.get(0) );
		
		System.out.println("----------------------------------");
		
		Queue<Integer>  queue2 = new LinkedList();
		queue2.addAll(Arrays.asList(10,12,13,5,4,3,2,1));
		System.out.println(queue2);
		queue2.poll(); 
		queue2.poll(); 
		
		queue2.add(null);
		
		System.out.println(queue2);
		
		System.out.println(   ( (LinkedList<Integer>)queue2 ).get(3)   );
		
		System.out.println("-------------------------------------");
		
		
		Queue<Integer>  queue3 = new PriorityQueue();
		queue3.addAll(Arrays.asList(10,10,11,11,12,12,13,5,4,3,2,1));
		
		System.out.println(queue3);
		
		queue3.poll(); // decreases the size of priorityqueue
		
		System.out.println(queue3);
		
		
		
		
		
		
		
	}
	
	
	public synchronized void method() {
		
	}
	

}
