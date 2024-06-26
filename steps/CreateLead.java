package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.When;

public class CreateLead extends BaseClass {

	@When("Click on crmsfa link")
	public void clickCrmsfaLink() {
		
        driver.findElement(By.linkText("CRM/SFA")).click();  
	}
	
	@When("Click on Leads link")
	public void clickLeadsLink() {
		
        driver.findElement(By.linkText("Leads")).click();
	}
	
}

/*
* Here driver is not shared, we should share driver across all the java files
* So create a base class in steps folder to share the driver
* Move the driver declaration in the BaseClass - public ChromeDriver driver;
* Now all the class in steps should extends BaseClass
*
*/