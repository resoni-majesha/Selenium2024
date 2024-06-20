package homeassignments2.week2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) {
		
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
	}

}
