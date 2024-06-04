package week2.day2224;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnImplicitWait {

	public static void main(String[] args) throws InterruptedException {
		
        ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		// So use Selenium wait. It will be applicable for all findElement methods in the same program
		
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); // Mandatory in all Selenium program
		
		driver.findElement(By.linkText("Create new account")).click();
		
		//Thread.sleep(5000); // Will wait for 5 secs and then go to the next line. Go to line no: 18
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Resoni");

		driver.close();
	}

}

/*
 * Selenium Wait - 2 types
 * 1. Implicit Wait
 * 2. Explicit Wait
 *  
 * Implicit Wait
 * Common for both findElement() & findElements()
 * Give Implicit wait as 30 sec - If the data is fetched i.e., element action is completed it will go to next line
 * It will not wait complete in 30 sec
 * driver.findElement(By.id("username")).sendKeys("user");
 * Thread.sleep(5000); //It will compulsorily wait for 5 secs
 * Wont be good if we write this line of code in all line.
 * 
 * If we use implicit wait by giving 30 sec - but if action is completed in 10 sec, it will go to next line
 * Eg: If click on create new acc in FB, it will load and go to next page
 * Here we need to use wait, then only the data will be entered
 * 
 */
