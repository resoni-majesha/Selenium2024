package week4.day4124;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateChar {

	public static void main(String[] args) {
		
		String value = "resonixmajesha";
		char[] ch = value.toCharArray();
		String output="";
		
		Set<Character> removechar = new LinkedHashSet<Character>();
        
		for (Character duplicate : ch) {
		
			removechar.add(duplicate); // Adding value
			
			
		}
		
		System.out.println(removechar); // Removing duplicate character
		
		for (Character character : removechar) { // To remove spaces
			output+=character; // return string value
		}
		
		System.out.println(output);
	}

}
