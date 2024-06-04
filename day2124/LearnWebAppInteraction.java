package week2.day2124;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebAppInteraction {

	public static void main(String[] args) throws InterruptedException {
		
        ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		// Enter the username
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		
		// Enter the password
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		// Click on login
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		// Click on CRMSFA
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		// driver.findElement(By.partialLinkText("CRM")).click(); // Partial Link text
		
		// To get title of the current page
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		// Verify the title
		
		if(title.contains("Home")) {
			
			System.out.println("Title Verified");
		} else {
			
			System.out.println("Title is not verified");
		}
		
		// Java Wait
		
		Thread.sleep(3000); // It will wait for 3 secs and close the browser (3000 milli secs)
		
		driver.close();
		
	}

}

/*
 * Selenium interact with web application through HTML Document - DOM
 * DOM - Document Object Model - HTML doc represents as tree like structure
 * contains attribute contains element, attribute, piece of document
 * To open DOM structure - Right click > Inspect Element
 * 
 * Axis Bank - Right click won't work
 * To open, press F12 or Function + F12
 * Other options to open DOM structure
 * Ctrl+shift+I
 * Click on 3 dots in the top right > Developer Tool
 * 
 * document
 * <html>
 *     <head>
 *         <title> My Title
 *            <body> 
 *              <h1> Heading
 *                <a> element
 *                  <href> attribute -------- Missing
 *              
 * Tags: 
 *  <html> - Root of webpage
 *  <a> - Defines a hyperlink - Should have a tag, href hyperlink & text should be presented
 *  <button> - Defines a clickable button
 *  <div> - Defines a section in a document
 *  <iframe> - Defines an inline frame
 *  <img> - Defines an image
 *  <input> - Defines an input control
 *  <option> - Defines options of the dropdown list
 *  <select> - Defines a dropdown list
 *  <span> - Defines a section in the document
 *  <table> - Defines the table  
 *        
 * Tag name can be differ from developer to developer
 * Diff div/Span
 * Div - larger part will be divided to smaller part
 * Span - Style, color related code will be given
 * 
 * <label for ="password" Password </label>
 * Purple - tagName - label
 * Brown/Orange - Attribute name - for
 * Blue - Attribute value - password
 * Black - Text on the element - Password
 * 
 * Selenium Locators
 * 
 * id - To find the element using id attribute of the element
 * name - using name attribute
 * className - using class attribute
 * tagName - using tag name of the target element
 * linkText - text of the webelement having <a> tag
 * partialLinkText - link text with partial match
 * xPath - Find the dynamic element and traverse b/w various element of the webpage
 * cssSelector - Rarely used --------------Missing
 * 
 * Basic Locators - id, name, className, linktext
 * Xpath - xml path - uniquely identify/address part of an xml document
 * To navigate through a page's HTML structure and locate the element
 * 
 * Syntax: driver.findElement(By.locator("attribute value"));
 * 
 * When/not to use locators
 * id - Always(Most Preferred), Don't use when it has numbers
 * name - Use when "id" doesn't exist, dont use when it has duplicate name
 * className - Use when class is unique without white spaces, dont use when it has white spaces, duplicate
 * linkText - Use if it is a link, dont use when it has duplicate
 * tagName - Use for collections of objects, dont use when it has duplicate
 * Xpath - Use if none of the above works, dont use when Xpath can change
 * csslocator - This is the last option yu have - CSS can change - Rarely used
 * 
 * Selenium Methods
 * sendKeys() is the method to pass the input value
 * click() - used to click on the button
 * getTitle() - used to get the title of the page
 * title.contains() - to verify the title of the page using if condition
 * 
 * To slow down the process, use java wait
 * Thread.sleep(3000);
 * In main function line, add "throws InterruptedException"
 * 
 * Selenium Exceptions
 * When locator name / locator value is provided wrong, it will throw NoSuchElementException
 * 
 * if you not FB account ,go with this                                
 * https://login.salesforce.com/?locale=in
 * username : radhakrishnan@testleaf.com
 * password : Sparrow@123
 * 
 * 2 missing
 * 
 */
