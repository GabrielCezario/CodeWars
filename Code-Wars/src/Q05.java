/* 7Kyu: Ones and Zeros
 * 
 * Given an array of one's and zero's convert the equivalent binary value to an integer.
 * 
 * Eg: [0, 0, 0, 1] is treated as 0001 which is the binary representation of 1.
 * 
 * https://www.codewars.com/kata/578553c3a1b8d5c40300037c/train/java
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q05 {
	
	public static int ConvertBinaryArrayToInt(List<Integer> binary) {
		int value = 0;
		int cont = binary.size() -1 ;
		int b[] = {1, 2, 4, 8, 16, 32, 64, 128};
		
		for (int i = 0; i < binary.size(); i++) {
			value += (binary.get(cont--) * b[i]);
		}
		
		return value;
    }
	
	public static void main(String[] args) {
		
		System.out.println(ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(0,0,0,1))));
		System.out.println(ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(1,1,1,1))));
		System.out.println(ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(0,1,1,0))));
		System.out.println(ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(1,0,0,1))));
		System.out.println(ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(1, 0, 1, 0, 1, 1, 0))));
		
	}

}
