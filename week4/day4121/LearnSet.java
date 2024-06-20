package week4.day4121;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class LearnSet {

	public static void main(String[] args) {
		
		// Set<String> values = new HashSet<String>(); // Empty set // Print the value in random order
		
		Set<String> values = new LinkedHashSet<String>(); // Print the value in Insertion order
		
		// Set<String> values = new TreeSet<String>(); // Print the value in ASCII order
		
		values.add("Maje");
		values.add("Reso");
		values.add("Milton");
		values.add("Mikah");
		values.add("Miloni");
		
		/*
		 * System.out.println(values.add("Maje")); // True
		 * System.out.println(values.add("Reso")); // True
		 * System.out.println(values.add("Milton"));
		 * System.out.println(values.add("Mikah"));
		 * System.out.println(values.add("Miloni"));
		 * 
		 * // Try to add a duplicate value 
		 * System.out.println(values.add("Maje")); // False
		 */
		
		// To get the number of data
		System.out.println(values.size());
		
		// To get all the values printed in the console
		for (String eachValue : values) {
			
			System.out.println(eachValue); 
		}
		
		System.out.println();
		
		// Create an empty list, pass the Set into list to copy
		List<String> listValues = new ArrayList<String>(values);
		
		for (String eachValue : listValues) {
			
			System.out.println(eachValue);
		}
		
		System.out.println(listValues.get(2)); // Now yu can use the get() method
		
		// Another way to copy Set into List
		// List<String> listValues = new ArrayList<String>(); // Don't pass the Set to the constructor
		// listvalues.addAll(values); // Use addAll() method and pass the Set value
	}
}

/*
* Set
* Set is an Interface
* Inherits collection interface -> Set implements Collection
* Set Implementation Classes - HashSet, LinkedHashSet, TreeSet
* Set doesn't allow duplicates
* It may/may not maintain insertion order (Depends on the implementation class - LinkedHashSet maintains the insertion order)
* LinkedHashSet - Insertion order
* HashSet - Random Order
* TreeSet - ASCII order
* ASCII order -> Search ASCII table in google -> There will be value for each characters
* Value for uppercase A is 65
* Value for lowercase a is 97 
* eg: Apple, apple 
* 
* We have 2 Maje -> When yu print, only one Maje will be printed and it will be the first Maje
* Because the return type of add() is boolean -> boolean means if the value is added successfully it will return true
* Else it will return false, as Set doesn't accept duplicate value, it will print the first value when we add duplicate values
* 
* Which is the fastest implementation class -> HashSet
* eg: If yu have 6 cubes, if yu take it randomly the process will be fast
* 
* get() method is not available in Set
* Set doesn't have index, coz when we use HashSet, there will be random order. So we cannot use get() in Set
* Inorder to use get() in Set, there are 2 ways
* Convert Set into List -> Copy Set into List, pass the Set into the List
* 
* Methods of Set Interface
* add() - To add the values
* size() - To get the number of data
* addAll() - To copy the values from one collection to the other -> Copy Set to List
*/