package week5.day5121;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AnCreateLead extends AnBaseClass {

           @Test
	       public void runCreateLead() { // Changed to normal method
			
	        driver.findElement(By.linkText("Create Lead")).click();
	        
	        driver.findElement(By.linkText("Create Lead")).click();
	        
	        driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Amazon");
	        
	        driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Resoni");
	        
	        driver.findElement(By.name("submitButton")).click();
	        
	}
	
}

/*
* If yu look into CreateLead, DeleteLead, EditLead first few steps will be common, i.e., Clicking until Leads
* Keep these common steps in Baseclass
* Create a class named AnBaseClass and add the common steps into it and 
* delete those common steps from all 3 CreateLead, DeleteLead, EditLead classes
* Go to AnBaseClass for remaining steps
*/