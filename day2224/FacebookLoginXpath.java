package week2.day2224;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLoginXpath {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc@gmail.com");
		
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("abc");
		
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
		Thread.sleep(5000);
		
		driver.close();

	}

}
