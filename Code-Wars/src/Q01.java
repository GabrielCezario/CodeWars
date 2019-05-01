/* 7Kyu: Is this a triangle?
 * 
 * Implement a method that accepts 3 integer values a, b, c. The method should return true if a 
 * triangle can be built with the sides of given length and false in any other case.
 * 
 * (In this case, all triangles must have surface greater than 0 to be accepted).
 * 
 * https://www.codewars.com/kata/56606694ec01347ce800001b/train/java
 */

import java.util.Scanner;

public class Q01 {
	
	public static boolean isTriangle(int a, int b, int c) {
		boolean validation = false;
		
		if (a + b > c && b + c > a && c + a > b) {
		    validation = (a > 0 && b > 0 && c > 0)? true: false;
		}
		
		return validation;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor: ");
		int a = scan.nextInt();
		
		System.out.println("Digite o segundo valor: ");
		int b = scan.nextInt();
		
		System.out.println("Digite o terceiro valor: ");
		int c = scan.nextInt();
		
		System.out.println("É um triangulo? " + isTriangle(a, b, c));
		
	}

}
