package week5.referleadscode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver(); // Launch browser
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
        driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.partialLinkText("Lead")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Amazon"); // Using xpath
		
		driver.findElement(By.xpath("(//input[contains(@id,'firstName')])[1]")).sendKeys("Resoni X");
		
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Majesha");
		
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Reso");
		
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("QA");
		
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Quality Assurance");
		
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("reso.majee@gmail.com");
		
		WebElement State = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select option = new Select(State);
		option.selectByVisibleText("New York");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		driver.findElement(By.linkText("Edit")).click();
		
		driver.findElement(By.id("updateLeadForm_description")).clear();
		
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Important Update");
		
		driver.findElement(By.xpath("(//td[@colspan='4']/input)[1]")).click();
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		driver.close();

	}

}
