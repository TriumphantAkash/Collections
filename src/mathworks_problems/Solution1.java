package mathworks_problems;


import java.util.ArrayList;

//reverse the word sequence in the string
public class Solution1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence = "My name is Khan";
		
		String[] words = sentence.split(" ");
		
		ArrayList<String>rev_words = new ArrayList<String>();
		
		for(String str: words) {
			rev_words.add(0, str);
		}
		
		System.out.println(rev_words);
		
		String answer = String.join(" ", rev_words);
		
		System.out.println(answer);

	}

}
