package week5.day5121;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class AnBaseClass {
	
	public ChromeDriver driver;
	
	@BeforeMethod
	public void preCondition() {
		
		driver = new ChromeDriver(); 
		
		driver.get("http://leaftaps.com/opentaps/control/main"); 
		
		driver.manage().window().maximize(); 
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();

	}
	
	@AfterMethod
	public void postCondition() {
  
		driver.close();

	} 
	
}

/*
* Step 1: Create BaseClass
* Step 2: Move the common steps from all the testcases into a method in this baseclass
* Step 3: Delete common steps in all the testcases
* Step 4: All the testcases should extends AnBaseClass - Inheritance
* Step 5: Declare the driver as Global variable in BaseClass
* Global variable comes inside the class. So remove the ChromeDriver from the method and add it in the Class
* public ChromeDriver driver;
* Step 6: Remove the local declaration inside the method
* You could see the driver in blue color which means it is using global variable
* 
* Another common code is there driver.close(); which should also be moved to the AnBaseClass
* Create a postCondition method and add it to AnBaseClass and delete it from CreateLead, DeleteLead, EditLead
* 
* Advantages of moving these codes to the BaseClass
* 1. We are making the common code, eg: If the username and password is getting changed we can change that in only one place
* To make our maintainance easy
* 2. To reduce the number of lines of code
* 
* Now, the preCondition code has to be executed before each testcase
* Annotation to be used - @BeforeMethod
* postCondition code has to be executed before each testcase
* Annotation to be used - @AfterMethod 
* 
* Step 7: Apply @BeforeMethod method for preCondition
* Step 8: Apply @AfterMethod for postCondition
* 
* Now we use only 2 annotations, but when we learn Page Object Model, we will learn all other annotations
* 
*/