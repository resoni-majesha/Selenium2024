package homeassignments2.week2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount {

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
		
		driver.findElement(By.linkText("Accounts")).click();
		// Click on accounts tab
		
		driver.findElement(By.partialLinkText("Create")).click();
		// Click on create account button
		
		driver.findElement(By.id("accountName")).sendKeys("Maje");
		// Enter the account name
		
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		// Enter the description
		
		driver.findElement(By.id("numberEmployees")).sendKeys("10");
		// Enter number of Employees
		
		driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
		// Enter site name as leaftaps
		
		driver.findElement(By.className("smallSubmit")).click();
		// Click on create account button
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		if(title.contains("Details")) {
			
			System.out.println("Title verified");
		} else {
			
			System.out.println("Title not verified");
		}
		// Verify the title is displayed correctly
		
		driver.close();
		// Close the browser
	}

}
