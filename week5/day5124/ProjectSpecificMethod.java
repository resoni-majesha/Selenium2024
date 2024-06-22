package week5.day5124;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ProjectSpecificMethod {
	
	public ChromeDriver driver;
	
	@BeforeMethod
	public void preSetup() {
		
		driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
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
