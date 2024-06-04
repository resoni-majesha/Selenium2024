package week1.day221;

import java.util.Arrays;

public class LearnArrays {

	public static void main(String[] args) {
		
		// int[] num = new int[3]; // declare array using new keyword
		
		/*
		 * num[0] = 10; // Array index starts with 0
		 * 
		 * num[1] = 20; 
		 * 
		 * num[2] = 30; // length - 1
		 * 
		 * num[3] = 40;
		 * 
		 * System.out.println(num.length); // Length to get the limit of the array
		 * 
		 * System.out.println(num.length - 1); // To get the last index length of the array
		 * 
		 * System.out.println(num[1]); 
		 * 
		 * System.out.println(num[0]); // to get the first data
		 * 
		 * System.out.println(num[num.length - 1]); // to get the last data
		 */
		
		/*
		 * for (int i = 0; i < num.length; i++) {
		 * 
		 * System.out.println(num[i]);
		 * 
		 * }
		 */	
		
		/*
		 * // To print in reverse order
		 * 
		 * for (int i = num.length - 1; i >= 0; i--) {
		 * 
		 * System.out.println(num[i]); }
		 */
	
		int[] num = {45, 95, 55};
		
		Arrays.sort(num);
		
		/*
		 * for (int i = 0; i < num.length; i++) {
		 * 
		 * System.out.println(num[i]); }
		 */
		
		for (int i = num.length -1; i >= 0; i--) {
			
			System.out.println(num[i]);
		}
	}

}

/*
95
55
45
*/