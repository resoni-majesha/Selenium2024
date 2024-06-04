package week1.day224;

public class LearnMethods {
		
		// type method name - ctrl space - change it into public, by default it will be private
		public void browser() {
			
			System.out.println("Chrome");
		}
		
		private int browserVersion() {
			return 121;
		}
		
		public int browserValue(int a, int b) {
			
			return a + b;
		}


      public static void main(String[] args) {
    	  
    	  // ClassName ObjName = new ClassName(); Last classname is constructor
    	  LearnMethods method = new LearnMethods();
    	  
    	  // objName.Methodname
    	  method.browser();
    	  
    	  int browserValue = method.browserValue(5, 6); // ctrl+2, release, Press L, choose the second option
    	                                                // to assign the called method
    	  System.out.println(browserValue);
    	  
    	  // System.out.println(method.browserVersion()); Another method to call a method
    	  
    	  System.out.println(method.browserValue(5, 9));

      }
      
}   

/*

Chrome
11
14

*/

/*
* Method perform action or verification
* Perform particular action to be executed
* 
* Accessmodifier ReturnType MethodName(InputArguments){
* 
* }
* Public - Access modifier - visibility of the function
* void - Return type 
* main - method name - Primitive / non primitive datatype
* Strings[] args - input arguments 
* 
* Access modifier - Public, Protected, Default(Package), Private
* eg: Posting pic in instagram - Public / Protected(only limited access(friends)
* Private - Only you can see
* Default - Common for all - Bio, name etc
* FB - Only me - Private, Friends - Protected
* 
* Access Modifier
* All 4 access modifier can be able to acces in the same class, diff class, diff package
* If yu are use different class, yu wont be able to use private, Public, protected can be used - Same package
* Different package - Public, protected can be used, Default private can't be used. 
* eg: Insta bio can't be viewed in FB
* Selenium uses public access modifier - 99%
* 
* Same class - Public, protected, default, private
* Same Package - Public, Protected, default
* Different Package - Public, Protected
* Different Project - Public
* 
* Return Type - Primitive(int, boolean, char) & Non - Primitive (String), void - Returns nothing
* 
* Method name - Should be meaningful, starts with lower case
* 
* Input Arguments - Data needed for the method to work, Can have - no args, single/ multiple args, primitive, 
* non primitive or mix of both
* eg: int a, int b
* 
* 
* How to call a method 
* Using object
* 
* ClassName object = new ClassName();
* 
* Its not mandatory to call all the methods
* Methods can be reused in multiple classes, that why we are creating multiple objects & methods
* 
* We cannot create methods in main method
* Can create only inside the class
*/ 