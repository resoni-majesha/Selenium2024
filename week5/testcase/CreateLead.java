package week5.testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CreateLead {

           @Test    // Step 2	
	
		   // public static void main(String[] args) { // Step 1: Change the main method to normal method
	                                                // Removed static, String[] args, changed method name
	
	       public void runCreateLead() { // Changed to normal method
			
	        ChromeDriver driver = new ChromeDriver(); // Launch the browser
			
			driver.get("http://leaftaps.com/opentaps/control/main"); // Get the URL
			
			driver.manage().window().maximize(); // Maximize the window
			
			driver.findElement(By.id("username")).sendKeys("demosalesmanager");
			// Enter username & password
			
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			
			driver.findElement(By.className("decorativeSubmit")).click();
			// Click on login
			
			driver.findElement(By.linkText("CRM/SFA")).click();
			// Click on CRM/SFA link
			
			driver.findElement(By.linkText("Leads")).click();
			// Click on leads tab
			
	        driver.findElement(By.linkText("Create Lead")).click();
	        
	        driver.findElement(By.linkText("Create Lead")).click();
	        
	        driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Amazon");
	        
	        driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Resoni");
	        
	        driver.findElement(By.name("submitButton")).click();
	        
	        driver.close();
	}
	
}

/*
* CreateLead in testcase package have main method, as we cannot execute the Java program without main method
* We can able to execute Java code in 2 ways
* 1. main method
* 2. TestNG - Without main method
*
* Now, convert CreateLead testcase into TestNG testcase
* Step 1: Change the main method to normal method
* Step 2: Apply @Test annotation at the top of the method
* Now we have converted the main method to TestNG testcase. Right Click -> Run as TestG -> 
* We will get the status result as Pass or Fail
* Go to next tab, Result of running class LearnTestNg, yu will see Passed, Failed, Skipped, Testcase Class Name, methodName
* Method under @Test annotation will be treated as a testcase -> @Test is a testcase
* 
* If we give the Element id as incorrect, it will throw NoSuchElementException and the status will be failed
* 
* @Test is the manadatory annotation for TestNG testcases
*/