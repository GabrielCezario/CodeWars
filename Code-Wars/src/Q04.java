/* 6Kyu: Find The Parity Outlier
 * 
 * You are given an array (which will have a length of at least 3, but could be very 
 * large) containing integers. The array is either entirely comprised of odd 
 * integers or entirely comprised of even integers except for a single integer N. 
 * Write a method that takes the array as an argument and returns this "outlier" N.
 * 
 * https://www.codewars.com/kata/find-the-parity-outlier/train/java
 */

public class Q04 {

	static int find(int[] integers){
		
		int outlierImpar = 0;
		int outlierPar = 0;
		int contOutlierImpar = 0;
		int contOutlierPar = 0;
		
		if (integers.length > 2) {
			
			for (int i = 0; i < integers.length; i++) {
				
				if (integers[i] % 2 == 0) {
					outlierPar = integers[i];
					contOutlierPar++;
				} else {
					outlierImpar = integers[i];
					contOutlierImpar++;	
				}
				
			}
			
		}
		
		return (contOutlierImpar > contOutlierPar) ? outlierPar: outlierImpar;
	}
	
	public static void main(String[] args) {
		
	     int[] exampleTest1 = {2,6,8,-10,3}; 
	     int[] exampleTest2 = {206847684,1056521,7,17,1901,21104421,7,1,35521,1,7781}; 
	     int[] exampleTest3 = {Integer.MAX_VALUE, 0, 1};
		
		System.out.println(find(exampleTest1));
		System.out.println(find(exampleTest2));
		System.out.println(find(exampleTest3));
		
	}
	
}
