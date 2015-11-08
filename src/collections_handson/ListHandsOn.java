package collections_handson;

import java.awt.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class ListHandsOn {

	private static ArrayList<Integer> arrayList;
	private static LinkedList<Integer> linkedList;
	private static long start;
	private static long end;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arrayList = new ArrayList<Integer>();
		linkedList = new LinkedList<Integer>();
		for(int i=0; i<1E5; i++) {
			arrayList.add(i);
		}
		
		for(int i=0; i<1E5; i++) {
			arrayList.add(i);
		}
		doTimings();
	}
	
	/*a function to add 100,000 elements to the list and also displays the time taken to add the items*/
	private static void doTimings() {
		
		long start = System.currentTimeMillis();
		
		for(int i=0; i<1E5; i++) {
			arrayList.add(i);
		}
		long end = System.currentTimeMillis();
		
		System.out.println("Time taken to add 100,000 items to the end of ArrayList is: "+ (end-start));
		
		start = System.currentTimeMillis();
		
		for(int i=0; i<1E5; i++) {
			linkedList.add(i);
		}
		end = System.currentTimeMillis();
		
		System.out.println("Time taken to add 100,000 items to the end of LinkedList is: "+ (end-start));
		
		System.out.println("*************************************************************************************");
		System.out.println("*************************************************************************************");
		
		start = System.currentTimeMillis();
		for(int i = 0; i<1E5; i++) {
			arrayList.add(0, 69);
		}
		end = System.currentTimeMillis();
		
		System.out.println("time taken to add 200,000 items to the start of arrayList is: "+ (end - start));
		
		start = System.currentTimeMillis();
		for (int i=0; i<1E5; i++) {
			linkedList.add(0, 69);
		}
		
		end = System.currentTimeMillis();
		System.out.println("time taken to add 200,000 items at the start of linkedlist is: "+ (end - start));
		
		
	}

}
