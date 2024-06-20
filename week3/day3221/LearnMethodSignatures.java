package week3.day3221;

public class LearnMethodSignatures {

	public void enterUserName() {
		
		System.out.println("Please enter the username");
	}
	
	void enterPassword() {
		
		System.out.println("Enter the password");
		enterAtmPin();

	}
	
	private void enterAtmPin() {
		System.out.println("Enter the ATM pin");
	}
	
	protected void onlyMyFamily() {
		System.out.println("My Family");
	}
	
//**********************************************************************************************************************************
	
	public int addTwoNum() {
		int a = 10;
		int b = 20;
		int c = a +b;
		return c; // Change the function datatype to int as c will return an integer
	}
		
	public String getData() {
	    
		return "Resoni";
	}
	
	/*
	 * public LearnMethodSignatures getClass() { return this; }
	 */
	
	public LearnMethodSignatures getClass1() {
		
		LearnMethodSignatures l = new LearnMethodSignatures();
		return l;
		
	}
	
	public void learnArray() {
		
		/*
		 * String[] data = new String[3]; data[0] = "Babu"; data[1] = "Sarath"; data[2]
		 * = "Gopi";
		 */
		
		Object[] data = new Object[3];
		data[0] = "Babu";
		data[1] = 10;
		data[2] = true;
				
		// User need to store String, integer value and also the boolean value, so here we need to write the class name as Object
		// Object is the super most class for all the data types
		
		
	}
	
}

/*
 * Method Signature
 * Two types
 * 1. Method Level Signature
 * 2. Class level Signature 
 * 
 * Method Level Signature - Set of rule book in Java to create the methods
 * Combination of accessModifier returnType methodName(){
 *                                              }
 * For some method signature the method needs the input
 * Whenever yu need to pass the input in any Java method, yu need to declare the argument (inside curly braces)
 * Declaring the argument: (dataType variable)
 * We can pass n number of arguments, pass the array, pass collection as argument, even we can pass another class as argument
 * To fetch the data, yu need to pass the element. So declare the argument
 * AccessModifiers is used to tell to whom I can show/hide the method
 * eg: Yu are the admin of the application. For admin we need to show some features which can't be displayed o normal users
 * 
 * 4 types: public, default or noModifier, private, protected at the method level
 * 
 * public - Anyone within the project can access the method
 * If the project has 4 different packages, if we declare any funtion as public in any of the class, 
 * then it can be accessed by any package
 * Create another class called CallAccessModifiers
 * Create an object for LearnMethodSignatures Class and call the method enterUserName
 * Now, lets move the CallAccessModifiers to another package, may be on yesterday's package
 * The CallAccessModifiers class is in another package now, it still can be accessed in other packages
 * So if yu declare the class as a public, we can access the public function in the same class, same package different class,
 * different package and the different class also
 * 
 * Next is no modifier -> Don't write any modifier -> void enterPassword() -> This is default or no modifier
 * Move CallAccessModifiers to the previous package
 * Accessibility of this modifier is we can access -> Now LearnMethodSignatures, CallAccessModifiers both in the same package
 * When we call the function in another class with same package, it can be accessed
 * So we can access in the same class, same package different class
 * Scope is within the package
 * 
 * private
 * Create a method named enter ATM pin
 * We can't show ATM pin to anyone. Can be told only to spouse. We need to declare this as private
 * So we cannot access this method outside the class, even we can't access in same package other class
 * We can access private function only within the class
 * 
 * protected 
 * Comes in super & subclasses 
 * Protected function will be displayed only within the family
 * Inherit LearnMethodSignatures
 * If yu declare the function as protected even if the class is outside of the package, it will show the protected function
 * Protected comes under child and parent concepts
 * We can access protected within the class, different class with the same package, 
 * different package with the different class when it comes under inheritance concept
 * Create another class CallFamilyMembers in another package and inherit LearnMethodSignatures and call the function onlyMyFamily()
 * When yu mouse over on any function that shows green circle then it is a public
 * Any function with yellow diamond then it is protected
 * Any function with blue triangle then it is default
 * Any function with red square then it is private
 * 
 * Write the function as public void Sample and then based on the code change the returntype
 * String is a class - public String getData() - We can also use class as return type
 * return this; -> 'this' will return the current class
 * return type can be non-primitive or the user defined class 
 * 
 * return statement has object
 * 
 * Class level Signature
 * public class LearnMethodSignature - public
 * We can write the class as default class also -> class LearnMethodSignature
 * So now this class will be accessed only within the package
 * We have only 2 modifiers at the class level -> public, default
 */
