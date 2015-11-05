package collections_handson;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		//adding
		numbers.add(10);
		numbers.add(100);
		numbers.add(50);
		
		//retrieving
		System.out.println(numbers.get(0));
		
		//Indexed for loop iteration
		System.out.println("Iteration#1");
		for(int i=0; i<numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}
		
		System.out.println("Iteration#2");
		for (Integer value: numbers) {
			System.out.println(value);
		}
		
		//removing items from the Last if ArrayList is fast
		numbers.remove(numbers.size() -1);
		
		//remove items from the start of list a little slower, cuz internally it is an array
		numbers.remove(0);
		
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
		doTimings("LinkedList", linkedList);
		doTimings("ArrayList", arrayList);
		
	}
	
	private static void doTimings(String type, List<Integer> list) {
		System.out.println(type);
	}
	

}
