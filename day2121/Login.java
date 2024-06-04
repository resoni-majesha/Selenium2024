package week2.day2121;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {
		
		// Step 1: Ask Webdrivermanager to assist you download the chromedriver if it is not present in your machine
		
		// Step 2: Launch the chrome browser -> Let Java code to launch it
		
		ChromeDriver driver = new ChromeDriver();
		
		// Firefox Driver = new FirefoxDriver(); // Launch firefox driver
		
		// Step 3: Load the URL of the application
		
		// http://leaftaps.com/opentaps/control/main // demosalesmanager / crmsfa
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		// Step 4: Maximize the browser
		
		driver.manage().window().maximize();
		
		// Print the title
		
		String title = driver.getTitle();
		System.out.println(title);
		
		// Step 5: Enter the username
		// id -> username
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager", Keys.TAB); 
		
		//Keys.TAB is used to enter text and tap on the particular element
		//eg: In redbus app, we need to type and select the location, for that use Keys.TAB
		
		// clear() is used to enter value and erase
		
		// Step 6: Enter the password
		// id -> password
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		// Step 7: Click on Login button
		// className -> decorativeSubmit
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		// Step 8: Click on crmsfa link
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		// Step 9: Click Create Lead link
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		// Step 10: Type your company name
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Amazon");
		
		// Step 11: Type your first name
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Resoni X");
		
		// Step 12: Type your last name
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Majesha");
		
		// Step 13: Click create Lead
		
		driver.findElement(By.name("submitButton")).click();
		
		// Print the title of the loaded page
		
		String title2 = driver.getTitle();
		
		System.out.println(title2);
		
		driver.close();
	}

}

/*
 * Selenium Webdriver cannot communicate with the web browser which is already launched
 * It can only talk to the new browser
 * 
 * The browser enders the application code as HTML
 * HTML Tags - Tags are used to communicate to the devs/ users to tell what is that element is all about
 * 
 * <html> -> ROOT tag -> HTML Page
 * <input> -> Input Field -> textbox, button, checkbox, radio button
 * <button> -> button
 * <div> -> divide the content into multiple portions
 * <a> -> Hyperlink
 * <table> 
 * <span>
 * 
 * Element will contain 3 information other than tag
 * 
 * <input name ="Maje" age = "27" org = "TestLeaf"
 * 
 * 1. Element Attribute - name, age, org - Within the tag - Pink
 * 2. Element Attribute's value - Maje, 27, TestLeaf - followed by the attribute - Blue
 * 3. Element Text - In between opening & closing tag <input> Maje </input> - Black
 * 
 * All the above 3 info's are not mandatory, use may/may not have, but the tag is mandatory
 * 
 * To know the Attribute, Attribute's value, Text, go to developer tools by clicking on F12
 * Other approach, right click on the element & inspect element
 * 
 * Selenium Locators - 8
 * 
 * 1. id - attribute
 * 2. name - attribute
 * 3. className - attribute
 * 4. tagName - tag
 * 5. linkText - text of the tag <a> - Exact match
 * 6. partialLinkText - partial text of the tag <a> - contains
 * 7. xPath
 * 8. cssSelector
 * 
 * There will be multiple input tags - So, Selenium when it finds multiple matched tag, it takes the first match
 * 
 * To navigate back - driver.navigate().back();
 * To navigate forward - driver.navigate().forward();
 * To refresh - driver.navigate().refresh();
 * 
 */


		

		


