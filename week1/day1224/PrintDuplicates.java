package week1.day1224;

import java.util.Arrays;

public class PrintDuplicates {

	public static void main(String[] args) {

		int[] num = { 2, 5, 7, 7, 5, 9, 2, 3 };

		/*
		 * Arrays.sort(num);
		 * 
		 * for (int i = 0; i < num.length-1; i++) {
		 * 
		 * if(num[i] == num[i+1]) { System.out.println(num[i+1]); }
		 * 
		 * }
		 */

		for (int j = 0; j < num.length; j++) {

			for (int k = j + 1; k < num.length; k++) {

				if (num[j] == num[k]) {
					System.out.println(num[k]);
				}

			}

		}

	}

}


/*
2
5
7
*/