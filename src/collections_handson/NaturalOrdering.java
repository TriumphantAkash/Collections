//Tutorial 8
//defining Natural Order for our own class COMPARABLE interface

package collections_handson;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;


class Person1 implements Comparable<Person1>{
	private String name;
	
	Person1(String name) {
		this.name = name;
	}

	public String getData() {
		return name;
	}
	

//	@Override
//	public int compareTo(Person1 person1) {
//		// TODO Auto-generated method stub
//		
//		//return -1 if this (current object) is less than the passed object person1
//		return -this.name.compareTo(person1.name);
//		
//		//return 1 if this (current object) is greater than the passed object person1
//		
//		//returns 0 if both are equal
//		
//	}
	
//	@Override
//	public int compareTo(Person1 person1) {
//		// TODO Auto-generated method stub
//		
//		//return -1 if this (current object) is less than the passed object person1
//		if(this.name.compareTo(person1.name) == 0){
//			return 0;
//		} else if(this.name.compareTo(person1.name) == 1) {
//			return -1;
//		} else {
//			return 1;
//		}
//		
//		//return 1 if this (current object) is greater than the passed object person1
//		
//		//returns 0 if both are equal
//		
//	}
	
	//for sorting based on the string length
	@Override
	public int compareTo(Person1 person1) {
		if(this.name.length() > person1.name.length()) {	//in this case I am assuming 'this' object to be greater and thus returning 1 so that during sorting it is placed later
			return 1;			//the object in here is greater than the passed object
		} else if (this.name.length() < person1.name.length()) {
			return -1;			//the object in here is smaller than the passed object
		} else {
			//need to further distinguish between the elements having same length
			//return 0;
			return this.name.compareTo(person1.name);//put the elements in alphabetical order if the elements are of equal lengths
		}
		
	}
	
}
public class NaturalOrdering {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person1> list = new ArrayList<Person1>();

		//we could have written Set<String> set = new TreeSet<String>();
		//but that would not have 
		SortedSet<Person1> set = new TreeSet<Person1>();
		
		addElements(list);
		Collections.sort(list);
		showElements(list);
		
		System.out.println();
		addElements(set);
		showElements(set);
	}
	
	
	//Caution: you can't add elements to a TreeSet unless they have a Natural order defined (compareTo) 
	private static void addElements(Collection<Person1> col) {
//		String str = "";
//		for(String item: col) {
//			str += col;
//		}
		col.add(new Person1("Akash"));
		col.add(new Person1("Ashesh"));
		col.add(new Person1("Aditya"));
		col.add(new Person1("Stanzin"));
		col.add(new Person1("Yogesh"));
		
	}
	
	private static void showElements(Collection<Person1> col) {
		for(Person1 item: col) {
			System.out.println(item.getData());
		}
	}

}
