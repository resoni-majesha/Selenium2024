package week1.day224;

import java.util.Arrays;

public class RemoveDuplicateValues {

	public static void main(String[] args) {
		
		int[] num = {12,78,56,90,12,87,45,90,34,27,87};
		
		/*// for loop - nested for loop
		// if condition
		
		// 12,78,56,90,12
		for (int i = 0; i < num.length; i++) { // Index starts from 0
			
			// 78,56,90,12,87,45,90,34,27,87
			// 56,90,12,87,45,90,34,27,87
			// 90,12,87,45,90,34,27,87
			// 12,87,45,90,34,27,87
			// 87,45,90,34,27,87
			for (int j = i+1; j < num.length; j++) { // Index starts from 1
				
				if(num[i] == num[j]) {
					System.out.println("Duplicate value is " +num[j]);
				}
				
			}*/
			
			// To print duplicates without nested for loop
			//sort
			
			Arrays.sort(num); // 12,12,27,34,45,56,78,87,90,90
			
			for (int k = 0; k < num.length - 1; k++) {
				
				if(num[k] == num[k+1]) {
					System.out.println(num[k+1]);
				}
				
			}
			
		}

	}

/*
12
87
90
*/