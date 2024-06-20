package week3.day3221;

public class LearnCollections {
	
	public static void main(String[] args) {
		
		String name = "Resoni"; // To store a name

		// To store a set of names
		String[] data = new String[3]; 
		// Array size is fixed as 3
		data[0] = "Mikah";
		data[1] = "Maje";
		data[2] = "Milton";
		data[3] = "Miloni"; // ArrayIndexOutOfBoundException
	}	
}

/*
 * Its not possible to add the data into the array during runtime
 * Its not possible to remove the data from the array during runtime
 * Yu cannot increase/decrease the array size at runtime
 * To solve this issue a new concept is introduced in Java called collection
 * Collection
 * Collection helps us to store the collection of values inside the array
 * It not array, its the next dimension of arrays, its the dynamic arrays
 * It help us to increase /decrease the array size at runtime
 * Collection is the interface, its the super interface -> Iteratable is the supermost interface for collection
 * It has 3 sub interfaces
 *                                                       Collection
 *                                                       
 *                  List                                    Set                                    Map
 *                  
 * List, Set, Map are the sub interfaces of collection
 * Why 3 different sub interfaces?
 * 
 * List, Set are Single dimensional array
 * Map - Multi dimensional array
 * Why 2 different single dimensional array
 * 
 * List:
 * It an extension of the array that allow us store collection of values into a single variable
 * Collect all the names and store it in a list
 * Properties:
 * Allows duplicate
 * Maintains the insertion order
 * If the above two property matches, we needs to use the list
 * List Implementation Classes: ArrayList, LinkedList
 * 
 * Set:
 * Properties
 * Doesn't allow duplicate (only unique value) -> Instead of collecting names, collect email -> email is not duplicate, AAdhar/ PAN no
 * If yu collect lot of values, and the value is not duplicate then yu can choose Set
 * It doesn't maintain order, it maintain order sometimes, based on the implementation class
 * Set Implementation Classes: HashSet, TreeSet, LinkedHashSet
 *  
 * Whenever yu write the code or when yu have requirement to store collection of values under single variable 
 * where value may be increased, values might be stored at the runtime, yu need to use the collection
 * Check whether the data is single dimension/multi dimension, if it is single dimension use List/Set
 * If the storing data allows duplicate, choose List, if the storing value is unique go for Set
 * 
 * List, Set are interfaces. Each interface must have the implementation class, 
 * we need to know what are the implementation class available for these interfaces - Line no: 44
 * List Implementation Classes: ArrayList, LinkedList
 * Set Implementation Classes: HashSet, TreeSet, LinkedHashSet
 * Those are the inbuilt class in Java
 * Single interface has multiple implementation class 
 * Using implementation classes we can create the Object for List, Set
 * 
 * Methods Implemented in List Interface:
 *                  
 */
