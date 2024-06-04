package week1.day124;

public class DataTypes {

	int age = 27; // Global variable
	
	public static void main(String[] args) {
		
		int noOfTab = 5; // local variable
		boolean pageLoaded = true;
		char pageName = 'R';
		String browserName = "Chrome";
		float versionName = 121.89f;
		long number = 7689876543L;
		
		System.out.println("No of tab opened" +noOfTab);
		System.out.println(pageLoaded + "\n" +pageName+ "\n" + browserName + "\n" + versionName + "\n" + number);
		
	}

}

/* Output:
	
	No of tab opened5
	true
	R
	Chrome
	121.89
	7689876543

*/

/*
 * Datatypes
 * Type of the value the variable is holding here
 * Provide memory, operations specific to data type
 * 
 * 2 types - Primitive, non primitive
 * Primitive - Pre defined datatype - Int(Byte -1, short-2, int-4, long-8 mob no), 
 * float(float-4 - fractional, 6 to 7 deci, double-8 - 15 deci), Char -2, Boolean -1
 * Non primitive - String & Array
 * 
 * Most commonly used datatype in Selenium 
 * int, boolean, char
 * 
 * 
 */

// dataType variable = value;
// variable created inside main method is called local variable
// Outside main method is global variable