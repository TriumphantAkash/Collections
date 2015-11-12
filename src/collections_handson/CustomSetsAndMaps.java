package collections_handson;

import java.util.Map;
import java.util.Set;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

class Person {
	private int id;
	private String name;
	
	
	//hashCode() and equals() methods are useful for CONSERVING the NO-DUPLICATE
	//property of sets and maps
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public Person(int id, String name) {
		this.setId(id);
		this.setName(name);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	} 
}

public class CustomSetsAndMaps {
	public static void main(String args[]) {
		Map<String, Integer> map = new LinkedHashMap<String, Integer>();
		
		map.put("one", 1);
		map.put("two", 2);
		map.put("three", 3);
		map.put("one", 1);
		
		for(String key : map.keySet()) {
			System.out.println(key + ": " + map.get(key));
		}
		
		Set<String> set = new LinkedHashSet<String>();
		set.add("one");
		set.add("two");
		set.add("three");
		set.add("one");
		
		System.out.println("###################################");
		System.out.println(set);
		
		for(String value: set) {
			System.out.println(value);
		}
		
		
		System.out.println("################Custom Set###################");
		Person p1 = new Person(1, "Akash");
		Person p2 = new Person(2, "Ashesh");
		Person p3 = new Person(3, "Prajwal");
		Person p4 = new Person(1, "Akash");
		
		Set<Person> personSet = new LinkedHashSet<Person>();
		personSet.add(p1);
		personSet.add(p2);
		personSet.add(p3);
		personSet.add(p4);
		
		//System.out.println(personSet);
		for(Person personInstance: personSet) {
			System.out.println(personInstance.getId() + ":"+personInstance.getName());
		}
		
		System.out.println("################Custom Map####################");
		Map<Person, Integer> personMap = new LinkedHashMap<Person, Integer>();
		personMap.put(p1, 1);
		personMap.put(p2, 2);
		personMap.put(p3, 3);
		personMap.put(p4, 1);
		
		for(Person person: personMap.keySet()) {
			System.out.println(person+": "+personMap.get(person));
		}
				
	}
}
