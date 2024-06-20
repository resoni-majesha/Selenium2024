package week2.day2221;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListBasics {

	public static void main(String[] args) {
		
		//String[] mentors = new String[2]; // Array - String Array
		
		//mentors[0] = "Hari";
		//mentors[1] = "Sarath";
		//mentors[2] = "Naveen"; //Will throw ArrayIndexOutOfBoundException
		
		// Arrays.copyOf(null, 0); -> Line no:44 
		
		ArrayList<String> list = new ArrayList<String>(); // Specific size is not needed
		
		// Instead of ArrayList, we can also write List
		// List<String> list = new ArrayList<String>();
		
		// List<Object> list = new ArrayList<Object>(); // To add multiple datatype
		
		list.add("Hari");
	    // list.add(4); // This line can be added, if we use line no 24 i.e., Object in generic
		list.add("Sarath");
		list.add("Naveen");
		list.add("Bowya");
		list.add("Divya");
		System.out.println(list.size()); //5
		
		// Add more people
		list.add("Sheriba");
		System.out.println(list.size()); //6
		list.add("Krithi");
		System.out.println(list.size()); //7
		
		list.remove("Hari");
		System.out.println(list.size()); //6
		
		System.out.println(list.get(0)); // Sarath
		
		// To get all the data, use for loop
		
		for (int i = 0; i < list.size(); i++) {
			
			System.out.println(list.get(i));
		}

	}

}

/*
 *  String[] mentors = new String[2]; - Array - String Array
 *  Limitation of an Array - Predefined size
 *  eg: Yu buy a car with fixed size of seats
 *  Yu find a car which is flexible, so that yu can expand or shrink - Good options
 *  
 *  Problem with array is, array comes with predefined size
 *  
 *  Providing the size as 20 & giving only 5 values is not a good idea
 *  String[] mentors = new String[20];
 *  mentors[0] = "Hari";
 *  mentors[1] = "Sarath";
 *  mentors[2] = "Naveen";
 *  Until mentors[5];
 *  
 *  Yu are married & yu have limited money with yu -> Yu rent or build a house
 *  Initial days of yur marriage yu need how much room with limited money? Single bedroom
 *  After 2 years -> single kid -> Yu need 2 bedroom
 *  After 10 yrs -> 2 kids + Parents -> Three
 *  After 12 yrs -> 2 kids + Parents + In laws -> Four to five
 *  Things needs to be expandable over the time
 *  
 *  Unfortunately arrays cannot do that
 *  Or create a new array and write Arrays.copyOf();
 *  
 *  Dynamic Array
 *  To avoid that, we have a concept in Java called Dynamic Array, where sizes will grow & shrink based on your need
 *  eg: In future, houses become flexible, yu can make 4 bedroom & shrink it back to 2 bedroom
 *  
 *  Single Dimensional Array - List, Set
 *  Two Dimensional Array - Map
 *  
 *  List - It's an interface, not a class
 *  We can create object for class but not for interface
 *  We should create a class called ArrayList for Interface
 *  
 *  ArrayList
 *  Create an ArrayList & save it in new ArrayList
 *  ArrayList list = new ArrayList();
 *  Add mentors, which is of datatype string
 *  Array is of datatype String, so use generic <> -> to store the datatype of the particular class
 *  ArrayList<String> list = new ArrayList<String>();
 *  
 *  Here we are creating ArrayList which is like a dynamic array, where we don't need to specify the size
 *  When yu add data here, it will keep growing. When yu delete it, it will be deleted.
 *  If we want to add, we can add like, list.add("Hari");
 *  
 *  Here, no need to bother about the size, internally it will take the size and resize using "maxthreshold"
 *  
 *  Instead of ArrayList, we can also write List
 *  List<String> list = new ArrayList<String>();
 *  
 *  Multiple datatypes can be allowed, but we have to keep the super class. 
 *  Keep "Object" in generic instead of "String" to add any datatype
 *  List<Object> list = new ArrayList<Object>();
 *  
 *  To update a list, list.get(0) = "Sarath Kumar"; // It won't support here, for this yu need to use Set -> Will teach later
 *  
 *  To get all the data, use for loop
 *  
 *  Like array, this is also internally an Array
 *  To get the first person in the list, use get(0)
 *  
 *  add() - Method to add the data
 *  size() - Method to find the size
 *  remove() - Method to remove the data
 *  get(0) - To get the first person in the list
 *  
 */
