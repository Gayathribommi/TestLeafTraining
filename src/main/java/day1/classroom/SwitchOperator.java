package day1.classroom;

public class SwitchOperator {

	/*
	 * Goal: Perform calculation based on the user input operations
	 * 
	 * inputs: 2,3 and "add"
	 * output: added value: 5
	 * 
	 * Shortcuts:
	 * 1) Print : type: syso, followed by: ctrl + space + enter
	 * 2) To create a Switch case: type 'switch', followed by: ctrl + space + down arrow + enter
	 *   
	 * What are my learnings from this code?
	 * 1)
	 * 2)
	 * 3) 
	 * 
	 */	
	
	public static void main(String[] args) {
		
		// Declare 2 integer numbers
		
int a=2; int b=3;
		// Declare a String variable with input as operations (Tip:
		
String operations = "add";
		// Initiate switch case for operations
		switch (operations) {
		case "add":
			System.out.println("addition is:" + (a+b));

			break;
		case "subtraction":
			System.out.println("subtraction is:" + (a-b));

			break;

		case "multiply":
			System.out.println("Multiplication is:" +(a*b));

			break;
		case "division":
			System.out.println("Division is:" + (a/b));

			break;

		default:System.out.println("No operation performed");
			break;
		}
		
			// Within switch, include as case for add operation
		
		
			// Within switch, include as case for sub operation
		
		
			// Within switch, include as case for mul operation
		
		
			// Within switch, include as case for div operation
		
		
			// Within switch, include 'default' to handle other operations
		
		
		//end of switch case
		
	}

}
