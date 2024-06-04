package week2.day121;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnMultiSelect {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://leafground.com/");
		
		WebElement multiSelect = driver.findElement(By.xpath("(//select)[6]"));
		
		Select multiDropDown = new Select(multiSelect);
		
		multiDropDown.deselectByVisibleText("Selenium");
		
		multiDropDown.deselectByVisibleText("Appium");
		
		Thread.sleep(2000); // Add throws to wait
		
		multiDropDown.deselectByVisibleText("Selenium");
		
		driver.close();

	}

}

/*
 * How to select and deselect multiple values in the dropdown
 * 
 * This page is deprecated from Leafground.com
 */