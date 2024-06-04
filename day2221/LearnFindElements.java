package week2.day2221;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFindElements {

	public static void main(String[] args) {
	
        ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		/*WebElement userName = driver.findElement(By.id("username")); 
		
		// WebElement is the single element and it will return a single element
		
		userName.sendKeys("demosalesmanager");*/
		
		List<WebElement> findElements = driver.findElements(By.tagName("input")); 
		//returnType is list of WebElement - List<WebElement>
		
		System.out.println(findElements.size()); //3 - All the 3 matching elements will be printed
		
		findElements.get(1).sendKeys("crmsfa"); // crmsfa will be entered in password field

	}

}

/* To locate a single WebElement, use findElement() method
 * findElements() method is used to locatemultiple elements
 * Leaftaps: username's tagName is inpt. If we write //input, it has 3 matches
 * Return type for findElements is list of WebElement - List<WebElement>
 * Whenever yu use tagName/className as locator, it will be used across multiple elements
 * Re-check whether tagName/className matches with single/multiple elements. 
 * As single element match for tagName/className is rare
 * 
 */