package week1.day1224;

import java.util.Arrays;

public class LearnArrays {

	public static void main(String[] args) {
		
		int[] num = {12,45,32,56,13,44,67,42};
		
		System.out.println("First Index " +num[0]);
		
		int length = num.length;
		System.out.println("Total length of the array " +length);
		
		System.out.println("Last index value " +num[length - 1]);
		
		System.out.println(num.length - 1);
		
		Arrays.sort(num);
		
		System.out.println("After sorting the last index value " +num[length - 1]);
		
		for (int i = 0; i < num.length; i++) { // Ascending Order
			
			System.out.println(num[i]);
			
		}
		
		

	}

}

/*

First Index 12
Total length of the array 8
Last index value 42
7
After sorting the last index value 67
12
13
32
42
44
45
56
67
*/


/*
 * Arrays are not used in Selenium. Its for interview purpose
 * Array is a data structure
 * Array is fixed in length
 * Used to store multiple values of same datatype
 * And stored in consecutive memory location
 * 2 ways to implement array
 * 
 * Array literal
 * Syntax 1: type name[] = {values};
 * Syntax 2: type[] name = {values};
 * 
 * eg: int[] scores = {98,34,67,80} // Index - 0, 1, 2, 3
 * 
 * Array works based on the index
 * Array index starts with 0
 * 
 * To store 75 names in a single variable
 * String[] = {"","","",}
 * 
 * Using instantiation
 * Syntax 1: type name[] = new type[size];
 * eg: int[] scores = new int[5];
 * score[0] = 98, score[1] = 34
 * 
 * Literal - Based on data
 * Instantiation - Based on size
 */