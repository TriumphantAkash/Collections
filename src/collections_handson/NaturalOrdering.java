//Tutorial 8

package collections_handson;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class NaturalOrdering {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();

		//we could have written Set<String> set = new TreeSet<String>();
		//but that would not have 
		SortedSet<String> set = new TreeSet<String>();
		
		addElements(list);
		Collections.sort(list);
		showElements(list);
		
		System.out.println();
		addElements(set);
		showElements(set);
	}
	
	private static void addElements(Collection<String> col) {
//		String str = "";
//		for(String item: col) {
//			str += col;
//		}
		col.add("Joe");
		col.add("Sue");
		col.add("Juliet");
		col.add("Clare");
		col.add("Mike");
		
	}
	
	private static void showElements(Collection<String> col) {
		for(String item: col) {
			System.out.println(item);
		}
	}

}
