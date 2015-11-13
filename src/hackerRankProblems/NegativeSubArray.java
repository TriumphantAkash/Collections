package hackerRankProblems;

import java.util.Scanner;

public class NegativeSubArray {
	static int majorCount = 0;

	public static void main(String[] args) {

		// Scanner in = new Scanner(System.in);
		// int length = Integer.parseInt(in.read());

		try {
			Scanner in = new Scanner(System.in);
			int length = in.nextInt();

			int[] actualNumbers = new int[length];
			for (int i = 0; i < length; i++) {
				actualNumbers[i] = in.nextInt();
			}
			/*
			 * int i=0; for (String item: numbers1) { actualNumbers[i] =
			 * Integer.parseInt(item); }
			 */

			for (int j = 0; j <= length - 2; j++) {
				int sum = actualNumbers[j];
				for (int k = j + 1; k <= length - 1; k++) {
					sum = sum + actualNumbers[k];
					if (sum < 0) {
						majorCount++;
					}
				}

			}
			
			for(int x: actualNumbers){
				if(x<0){
					majorCount++;
				}
			}

			System.out.println(majorCount);
		} catch (Exception e) {
			System.out.println("some error occured");
		}

	}

}
