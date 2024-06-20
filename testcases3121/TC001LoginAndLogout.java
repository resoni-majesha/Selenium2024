package week3.testcases3121;

import org.testng.annotations.Test;

import week3.wrappers3121.SeleniumMethods;

public class TC001LoginAndLogout extends SeleniumMethods {
  
	   // public static void main(String[] args) {
	 
	 @Test
	 public void login() {
		   
		 launchApp("chrome", "http://leaftaps.com/opentaps/control/main"); 
		 // Provide different URL to open diff websites eg: google, FB
		 
		 // locateElement("id", "username");
		 // enterValue(ele, data);
		 enterValue(locateElement("id", "username"), "demosalesmanager"); // Go to line no:17
	     enterValue(locateElement("id", "password"), "crmsfa");
	     clickElement(locateElement("class", "decorativeSubmit")); // Login
	     clickElement(locateElement("class", "decorativeSubmit")); // Logout
	 }
}

/*
* Use the main method here
* We already wrote the logic to launch the browser in week3.wrappers3121 package -> public void launchApp(String url)
* Now, yu need to call the function 'launchApp' in TC001LoginAndLogout class
* We can call another class by using object or Inheritance
* 
* public static void main(String[] args) {
*          launchApp("http://leaftaps.com/opentaps/control/main"); // Throws error in TC001LoginAndLogout class
*  }
* i.e., main method is a static method
* static method does not allow non static method directly********
* 
* public void launchApp in SeleniumMethods is a non static method -> so launchApp throws error in TC0001 class
* Add static in the method of TC0001 class, public static void launchApp -> static method now
* 
* No need to create object, as we are using inheritance. There is no need of creating object
* If we create the object there is no need of using the extends keyword
* 
* Instead of that, remove the main method and write a normal method in TC001LoginAndLogout class
* public void login() -> Non static function
* So, the non static function directly allows the non static function
* 
* Now, create a main method. Run as -> Java Application will be seen
* If we remove main method, Run as -> Java Application wont be seen
* JVM doesn't understand this class belongs to what
* 
* We need to execute this code without main method
* So, here we need to use TestNG - TestNG is the Test Execution Framework
* Instead of main method, convert the login() method as TestNG 
* 
* To convert that, write @Test above the login() method in the TC0001LoginAndLogout class
* If yu right click this, it will show, Run as -> TestNG
* 
* To open different browsers, add another argument in StringBrowser in SeleniumMethods
* public void launchApp(String browser, String url)
* In TC0001 class, launchApp("Chrome","http://leaftaps.com/opentaps/control/main");
* If yu want to open Firefox browser, yu can change it as Firefox
* 
* To enter the value, write the method enterValue
* enterValue(ele, data);
* enterValue needs a WebElement
* So, before writing enterValue function, call the locateElement
* locateElement needs locator and locVal -> locateElement(locator,locVal) 
* locator for username is "id", locVal for username is "username" -> locateElement("id", "username")
* locateElement("id", "username") - Will return the WebElement
* Copy locateElement("id", "username") and replace ele with locateElement("id", "username")
* Call the locator id by username and pass the output as a variable and then enter the value "demosalesmanager"
* enterValue(locateElement("id", "username"), "demosalesmanager"); -> Add similarly for password
* 
* Write for clickElement(locateElement("class", "decorativeSubmit"));
* Write the same line for logout
* 
* the locator for username is id
*/