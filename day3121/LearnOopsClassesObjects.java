package week3.day3121;

public class LearnOopsClassesObjects {

	public static void main(String[] args) {
		

	}

}

/*
* OOPS - Object Oriented Programming Language 
* Java is the Object Oriented Programming Language
* Python - OOPS 
* 1. Object - Is the reference of the class
* 2. Class - Is the blueprint of an object
* 3. Inheritance
* 4. Polymorphism
* 5. Abstraction
* 6. Encapsulation
* 
* C language - Structured Programming language
* eg: fly(){
* travel_to_airport();
* find_checkin_counter();
* checkin();
* pass_security_check();
* wait_for_boarding_cell();
* board_the_flight();
* wish_the_airhostess();
* takeoff();
* havefun();
* landing();
* }
* 
* Where ever we travel, we follow the same above structure
* If we miss any function, it will impact the entire process
* 
* Write the same code for OOPS
* 
* Aeroplane                      Airhostess           Passenger              Airport
* Data:                          Data:                Data:                  Data:
* airline, type, position        name, address        name, address          flight, parking, atm
* 
* Actions:                       Actions:             Actions:               Actions:
* takeoff(), cruise(), land()    wish(), serve()      takeCab(),walk()       checkin(), announcement()
*                                                     checkin(), smile()
*                                                     
* In OOPS, we create the template for the Airport, from the airport perspective what are the things that we generally do
* We have methods, variables, constructors inside the class                                 
* variable - Property of the particular class
* In Airport - flight, parking, atm, trolley are the variable i.e., property
* 
* Any action/behavior which is related to the particular class can be written as Java method
* In Airport - checkin(), announcement() is the action / methods
* We create Airport as a template, its not the original class/construction
* We create the blueprint because someone might create object for this class, then they use this function in thier project
* 
* Same template can be used for all the person who travel, why should we create a same function again & again
* It's not needed. So we created 4 classes based on the scenario
* I need to travel to US, someone else need to travel to Germany
* So I need to hear announcement related to US
* Someone else need to hear the announcement related to Germany
* Once we create the class, anyone can construct the object (like for US one object,someone will create different object for Ger)
* Then based on that object, we can do our action
* 
* Lets imagine the class is the bicycle. Class is like a blue print
* If yu want to access anything from the class, yu need to create the object
* Once we create a class, we can create 'n' number of object using the same class
* Here there are 3 objects, all the 3 objects can use the bicycle class
* 
* Properties (Variables) in bicycle - seats, wheels, bells, pedal
* Actions (Methods) - changeSpeed(), changeGear(), changeColor()
* 
* Java is a static programming language, whenever you declare a variable, yu should mandatorily mention the datatype
* String name = "Resoni"; // Here name is the static variable
* Here we won't be able to store integer value, thats why it is called static programming language
* 
* driver = new ChromeDriver();
* We declare the variable driver and creating the object and store it in the driver variable
* When yu call the new ChromeDriver internally it allocates the memory location and assign the memory location to driver variable
* Actually driver is a variable but it stores the object, so we call this as object
* It is static, so we need to mention the datatype
* As it holds the information of the ChromeDriver, so we take as ChromeDriver driver = new ChromeDriver();
* 
*/