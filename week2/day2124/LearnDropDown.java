package week2.day2124;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnDropDown {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://leafground.com/select.xhtml");
		
		// Create WebElement, create WebElement to reuse the variable for more than one time
		
        WebElement findElement = driver.findElement(By.className("ui-selectonemenu")); // Find the value in DOM
        
        // Create an object for Select class
        
        Select options = new Select(findElement); // Values/options will be added in this select class 
                                                  // when passing findElement variable
        
		//options.selectByVisibleText("Selenium");
        
        options.selectByIndex(3); // Call the values/options using the object

        Thread.sleep(2000);
        
        driver.close();

	}

}

/*
 * Drop allow user to select one or more option
 * Using select class in Selenium WebDriver
 * Use when tagName is Select
 * Select represent the dropdown element
 * How to use - Identify element & confirm with <select>
 * Instantiate Select class by passing the WebElement as argument to the constructor
 * 
 * Syntax:
 * Select options = new Select(WebElement);
 * 
 * Select class has 3 methods
 * 1. selectByIndex(index); - Index starts from 0
 * 2. selectByText(text); - black color text from the DOM
 * 3. selectByValue(value); - attribute value as input argument
 * 
 * When to use Index - When yu have few options, go with Index, otherwise values or text (If having many options)
 * 
 * return type for findElement is WebElement
 * 
 */