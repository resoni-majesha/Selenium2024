package week3.day3221;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnList {

	String name = "Resoni"; // For single variable
	
	String[] data = new String[3]; // Declaring objects for the array
	
	public static void main(String[] args) {
		
		// Create object for the list interface
		// List l = new List(); // Which is not possible, as list is the interface, we cannot create object
		
		// List ls = new ArrayList(); // List is the Interface, ArrayList is implementation class for List
		
		List<String> ls = new ArrayList<String>(); // Add the datatype in generic
		ls.add("Resoni");
		ls.add("Milton");
		ls.add("Mikah");
		ls.add("Maje");
		ls.add("Miloni");
		ls.add("Reso");
		
		// Get the list size
		System.out.println(ls.size());
		
		// To fetch single item from the list
		String name = ls.get(1);
		System.out.println(name);
		
		// To check the particular item available in the list
		boolean contains = ls.contains("Mikah");
		System.out.println(contains);
		
		// Add values in the runtime
		ls.add("Majesha");
		System.out.println(ls.size());
		
		// To check whether it maintains the order -> foreach will print each value
		for (String eachName : ls) { // eachName is the variable, whenever yu declare a variable in Java, 
			                         // yu need to declare the datatype, ls is the collection name
			System.out.println(eachName);
		}
		
		System.out.println(); // To provide space b/w each for loops
		
		// Check whether we can add duplicates
		ls.add("Maje");
		
		for (String eachName : ls) {
			
            System.out.println(eachName);  // Maje printed 2 times
        }
		
		System.out.println();
		
		// To remove the item from the list
		ls.remove(6);
		
        for (String eachName : ls) {
			
            System.out.println(eachName);   
        }
        
        System.out.println();
        
        // If yu add one more Maje, the first Maje will be removed, coz List is FIFO
        ls.remove("Maje");
        
        for (String eachName : ls) {
			
            System.out.println(eachName);   
        }
        
        System.out.println();
        
        // To remove all the names       
        // ls.clear();
        
        // To check whether all the items are removed
        // System.out.println(ls.isEmpty());
		
        // To reverse the list
        Collections.sort(ls);     // It will sort in alphabetical order
        
        for (String eachName : ls) {
			
            System.out.println(eachName);   
        }
	}

}

/*
* To create object for the interface
* Using the implementation class we can access which we declare inside the interface
* Here List is the interface
* All the collections in Java are implemented in java.util package
* We need to store the collection of names
* When yu want to store datatype in the collection, we need to mention <> in both sides -> <> which is called generic
* We need to mention the datatype in generic, we need to mention as String, we can now add only the string value
* List<String> ls = new ArrayList<String>(); -> Its an empty array now
* We need to add the data in the array, to add the names, use the method called add()
* add() function allows only to add the String values as we mentioned the generic as String
* 
* return type of the output changes based on the generic. so the return type of the get() is dynamic
* We can increase/decrease the array size at run time
* 
* Ascending, descending, shuffle, reverse orders are not possible in list as it maintains the insertion order
* To sort the list, use Collections class. It has many methods, reverse, sort, shuffle etc.,
* 
* Methods of List Interface
* add() - To add the values
* size() - to get the size of the entire collection
* get() - If yu have n number of data in the collection and yu want to fetch only one data
* contains() - To evaluate whether the particular item is already available in the list -> Case sensitive
* remove() - To remove the item from the collection - 2 ways - 1. Using index 2. Using item
* clear() - To remove all the items from the list
* isEmpty() - To check whether all the data is removed
*/