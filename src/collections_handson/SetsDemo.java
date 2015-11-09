package collections_handson;

import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
//A set is a kind of collection in java that stores only the unique elements
public class SetsDemo {
	private static Set<String> hashSet;
	private static Set<String> linkedHashSet;
	private static Set<String> treeSet;

	//I am gonna demonstrate basic set operation
	public static void main(String[] args) {
		
		//HashSet does not guarantee any particular order in which the items were stored
		hashSet = new HashSet<String>();
		
		//LinkedHashSet always store the items in the same order they are inserted
		linkedHashSet = new LinkedHashSet<String>();
		
		//TreeSet always stores the items in sorted order
		treeSet = new TreeSet<String>();
		
		testSet(hashSet);
		testSet(linkedHashSet);
		testSet(treeSet);
		
		setOperations();
		
	}
	
	public static void testSet(Set<String> set) {
		
		if(set.isEmpty()) {
			System.out.println("set is empty at start");
		}
		
		set.add("Dog");
		set.add("Tiger");
		set.add("Lion");
		set.add("Monkey");
		set.add("Snake");
		
		if(set.isEmpty()) {
			System.out.println("set is empty after adding items");
		}
		//adding a duplicate does nothing to a Set
		set.add("Lion");
		
		System.out.println(set);
		System.out.println("******************************");
		
		//iterating through a set
		for(String item: set) {
			System.out.println(set);
		}
		
		//does the set contain a particular item in it
		if(set.contains("Lion")) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
	}
	
	public static void setOperations() {
		HashSet<String>set1 = new HashSet<String>();
		HashSet<String>set2 = new HashSet<String>();
		HashSet<String>operationSet = new HashSet<String>();
		
		set1.add("a");
		set1.add("b");
		set1.add("c");
		set1.add("d");
		
		set2.add("c");
		set2.add("d");
		set2.add("e");
		set2.add("f");
		
		operationSet.addAll(set1);
		operationSet.retainAll(set2);
		System.out.println("The intersection of the 2 sets is: "+operationSet);
		
		operationSet.addAll(set1);
		operationSet.removeAll(set2);
		System.out.println("The difference (set1 - set2) is: "+operationSet);
	}

}
