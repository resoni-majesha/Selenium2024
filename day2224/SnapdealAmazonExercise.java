package week2.day2224;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SnapdealAmazonExercise {

	public static void main(String[] args) {
		
        ChromeDriver driver = new ChromeDriver();
		
		//driver.get("https://snapdeal.com/");
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

		//driver.findElement(By.xpath("//div[contains(@class,'cartContainer')]/div")).click();
		
		//driver.findElement(By.xpath("((//ul[@class='footerSubCategoriesUl'])/a)[3]")).click();
		
		driver.findElement(By.xpath("//div[@id='nav-xshop']/a[5]")).click();
	}

}

/*
 * Tried parent to child
 *
 * 1:https://www.snapdeal.com/
 * cart - xpath - (//div[contains(@class,'cart')])/div[@class='cartInner']
 *                //div[contains(@class,'cartContainer')]/div
 * footwear- xpath - ((//ul[@class='footerSubCategoriesUl'])/a)[3]
 * 
 * 2.https://www.amazon.in/
 * Today's Deals - //div[@id='nav-xshop']/a[5]
*/