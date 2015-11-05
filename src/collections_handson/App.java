package collections_handson;

import java.util.ArrayList;

public class App {

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
		
//		//List interface ...
//		List <String> numbers  = new ArrayList<String>()
		
	}

}
