package collections_handson;
import java.util.HashMap;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class SomeMoreMaps {

	private static HashMap<Integer, String> hashMap;
	private static LinkedHashMap<Integer, String> linkedHashMap;
	private static TreeMap<Integer, String> treeMap;
	
	public static void main(String[] args) {
		hashMap = new HashMap<Integer, String>();
		linkedHashMap = new LinkedHashMap<Integer, String>();
		treeMap = new TreeMap<Integer, String>();
		
		
		//iterating over the map
//		for (Map.Entry<Integer, String> entry: hashMap.entrySet()) {
//			System.out.println(entry.getKey() + ":" + entry.getValue());
//		}
		
		testMap(hashMap);	//HashMap does not guarantee any particular order in which the items were stored
		testMap(linkedHashMap);	//LinkedHashMap stores the data in the same order they were inserted in the map
		testMap(treeMap);	//TreeMap sorts the entries according to the Key value in each entry
	}
	
	//a method to check the basic difference between these 3 kinds of maps
	public static void testMap(Map<Integer, String> passedMap) {
		// adding data to the map
		passedMap.put(3, "three");
		passedMap.put(1, "one");
		passedMap.put(7, "seven");
		passedMap.put(2, "two");
		passedMap.put(4, "four");
		passedMap.put(5, "five");
		passedMap.put(6, "six");
		passedMap.put(8, "eight");
		
		for(Integer key: passedMap.keySet()) {
			System.out.println(key + ":" + passedMap.get(key));
		}
		
		System.out.println("********************************************************");
	}

}
