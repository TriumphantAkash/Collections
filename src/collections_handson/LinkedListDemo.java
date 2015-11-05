package collections_handson;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
		doTimings("LinkedList", linkedList);
		doTimings("ArrayList", arrayList);
		
	}
	
	
	//If you want to add/remove items on beginning OR end of List then use ArrayList
	//if want to add/remove items randomly i.e. on random positions in the list then use linked list
	//think about it a minute and you will realize the reason (Hint: linkedlist is not continuous, arrayList is continuous memory)

	private static void doTimings(String type, List<Integer> list) {
		
		//adding items to the end of list
//		long startE = System.currentTimeMillis();
//		
//		for(int i=0; i<1E5; i++) {
//			list.add(i);
//		}
//		
//		long endE = System.currentTimeMillis();
//		
//		System.out.println("Time taken: " + (endE-startE) + " ms for " + type + " while adding items to end of list");
		
		
		//adding to the beginning of the list
		long startB = System.currentTimeMillis();
		
		for (int i=0; i<1E5; i++) {
			list.add(list.size(), i);
		}
		
		long endB = System.currentTimeMillis();
		
		System.out.println("Time taken: "+ (endB-startB) + " ms for " + type + " while adding item to the beginning of list");
		
	}
}
