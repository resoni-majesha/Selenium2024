package week3.day3121;

public class LearnOverloading {

	public String getName() {
		return "Resoni X Majesha";

	}
	
	/*
	 * public String getSecName() {
	 * 
	 * String[] name = {"Babu", "Naveen", "Sam", "Bala", "Divya", "Hari"}; 
	 * return name[1]; }
	 */
	
	public String getName(int index) { // Pass index at runtime
		
		String[] name = {"Babu", "Naveen", "Sam", "Bala", "Divya", "Hari"};
		return name[index]; // Return the index here

	}
	
	/*
	 * // Explanation 2
	 * 
	 * public String getName(String Course) { 
	 * 
	 * return "Resoni X Majesha";
	 * }
	 * 
	 * public String getName(int index) {
	 * 
	 * String[] name = {"Babu", "Naveen", "Sam", "Bala", "Divya", "Hari"}; 
	 * return name[index];
	 * 
	 * }
	 */
	
	public static void main(String[] args) {
		
		String name = new LearnOverloading().getName();
		System.out.println(name);
		
		String name1 = new LearnOverloading().getName(1);
		System.out.println(name1);
	}
}

/*
* Polymorphism
* Poly - Many, Morph - Forms -> Poly + Morph - Many Forms
* 2nd OOPS concept in Java
* Two types
* 1. Compile Time Polymorphism - Overloading
* Using Overloading we can achieve Compile time polymorphism
* 2. Run Time Polymorphism - Overriding
* Using Overriding we can achieve run time polymorphism
* 
* Compile Time Polymorphism
* Create a method getName and return name
* Create another method getSecName and return name
* Here we need to declare a String of array and get the second value
* So, if yu want to get the 3rd, 4th names and so on it won't be a good idea to create third, fourth etc methods to get the names
* Now, we need to use, same method names (getName) for the two methods. but it will not accept the same method signature
* Here 1st getName method contains only one value and the second getName contains collection of values
* We need to fetch only one value from the collection of values, we keep the same method name. which is not accepted by Java
* So write like, whatever index we pass as argument in the second getName method, it should return the index value
* So pass the index at the runtime
* So if we pass 0, it will return babu, for 1, Naveen and so on
* So, when we put same method name, it will throw error
* When we put same method name with different argument, which is accepted
* Polymorph - Need to get the name with different arguments
* This is called Method overloading
* In same class, method name is same, but the number of arguments vary then it is called method overloading
* Now, call the two methods in main method
* Create the object and store it in String as it will return String
* String name = new LearnOverloading().getName();
* syso(name);
* Create another object for the another method and store it in name1
* Definition 2: The method name is same, number of argument is also same, but the datatype of the argument differs 
* then it is also called method overloading
* Why this concept is important?
* Because, if we create n number of methods to get the name, i.e., getFirstName, getSecName, getThirdName etc.,
* then in real world, when we write the framework, we need to write n number of framework and 
* it won't be possible to remember all the method names. So we need to reduce the method signature
* Now, when we call the getName, it will show, getname(), getname() with 1 argument, getName() with String argument
* everything will be displayed in the main method in the object creation -> new LearnOverloading().getName(); 
* We need to choose the right one
* Where is it implemented in Selenium?
* Frames concept
* driver.switchTo().frame(int index)
* driver.switchTo().frame(String nameOrId)
* driver.switchTo().frame(WebElement frameElement)
* Here, it has same method name, same no. of arguments but the data type of the argument differs
*/