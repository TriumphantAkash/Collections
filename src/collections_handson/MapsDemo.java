package collections_handson;

import java.util.HashMap;
import java.util.Map;

public class MapsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(5, "five");
		map.put(6, "six");
		map.put(7, "seven");
		map.put(8, "eight");
		map.put(9, "nine");
		map.put(10, "ten");
		map.put(8, "duplicate_eight");
		
		String number = map.get(8);
		System.out.println(number);
		
		System.out.println("******************************");
		
		for(Map.Entry<Integer, String> entry: map.entrySet()) {
			entry.getKey();
			entry.getValue();
			System.out.println(entry+"\n");
		}
		
	}

}
