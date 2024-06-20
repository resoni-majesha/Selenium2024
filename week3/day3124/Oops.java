package week3.day3124;

public class Oops {

	public static void main(String[] args) {
		

	}

}

/*
* Binding the data and functionalities together using the classes & Objects
* Why OOPs -> Used to improve coding standards and performance
* How to implement in Selenium -> Using 4 pillars
* Allows yu to package together data states & functionality to modify those data states while keeping the details hidden
* eg: Bulb -> Is in on state, we will go to the shop and check the fatures but we will not break it and check it
* 4 pillars -> Abstraction, Inheritance, Polymorphie=sm, Encapsulation
* Abstraction -> Show the details that your user like to see and not the unimportant features
* Inheritance -> Because the class can inherit attributes and behaviours from another class yu are able to reuse more code
* Polymorphism -> One class can be used to create many objects all from the flexible piece of code
* Encapsulation - In OOP, yu bundle code into single unit where yu caan determine the scope of each piece of data
* 
* Inheritance
* It is concept of building relationship b/w two similar classes (parent to child)
* To have common functions
* To avoid duplicate implementations
* To reduce the code
* It can be applied to any similar types
*   1. Class to class
*   2. Interface to Interface
* Eg: Mr.Bean
* Mr. bean grandfather has 2 villas -> Grandfather / Super / Base class
* Mr. Bean Father -> 1 house -> My Father Class
* To get the property from parent use the keyword called 'extends'
* Mr. Bean has 1 house -> My Class
* I extends My Father extends My Grandfather -> Now, Mr. Bean will have 4 properties
* Without extends we will not be able to get the properties from the parent
* We should not skip any of the generations
* 
* Another example
*                                                     Vehicle
*                                                     
*                Car                                                                                   Auto
*                
*  BMW                            Audi                                                                Bajaj  
*  
* Vehicle is a grandparent class
* Car and auto are Child classes
* BMW, Audi, Bajaj are grandchild classes
* 
* Types:
* 1. Simple Inheritance -> One parent - one child - Child Inherits from one parent class
* 2. Multi level Inheritance -> One parent - one child - one grandchild
* 3. Multiple Inheritance - 2 parent 1 child - Does not supporeted in Java
*          We cannot use multiple inheritance in the class level, but can be used in interface level
* 4. Hierarchial - one parent - Multiple child
* 5. Hybrid - One parent - Multiple child - One child for one of the multiple child
* 6. Multipath - Not supported in class level
* 
*/