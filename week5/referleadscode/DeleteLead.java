package week5.referleadscode;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		
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
		
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		String leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.linkText("Delete")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		String text = driver.findElement(By.className("x-paging-info")).getText();
		if (text.equals("No records to display")) {
			System.out.println("Text matched");
		} else {
			System.out.println("Text not matched");
		}
		driver.close();

	}

}
