package week3.samplewrapper3221;

import org.openqa.selenium.WebDriverException;

public interface Wrapper {
	
	/**
	 * This method will launch the given browser and maximize the browser, set the wait for 30 sec & also load the given url
	 * 
	 * @author Resoni X Majesha - Mention the author
	 * @param browser - The browser of the application that is going to be launched
	 * @param url - The url with http or https
	 * @throws WebDriverException 
	 */
	
	// @param is the parameter that end user is going to pass
	// We need to set the exception when the function throws only this particular exception
	
	public void launchApp(String browser, String url); // On top of this we need to give method signature documentation
	// -> /** enter
	
	/** 
	 * 
	 * @param loc
	 * @param locVal
	 */
	
	public void locateElement(String loc, String locVal);

}

/*
* Based on this implementation, we need to write the code inorder to avoid duplicate method names
* Whenever yu start working on the test automation world, your first work will be yu have technically design
* At the framework level, yu have to design the interface
* It cannot be done by everyone, maybe the individual guy who is strong within your team assign the particular work to a person
* or some set of persons
* Once the interface is create like this, they should give the interface to the technical team -> Team Lead
* They should start writing the implementation of this interface function
* We need to write the logic for this interface in the class
* Create a class named base class
* If yu want to me the connection b/w the class and interface yu need to use the keyword called implements
* 
* We are going for interface for 2 reasons, one is for 100% abstraction
* Another is for achieving multiple inheritance
* 
* When yu write a method in interface, by default abstract will be included in the method signature
* By default it will be considered as abstract method
* There is no need of writing it manually
* public abstract void launchApp(String browser, String url);
* Your name Resoni, calling as hey human Resoni wont be good which is similar to 
* public abstract void launchApp(String browser, String url);
*/