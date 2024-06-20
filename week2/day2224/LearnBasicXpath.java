package week2.day2224;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnBasicXpath {

	public static void main(String[] args) {
	 
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");
		
		driver.findElement(By.xpath("(//input[@class='inputLogin'])[2]")).sendKeys("crmsfa");
		
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
           
	}

}

/*
 * Xpath - XML Path
 * When to use, when there is no id, name, className i.e., basic locators not available
 * XML path - address of the element in the DOM
 * How to write? Based on element path, syntax
 * Case Sensitive
 * 
 * Asking route for the origin to the destination - i.e., complete address from starting to the end (friend house)
 * Another one is landmark - like LIC building i.e., Landmark to the destination (landmark to friend's house
 * 
 * Absolute xpath - long path
 * Starts from <html> and end at target element
 * Starts with "/" and traverse through each and every tag to reach the required WebElement
 * Syntax: /html/body/div[2]/div/div/form/p/input
 * Rarely used in real time
 * If dev is changing the code, xpath won't work
 * 
 * Relative xpath
 * eg: Booking cab from Tambaram to Guindy
 * Goes directly to the address of the target Element
 * 
 * Relative Xpath
 * Basic Xpath
 * 1. Attribute based Xpath
 * 2. Text based Xpath
 * 3. Partial Attribute based xpath
 * 4. Partial Text based xpath
 * 5. Collection/Index based xpath
 * 
 * 1. Attribute Based
 * Uses attribute and attribute value of the WebElement in the DOM
 * Syntax: //tagName[@attribute='attributeValue']
 * Starts with // that locates the inner or middle part of the DOM
 * "//" denotes the current node
 * Attribute - attribute name
 * Facebook login button: //button[@name='login']
 * 
 * 2. Text Based
 * Based on the text displayed in the Webelement DOM
 * Syntax: //tagName[text()='textValue']
 * Snapdeal: For Home & Kitchen option - //span[text()='Home & Kitchen']
 * Ajio: Kids option- //span[text()='KIDS']
 * 
 * 3. Partial Match Xpath (Attribute)
 * Uses the partial attribute value of the WebElement
 * contains -> check for the given attribute
 * Syntax: //tagName[contains(@attribute,'Partial value of the attribute')]
 * Facebook: Password Field - //div[contains(@id,'pass')]
 * Amazon: Search field - //input[contains(@id,'twotab')]
 * 
 * 4. Partial Text Based Xpath
 * Uses partial text based Xpath
 * Syntax: //tagName[contains(text(),'Partial text in my DOM')]
 * Leaftaps: CRM/SFA - //a[contains(text(),'CRM')]
 * Amazon: Mobiles - //a[contains(text(),'ob')]
 * 
 * 5. Collection/Index Based Xpath
 * Where there is multiple matches found for a xpath
 * Uses index to match the exact element
 * Index starts with 1
 * Syntax: (//tagName[@attribute='attributeValue'])[index]
 * Index value should not go beyond 5, if dev make any changes it will be difficult to find 18th or 20th indices
 * Leaftaps: Username - (//input[@class='inputLogin'])[1]
 * 
 * Relative Xpath Syntax:
 * 
 * a.Basic xpath
 * 1. Attribute based xPath: 
 * Syntax: //tagname[@attributename='attributeValue'] 
 * Example: 
 * //button[@name='login']
 * //input[@id='username']
 * 
 * 2. Text based xPath: 
 * Syntax: //tagname[text()='textvalue'] 
 * Example: 
 * //span[text()='Home & Kitchen']
 * 
 * 3. Partial Attribute based xpath: 
 * Syntax: //tagname[contains(@attributename,'partialattributevalue')] 
 * Example: //input[contains(@class,'decorative')]
 * 
 * 4. Partial Text based xpath:
 * Syntax: //tagname[contains(text(),'partialtextvalue')]
 * Example: //a[contains(text(),'M/S')]
 * 
 * 5. Index based xpath:
 * Syntax: (//tagname[@attributename='attributeValue'])[2]
 * (//tagname[text()='textvalue'])[3] 
 * Example: 
 * (//input[@class='inputLogin'])[2]
 * index value should go beyond 5
 * 
 * If yu miss any single quotes/mistake in the syntax, it will throw InvalidSelectorException
 */
