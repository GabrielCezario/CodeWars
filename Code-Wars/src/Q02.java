/* 7Kyu: Regex validate PIN code
 * 
 * ATM machines allow 4 or 6 digit PIN codes and PIN codes cannot contain 
 * anything but exactly 4 digits or exactly 6 digits.
 * 
 * If the function is passed a valid PIN string, return true, else return false.
 * 
 * https://www.codewars.com/kata/regex-validate-pin-code/train/java
 */

import java.util.Scanner;

public class Q02 {
	
	public static boolean validatePin(String pin) {
		return ((pin.length() == 4 || pin.length() == 6) && (pin.matches("[0-9]+")) ? true: false);
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um PIN de 4 a 6 dígitos possuindo apenas número: ");
		String pin = scan.next();
		
		System.out.println("Pin valido? " + validatePin(pin));
		
	}

}
