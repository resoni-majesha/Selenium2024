package week3.day3221;

public class LearnAbstraction {

}

/*
* Meaning of abstract - Incomplete, short information, something is there but I don't want to expose all
* Abstraction means hiding but not completely hiding, we are going to hide few portions
* There are 2 things to hide under the OOPS concept
* 1. Abstraction
* 2. Encapsulation
* Encapsulation vs Abstraction (Google it)
* Encapsulation -> We hide everything -> Data hiding & the implementation hiding
* Abstraction -> Hides something but not fully -> Hides the implementation but it shows the function
* 
* Abstraction - Information hide
* How to apply Abstraction in Java?
* 2 different ways
* 1. OOPS concept Abstraction - Using the abstraction technique we can hide something
* 2. Using interface
* When we use interface, we apply 100% of abstraction
* 100% we hide the implementation
* But when we use the abstraction, it would be 0 to 100 % -> 
* Either you fully hide the implementation or yu show/hide the implementation
* 
* Interface
* Blueprint of the class
* Similar to class, but it has the concept called abstraction
* Hides the implementation, which means it shows only the method signature
* Class{
*     public void getInfo() {
*     
*     }
* }     
* We cannot create object for the interface
* 
* What is the blueprint for the method signature?
*   public void getInfo(); // Interface doesn't allow yu to create the body
* It allows only to declare the method design
* 
* In Selenium, where interface comes,
* RemoteWebDriver implements WebDriver, JavascriptExecutor, HasCapabilities, Interactive, TakeScreenshot, HasVirtualAuthenticator
* which is an example of Multiple Inheritance
* Here the main interface is WebDriver -> If yu go inside the WebDriver Interface, it contains only the methods
*/