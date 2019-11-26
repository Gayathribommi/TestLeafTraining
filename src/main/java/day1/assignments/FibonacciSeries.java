package day1.assignments;

public class FibonacciSeries {
	
	/*
	 * Goal: To find Fibonacci Series for a given range
	 * 
	 * input(range): 8
	 * output: 0, 1, 1, 2, 3, 5, 8, 13
	 * 
	 * Shortcuts:
	 * 1) Print : type: syso, followed by: ctrl + space + enter
	 * 2) To create a 'for' loop: type 'for', followed by ctrl + space + down arrow + enter
	 *   
	 * What are my learnings from this code?
	 * 1)
	 * 2)
	 * 3) 
	 * 
	 */
	
	public static void main(String[] args) {
		
		// initialize 3 int variables (Tip: range & firstNum, secNum in the series)
		int range =6, firstNum =0, secNum=1;
		// Iterate from 1 to the range
		System.out.print(firstNum+", "+secNum);
		while (range>0) {
			int temp = secNum;
			secNum = firstNum + secNum;
			firstNum = temp;
			System.out.print(", "+secNum);
			range--;
			
		}
			// Print first number 
			
			// add first and second number
			
			// Assign second nuumber to the first number
			
			// Assign sum to the second number
			
		

	}

}
