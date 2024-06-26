package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.When;
import io.cucumber.testng.CucumberOptions;

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
* Make it as static, public static ChromeDriver driver; -> If it is static it will be having only one copy, not multiple copies
* So whenever the driver is getting initialized in LeafTapsLogin class, it will update the global variable
* i.e., the session id which is created in driver = new ChromeDriver();, that will get updated in the global variable
* So the CreateLead which is referring the driver from the global variable, that will get the session ID
* static is necessary if the method is distributed across multiple java classes, then yu should declare the driver as static
* If yu dont declare the driver as static then the driver which is initialized in LeafTapsLogin won't be shared to CreateLeadclass
* If it is not declared as static, we will get NullPointerException as the driver was null
* If we make that as static, whenever the session id is getting generated, it will get updated in the global variable
* 
* Now all the class in steps should extends BaseClass
* CreateLead extends BaseClass
* LeafTapsLogin extends BaseClass
* 
* Create the implementation for unimplemented steps
* When Click on crmsfa link
* And Click on Leads link
* 
* Now, we have background in each feature file, BLogin.feature, CreateLead
* If yu want to execute both the feature files, go o runner class, RunLogin, 
* @CucumberOptions(features = "src/test/java/features/DLogin.feature", glue = "steps")
* Here features is plural, so it will accept array of values, 
* Add the location for CreateLead.feature file in @CucumberOPtions, inside curly braces
* @CucumberOptions(features = {"src/test/java/features/BLogin.feature", "src/test/java/features/CreateLead.feature"}, glue = "steps")
* This is one method
* 
* The other way is give the package name itself
* @CucumberOptions(features = {"src/test/java/features}, glue = "steps"), it will execute all the files in this package
* The order of execution will be as per the order in the package
* If yu want to change the execution order, change the file names
* TC001_BLogin.feature, TC002_CreateLead.feature
*
*/