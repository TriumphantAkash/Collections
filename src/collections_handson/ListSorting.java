package collections_handson;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

//A custom comparator to be used with Collections.sort() function to sort strings based on their length
class StringLengthComparator implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		int len1 = s1.length();
		int len2 = s2.length();
		
		if(len1 > len2) {
			return -1;
		}else if(len1 < len2){
			return 1;
		}else{
			return 0;
		}
	}
}

//A custom comparator to sort the strings based on their alphabetical order
class StringAlphabeticalComparator implements Comparator<String> {


	@Override
	public int compare(String s1, String s2) {
		// TODO Auto-generated method stub
		if (s1.compareTo(s2) > 0){
			return 1;
		}else if (s1.compareTo(s2) < 0) {
			return -1;
		}else {
			return 0;
		}
	}
}
	

class ReverseAlphabeticalComparator implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		if(s1.compareTo(s2) > 0) {
			return -1;
		}else if(s1.compareTo(s2)<0) {
			return 1;
		}else {
			return 0;
		}
	}
	
}


public class ListSorting {

	public static void main(String[] args) {
		
		System.out.println("########### List of Strings ###########");
		List<String> animals = new ArrayList<String>();
		
		animals.add("lion");
		animals.add("cat");
		animals.add("tiger");
		animals.add("dog");
		animals.add("elephant");
		
		Collections.sort(animals);
		
		for(String animal: animals) {
			System.out.println(animal);
		}
		
		System.out.println("########### sorting strings using length comparator ###########");
		StringLengthComparator comp = new StringLengthComparator();
		Collections.sort(animals, comp);
		
		//System.out.println(animals);
		for(String animal: animals) {
			System.out.println(animal);
		}
		
		System.out.println("########### sorting strings using alphabetical comparator ###########");
		StringAlphabeticalComparator compAlpha = new StringAlphabeticalComparator();
		Collections.sort(animals, compAlpha);
		
		//System.out.println(animals);
		for(String animal: animals) {
			System.out.println(animal);
		}
		
		
		System.out.println("########### sorting strings using alphabetical comparator (embedded one)###########");
		//StringAlphabeticalComparator compEmbeddedAlpha = new StringAlphabeticalComparator();
		Collections.sort(animals, new Comparator<String>() {

			@Override
			public int compare(String s1, String s2) {
				// TODO Auto-generated method stub
				if(s1.compareTo(s2) > 0){
					return 1;
				}else if (s1.compareTo(s2) < 0) {
					return -1;
				}else {
					return 0;
				}
			}} );
		
		//System.out.println(animals);
		for(String animal: animals) {
			System.out.println(animal);
		}
		
		
		
		System.out.println("########### sorting strings using Reverse alphabetical comparator ###########");
		ReverseAlphabeticalComparator revCompAlpha = new ReverseAlphabeticalComparator();
		Collections.sort(animals, revCompAlpha);
		
		//System.out.println(animals);
		for(String animal: animals) {
			System.out.println(animal);
		}
		
		
		System.out.println("########### List of Integers ###########");
		
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(3);
		numbers.add(1);
		numbers.add(36);
		numbers.add(73);
		numbers.add(25);
		
		Collections.sort(numbers);
		
		for(int number: numbers) {
			System.out.println(number);
		}
		
		System.out.println("########### sorting integers in reverse order using a custom comparator ###########");
		Collections.sort(numbers, new Comparator<Integer>() {

			@Override
			public int compare(Integer i1, Integer i2) {
				if(i1>i2){
					return -1;
				}else if(i1<i2) {
					return 1;
				}else {
					return 0;
				}
			}});
		
		for(int number: numbers) {
			System.out.println(number);
		}
		
		
	}

}
