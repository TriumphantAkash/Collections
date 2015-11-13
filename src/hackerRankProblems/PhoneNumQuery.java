package hackerRankProblems;
	
	import java.util.Scanner;
	import java.util.Map;
	import java.util.HashMap;
	import java.util.ArrayList;
	
	class Contact {
		private String name;
		private int number;
		
		public Contact(String name, int number) {
			this.name = name;
			this.number = number;
		}
	
		public String getName() {
			return name;
		}
	
		public void setName(String name) {
			this.name = name;
		}
	
		public int getNumber() {
			return number;
		}
	
		public void setNumber(int number) {
			this.number = number;
		}
		
		
	}

public class PhoneNumQuery {

	static ArrayList<String>queries = new ArrayList<String>();
	static Map<String, Integer>data = new HashMap<String, Integer>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		int entryCount = in.nextInt();
		in.nextLine();
		String name;
		int number;
		for(int i =0;i<entryCount; i++) {
			name = in.nextLine();
			number = in.nextInt();
			
			data.put(name, number);
			in.nextLine();
		}
		while(in.hasNext()){
			queries.add(in.nextLine());
		}
		
		//in.close();

		int number1;
		for(String query:queries) {
			number1 = data.get(query);
			if(data.containsKey("query")) {
				System.out.println(query+"="+number1);
			}else{
				System.out.println("Not found");
			}
		}
	}

}
