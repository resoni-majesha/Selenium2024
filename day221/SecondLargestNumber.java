package week1.day221;

import java.util.Arrays;

public class SecondLargestNumber {

	public static void main(String[] args) {
		
		int [] data = {3,2,11,4,6,7};
		
		Arrays.sort(data);
		
		int len = data.length - 2;
		
		System.out.println(data[len]);
			
	}		
		
}

/*
7
*/