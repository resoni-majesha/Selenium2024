package week5.day5224;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class ProjectSpecificMethod {
	
	public RemoteWebDriver driver;
	
	@Parameters({"url","password","username","browser"}) // @Parameter yu can use any order for adding values
	
	@BeforeMethod
	// what order yu given in @Parameters same order need to given in the input args, but the names should match the xml file
	public void preSetup(String url, String pwd, String uname, String browser) {
		
		// For crossbrowser testing add the if elseif statement
		if(browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if(browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver(); // Add the grandparent class - RemoteWebDriver as globally Line no: 15
		}
		
		driver  = new ChromeDriver();
		driver.manage().window().maximize(); // Provide the hardcoded value and pass the variable name as given input args
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys(uname);
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		
	}

	@AfterMethod
	public void postSetup() {
		
		driver.quit();
		
	}
	
}

/*
 * ChromeDriver is declare locally. so it will be executed only within this call
 * We need to declare it globally for all the @Test
 * Add driver.close() in the @AfterMethod
 * Go to all the leads class and write the extends keyword eg: CreateLead extends ProjectSpecificMethods
 * 
 * First before method will be executed, then the @Test will get executed and then @AfterMethod will get executed
 * Now, select CreateLead, DeleteLead class and covert to TestNG, xml file will be created
 * Run the xml file, both the classes will be runned
 */
