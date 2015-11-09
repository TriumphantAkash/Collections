package collections_handson;

import java.util.HashMap;
import java.util.Map;

class Temp {}

public class MapsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		
		hashMap.put(5, "five");
		hashMap.put(6, "six");
		hashMap.put(7, "seven");
		hashMap.put(8, "eight");
		hashMap.put(9, "nine");
		hashMap.put(10, "ten");
		hashMap.put(8, "duplicate_eight");
		
		String number = hashMap.get(8);
		System.out.println(number);
		
		System.out.println("******************************");
		
		for(Map.Entry<Integer, String> entry: hashMap.entrySet()) {
			entry.getKey();
			entry.getValue();
			System.out.println(entry+"\n");
		}
		
		
		
		System.out.println(new Temp());
		
		//*NOTE: HashMap does not keep the entries in order,
		//		 You may get a different order every time iterating over the HashMap
		
	}

}
