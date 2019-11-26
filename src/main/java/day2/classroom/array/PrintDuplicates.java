package day2.classroom.array;

import java.util.Arrays;

public class PrintDuplicates {

	
	public static void main(String[] args) {

		// Here is the input
		int[] data = { 1, 3, 8, 3, 11, 5, 6, 4, 7, 6, 7 };
		Arrays.sort(data);
		int count;
		for (int i = 0; i < data.length; i++) {
			count = 1;
			for (int j = 1; j < data.length; j++) {
				if (data[i]==data[j]) {
					System.out.println("i");
				}
			}
			
			}
			

		/*
		 Pseudo Code:
		 1) Arrange the array in ascending order
		 2) Loop through each array item
		 3) If the consecutive array items are same -> then print as duplicates
		 */
		
				
		// Print the second largest number	
		
		
	}

}

