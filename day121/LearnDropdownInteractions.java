package week2.day121;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnDropdownInteractions {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
        driver.manage().window().maximize();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Amazon");
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Resoni X");
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Majesha");
		
		// Locate the select tag element (dropdown)
		
		WebElement findElement = driver.findElement(By.id("createLeadForm_dataSourceId"));
		
		// Create an object for Select class
		
		Select dropDown = new Select(findElement); //Pass the webelement to the select class
		
		// Select using visible text
		
		// dropDown.selectByVisibleText("Employee"); 
		
		// Select using value
		
		// dropDown.selectByValue("LEAD_PARTNER");
		
		// Select using Index
		
		dropDown.selectByIndex(1);
		
		WebElement findElement2 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		
		Select dropDown1 = new Select(findElement2);
		
		dropDown1.selectByVisibleText("Automobile");
		
		driver.findElement(By.name("submitButton")).click();
		
		driver.close();

	}

}

/*
 * Dropdown Interactions
 * 
 *  If you find an element with select tag, then it's a dropdown
 *  Expand the select tag, yu will get lot of options, and if yu collapse, the options will be hidden
 *  Here, select tag is the parent & the option tags are the child for the select tag
 *  <select>
 *         <option>
 *         
 *  To interact with the dropdown element, selenium has a special class called select class
 *  Select class is used to interact with dropdown element
 *  Before using the select class, we need to locate the select element
 *  
 *  We can able to select values based on one of the below information
 *  
 *  1. value
 *  2. visible text
 *  Based on the order it is diplaying, we can use the index
 *  3. index starts with 0
 */
