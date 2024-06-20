package week4.day4121;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		String str = "Paypal India";
		
		char[] charArray = str.toCharArray(); // All the String will be converted to Array
		
		Set<Character> chars = new LinkedHashSet<Character>();
		
		for (Character eachCharacter : charArray) { // To add the charArray values
			
			chars.add(eachCharacter);
		}
		
		for (Character ch : chars) { // To remove duplicates
			
			// To remove the space
			if(ch!= ' ')
			
			System.out.print(ch);
			
		}

	}

}
