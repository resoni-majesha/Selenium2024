package week2.day2224;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebDriverMethods {

	public static void main(String[] args) {
		
        ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		// To get the current URL
		
		String currentUrl = driver.getCurrentUrl();
		
		System.out.println(currentUrl);
		
		// To get the text from  the webpage. Leaftaps > Create Lead > Firstname
		String text = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		
		System.out.println(text);
		
		if(text.contains("Res")) {
			
			System.out.println("Lead is created");
		} else {
			
			System.out.println("Lead is not created");
		}
			

	}

}
