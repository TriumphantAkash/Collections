package hackerRankProblems;

import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.ArrayList;

class Student {
	int id;
	String name;
	double gpa;
	
	Student(int id, String name, double gpa) {
		this.id = id;
		this.name = name;
		this.gpa = gpa;
	}
}

class CustomComparator implements Comparator<Student>{
	
	@Override
	public int compare(Student s1, Student s2){
		if(s1.gpa > s2.gpa){
			return -1;
		} else if(s1.gpa < s2.gpa) {	//less gpa go down the list
			return 1;
		} else {
			if(s1.name.compareTo(s2.name) > 0){
				return 1;	//means s1 go down the list
			} else if(s1.name.compareTo(s2.name) < 0) {
				return -1;
			} else {
				if(s1.id > s2.id) {
					return -1;
				} else if(s1.id < s2.id) {	//smaller ID go down the list
					return 1;
				} else {
					return 0;
				}
			}
			//return 0;
		}
	}
	
}

public class CustomListSorter {

	private static ArrayList<Student> data = new ArrayList<Student>();
	public static void main(String[] args) {

		

		//user input
		Scanner in = new Scanner(System.in);
		String itemName;
		int itemID;
		double itemGPA;
		int itemCount = in.nextInt();
		for(int i =0; i<itemCount;i++) {
			itemID = in.nextInt();
			itemName = in.next();
			itemGPA = in.nextDouble();
			Student student = new Student(itemID, itemName, itemGPA);
			data.add(student);
		}
		
		for(Student stu: data){
			System.out.println(stu.id+":"+stu.name+":"+stu.gpa );
		}

		Collections.sort(data, new CustomComparator());
		
		System.out.println("######################### SORTED LIST ##########################");
		for(Student stu: data){
			System.out.println(stu.id+":"+stu.name+":"+stu.gpa );
		}

}
}
