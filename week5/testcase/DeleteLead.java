package week5.testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver(); // Initialize the WebDriver
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//p[@class='top'])/input")).sendKeys("demosalesmanager");
		// Enter the username
		
		driver.findElement(By.xpath("((//form[@id='login'])//input)[2]")).sendKeys("crmsfa");
		// Enter the password
		
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']/parent::p")).click();
		// Click on login button
		
		driver.findElement(By.xpath("(//a[contains(text(),'CRM')])/ancestor::div[1]")).click();
		// Click on CRM/SFA link
		
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		// Click on Leads link
		
		driver.findElement(By.xpath("//ul[@class='shortcuts']//a[text()='Find Leads']")).click();
		// Click on Find leads link
		
		
		
		//String text = driver.findElement(By.xpath("(//a[contains(text(),'10301')]/parent::div)[1]")).getText();
		//System.out.println(text);
		
		//driver.findElement(By.xpath(""))

	}

}
