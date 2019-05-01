/* 7Kyu: Credit Card Mask
 * 
 * Usually when you buy something, you're asked whether your credit card 
 * number, phone number or answer to your most secret question is still 
 * correct. However, since someone could look over your shoulder, you don't
 * want that shown on your screen. Instead, we mask it
 *  
 * Your task is to write a function maskify, which changes all but the last four characters into '#'.
 * 
 * https://www.codewars.com/kata/credit-card-mask/train/java
 */


public class Q07 {
	
	public static String maskify(String str) {
		
		String aux = "";
		
		if (str.length() > 4) {
			
			for (int i = 0; i < str.length() - 4; i++) {
				aux += '#';
			}
			
			for (int i = 4; i > 0; i--) {
				aux += str.charAt(str.length() - i);
			}
			
			return aux;
			
		} else {
			return str;
		}
		
    }
	
	public static void main(String[] args) {
		
		System.out.println(maskify("4556364607935616"));
		System.out.println(maskify("64607935616"));
		System.out.println(maskify("1"));
		System.out.println(maskify(""));
		System.out.println(maskify("Skippy"));
		System.out.println(maskify("Nananananananananananananananana Batman!"));
		
	}

}
