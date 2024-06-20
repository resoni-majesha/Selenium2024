package week2.day2121;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnImplicitWait {

	public static void main(String[] args) {
		
        ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		// Set up the implicitly wait
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.findElement(By.id("username1")).sendKeys("demosalesmanager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Amazon");
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Resoni X");
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Majesha");
		
		driver.findElement(By.name("submitButton")).click();      
		
		driver.close();
		
	}

}

/*
 * Waits
 * There are 2 different waits in Selenium 
 * 1. Implicit wait
 * 2. Explicit wait
 * 
 * Why do we need to use wait
 * Is your office website loads faster all the time?
 * While doing manually, yu will wait or login a defect for page loading? Wait for loading
 * Yu can wait for 5 secs, yu can wait
 * If the delay is always happens, yu can raise a defect
 * 
 * Maximum wait time -> Finding the bus to arrive at your place
 * Your frnd is also waiting for the same bus in next busstep
 * You both wait for 15 mins if the bus arrives late
 * 15 mins is the max time
 * 
 * All the passengers wait for the max time of 15 mins
 * If the bus arrives within 15 mins, what will yu do, board the bus
 * If the wait time is beyond 15 mins, we will decide what's next
 * 
 * This approach is called implicit wait
 * Implicit wait keeps on waiting for the elemnet to appear on the webpage for a max time provided
 * If it exceeds max time, it will throw an exception -> I couldn't find the element
 * 
 * Whenever Selenium could not find the element within the timeout -> It throws NoSuchElementException
 * NoSuchElementException is a Java Class
 * If the username element is provided right, then the code will work fine immediately
 */
