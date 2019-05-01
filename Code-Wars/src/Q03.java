/* 7Kyu: Make a function that does arithmetic!
 * 
 * Given two numbers and an arithmetic operator (the name of it, as a string), 
 * return the result of the two numbers having that operator used on them.
 * 
 * a and b will both be positive integers, and a will always be the first 
 * number in the operation, and b always the second.
 * 
 * The four operators are "add", "subtract", "divide", "multiply".
 * 
 * Try to do it without using if statements!
 * 
 * https://www.codewars.com/kata/583f158ea20cfcbeb400000a/train/java
 */

public class Q03 {
	
	public static int arithmetic(int a, int b, String operator) {
	    int number = 0;
	    
	    switch (operator) {
		case "add":
			
			number = a+b;
			break;
			
		case"subtract":
			
			number = a-b;
			break;
			
		case"multiply":
			
			number = a*b;
			break;
			
		case"divide":
			
			number = a/b;
			break;
		}
	    
	    return number;
	}
	
	public static void main(String[] args) {
		
		System.out.println(arithmetic(10, 2, "add"));
		System.out.println(arithmetic(10, 2, "subtract"));
		System.out.println(arithmetic(10, 2, "multiply"));
		System.out.println(arithmetic(10, 2, "divide"));
		
	}

}
