package week5.day5124;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNg {
	public  ChromeDriver	driver;
	@Test
	 public void loginPage() {
		 
		 	 driver = new ChromeDriver();
			 driver.manage().window().maximize();
			 driver.get("http://leaftaps.com/opentaps/control/main");
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		  
	       }  
}


