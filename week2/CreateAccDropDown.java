package homeassignments2.week2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.sun.tools.javac.main.Option;

public class CreateAccDropDown {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver(); // launch the browser

		driver.get("http://leaftaps.com/opentaps/control/main"); // Get the url

		driver.manage().window().maximize(); // Maximize the window

		driver.findElement(By.id("username")).sendKeys("demosalesmanager");

		driver.findElement(By.id("password")).sendKeys("crmsfa");

		driver.findElement(By.className("decorativeSubmit")).click();

		driver.findElement(By.linkText("CRM/SFA")).click();

		driver.findElement(By.linkText("Accounts")).click();

		driver.findElement(By.partialLinkText("Create")).click();

		driver.findElement(By.id("accountName")).sendKeys("Maje");

		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");

		WebElement findElement = driver.findElement(By.name("industryEnumId")); // Locating the ele and storing it in
																				// WebElement
		Select option = new Select(findElement); // Creating the select class & passing the WebElement variable as
													// argument
		option.selectByValue("IND_SOFTWARE"); // Select the options value by using SelectByValue

		WebElement findElement2 = driver.findElement(By.name("ownershipEnumId"));
		Select option2 = new Select(findElement2);
		option2.selectByVisibleText("S-Corporation");

		WebElement findElement3 = driver.findElement(By.id("dataSourceId"));
		Select option3 = new Select(findElement3);
		option3.selectByValue("LEAD_EMPLOYEE");

		WebElement findElement4 = driver.findElement(By.id("marketingCampaignId"));
		Select option4 = new Select(findElement4);
		option4.selectByIndex(6);

		WebElement findElement5 = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select option5 = new Select(findElement5);
		option5.selectByValue("TX");
		
		driver.findElement(By.className("smallSubmit")).click();
		 
		String title = driver.getTitle();
		 
		System.out.println(title);
		 
		if(title.contains("Details")) {
			
		      System.out.println("Title verified"); 	      
		} else {
		 
		      System.out.println("Title not verified");    
		}
		 
		driver.close();
	}

}
