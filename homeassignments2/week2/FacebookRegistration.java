package homeassignments2.week2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookRegistration {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver(); // Launch the browser
		
		driver.get("https://www.facebook.com/"); // Get the URL
		
		driver.manage().window().maximize(); // Maximize the window
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		driver.findElement(By.partialLinkText("Create")).click();
		
		driver.findElement(By.name("firstname")).sendKeys("Resoni X");
		
		driver.findElement(By.name("lastname")).sendKeys("Majesha");
		
		driver.findElement(By.name("reg_email__")).sendKeys("9876543210");
		
		driver.findElement(By.id("password_step_input")).sendKeys("maje");
		
		WebElement bday = driver.findElement(By.id("day")); 
		Select day = new Select(bday);
		day.selectByValue("18");
		
		WebElement bmonth = driver.findElement(By.id("month"));
		Select month = new Select(bmonth);
		month.selectByVisibleText("Jul");
		
		WebElement byear = driver.findElement(By.id("year"));
		Select year = new Select(byear);
		year.selectByVisibleText("1997");
		
		driver.findElement(By.xpath("(//input[@name='sex'])[1]")).click();
		
		driver.close();

	}

}
