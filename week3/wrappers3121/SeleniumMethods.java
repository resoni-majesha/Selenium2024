package week3.wrappers3121;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumMethods {

	// ChromeDriver driver; // Wont be applicable for all browsers. So use RemoteWebDriver - Which is the supermost class
	   
	    RemoteWebDriver driver;
	
	// launchBrowser, loadUrl, maximize, setWait
	public void launchApp(String browser, String url) { // This method is to add the above methods
		
		if(browser.equalsIgnoreCase("chrome")) { // if browser is chrome, perform this action. //ly for other browsers
			
			// ChromeDriver driver = new ChromeDriver(); // Copy ChromeDriver driver; and make it globally - Go to line no: 11
			// Remove ChromeDriver
			
			driver = new ChromeDriver(); 
			// ChromeDriver driver = new ChromeDriver(); & driver = new ChromeDriver(); both are same
			
		} else if(browser.equalsIgnoreCase("firefox")) {
			
			// FirefoxDriver driver = new FirefoxDriver();
			
			driver = new FirefoxDriver(); // If we write ChromeDriver driver = new FirefoxDriver(); -> Will make a conflict
			// So, change ChromeDriver driver; to RemoteWebDriver driver;
			// RemoteWebDriver driver is the Supermost class for all driver
		}
		
		// Initial steps
		
		// ChromeDriver driver = new ChromeDriver(); // Add this line inside for loop - Go to line no: 20
		
		driver.get(url);    // URL is not only for leaftaps. This application is common for all
		
		// Pass the arguments in the method, wherever we call the function launchApp in the testcase
		// from that place pass which URL that yu want to use, from that argument it will pass it to the parameter
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); 
		// This function can be used for any URL
		
		System.out.println("Chrome browser launched successfully"); // Print the status	
	}
	
	// To find the element based on any locator (findElement)
	public WebElement locateElement(String locator, String locVal) {
		
		// driver.findElement(By.id(""));
		switch (locator) {    
		case "id": return driver.findElement(By.id(locVal));
		case "name": return driver.findElement(By.id(locVal));
		case "class": return driver.findElement(By.id(locVal));
		case "xpath": return driver.findElement(By.id(locVal));	
		}
	  	return null;
	}
    
	// Enter the value
	public void enterValue(WebElement ele, String data) {
		 
		// driver.findElement(By.id("")).sendKeys("");
		ele.sendKeys(data);
		System.out.println("The Data "+ data +" entered successfully");
	}
	
	public void clickElement(WebElement ele) {
		
		// driver.findElement(By.id("")).click(); 
		// Remove driver.findElement(By.id("")), pass the WebElement as argument and write ele.click();
		
		ele.click();
		System.out.println("The element is clicked successfully");
		
	}

}


/*
* After Inheritance
* As this is connected to inheritance, it is introduced here
* What we learned is level one
* Now we are moving to level 2 of learning
* 
* Level 1
* driver.findElement(By.id(""));
* 
* Level 2
* Create a package called wrappers - I created week3.wrappers3121. This is the starting point of framework
* Create a class SeleniumMethods in week3.wrappers3121 package
* Intent of creating this class is all the common action that yu performing any browser or any URL are going to written here
* in a reusable form
* Steps: launchBrowser, loadURL, maximize, setWait - these actions are common for all the testcases
* 
* Now, create a common function for all these activities
* 
* Create another package named Testcases (week3.testcases3121) and create a class named TC001LoginAndLogout
* 
* public void launchApp in SeleniumMethods is a non static method -> so launchApp throws error in TC0001 class
* Add static in the method of TC0001 class, public static void launchApp -> static method now
* 
* To open different browsers, add another argument in StringBrowser in SeleniumMethods
* public void launchApp(String browser, String url)
* In TC0001 class, launchApp("Chrome","http://leaftaps.com/opentaps/control/main");
* If yu want to open Firefox browser, yu can change it as Firefox
* 
* In String browser argument, the browser variable belongs to the browser
* Based on that, write the logic using if condition
* After writing the condition, in driver.get(), driver object throws error
* Because driver object has scope only inside if condition
* To share the driver object globally, i.e., for all the functions of this class, 
* copy the function ChromeDriver driver; and paste it above the launchApp method
* Once yu declared it at the global level, remove the ChromeDriver inside the if condition -> driver = new ChromeDriver();
* driver = new ChromeDriver(); & ChromeDriver driver = new ChromeDriver(); are same
* So, if we do like ChromeDriver driver = new FirefoxDriver(); 
* Saving FirefoxDriver in ChromeDriver is not possible. This is a conflict
* 
* We want to declare driver variable for all the browser
* The supermost class for all drivers is RemoteWebDriver
* So, instead of ChromeDriver driver; write RemoteWebDriver driver;
* 
* Like this we can write no. of if else for all the browsers
* Now, this is the one time implementation
* 
* Now we need to write code for username, password, login (leaftaps application)
* Here the common method is findElement
* So we need to write seperate function to find the element, then we can write the remaining code
* public void locateElement()
* driver.findElement(By.id())
* Use Switch case or if condition. Here we go with switch case to find the element
* We need to pass some information during the runtime, based on that it should work
* So we need to pass the locator -> String locator - Here locator is id, name, className, etc.,
* public void locateElement(String locator)
* switch(locator) -> If the locator is id, then write the logic for the "id" 
* case "id": return driver.findElement(By.id(locVal)); -> We need to pass the locator value -> locVal inside By.id
* Change public void locateElement(String locator, String locVal)
* Similarly write for name, className, xpath
* switch(locator) throws error. When yu mouse over it is of Java 1.5, switch case supports in Java 1.7 and above. click on that
* Check JRE System Library on the left sideof eclipse - Should be changed as [JavaSE-1.7]
* Now if yu see, all the return statement throws error, because return is returning some output. 
* As the return type is WebElement, write as public WebElement locateElement(String locator, String locVal)
* We didn't write code for tagName, so if we pass tagName in locator, it should return null. 
* So add return null; outside the switch case
* 
* To enter the value in a webpage we use, public void enterValue() { driver.findElement(By.id("")).sendKeys(""); }
* driver.findElement(By.id("")) is already implemented in locateElement method
* So we can call the locateElement function in this testcase. This will find that element and it will return that element
* and we need to pass that element as an argument to the enterValue method
* When we pass that output to this function, we need to declare the argument for that
* So declare that as WebElement because locateElement will return output as WebElement
* As we are passing the WebElement output as input in enterValue method
* public void enterValue(WebElement ele)
* Now we can use ele.sendKeys("");
* Next is sendKeys() - we are writing the function for all the text fields
* We need to pass the test data also during runtime, for that we need to declare another argument String data
* public void enterValue(WebElement ele, String data) and pass it to ele.sendKeys(data)
* 
* Same manner we need to write for all the action
* public void clickElement() {
*    driver.findElement(By.id("")).click();
* }
* driver.findElement(By.id("")) -> This action is performed by the locate element
* So remove that and pass the argument in 
* public void clickElement(WebElement ele){
*           ele.click();
* }              
* These are all the one time implementation, once yu design this file properly we can use this file n number of times
* 
* Complete notes in TC0001 class under testcases package
*/