package day2.classroom.array;

import java.util.Arrays;

public class FindSecondLargest {

	
	public static void main(String[] args) {

		// Here is the input
		int[] data = {3,2,11,4,6,7};
		Arrays.sort(data);
		for (int i = 0; i < data.length; i++) {
			//System.out.println(data[i]);
			
		}
		int value = data [data.length-2];
		System.out.println("The seond largest value is:" + value);
		
		
		/*
		 Pseudo Code:
		 1) Arrange the array in ascending order
		 2) Pick the last but one and print
		 */
			
			
		
		// Print the second largest number	
		
		
	}

}
