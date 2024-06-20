package week2.day2124;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSalesForce {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://login.salesforce.com/?locale=in");
		
		driver.findElement(By.id("username")).sendKeys("radhakrishnan@testleaf.com");
		
		driver.findElement(By.id("password")).sendKeys("Sparrow@123");
		
		driver.findElement(By.id("Login")).click();
		
		Thread.sleep(2000);
		
		driver.close();

	}

}

/*
 * https://login.salesforce.com/?locale=in
 * username : radhakrishnan@testleaf.com
 * password : Sparrow@123 
 */
