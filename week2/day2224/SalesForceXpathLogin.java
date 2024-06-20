package week2.day2224;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesForceXpathLogin {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://login.salesforce.com/?locale=in");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[contains(@id,'user')]")).sendKeys("radhakrishnan@testleaf.com");
		
		driver.findElement(By.xpath("//input[@id='password']"));
		
		

	}

}
