package week2.day2124;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginToFacebook {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		
		driver.findElement(By.id("pass")).sendKeys("abc");
		
		driver.findElement(By.name("login")).click();
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		if(title.contains("Face")) {
			
			System.out.println("Title verified");
		} else {
			
			System.out.println("Title not verified");
		}
		
		Thread.sleep(3000);
		
		driver.close();

	}

}
