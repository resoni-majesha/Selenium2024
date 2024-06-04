package week2.day2124;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ExerciseSelectCypress {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://leafground.com/select.xhtml");
		
		WebElement findElement = driver.findElement(By.className("ui-selectonemenu"));
		
		Select options = new Select(findElement);
		
		//options.selectByVisibleText("Cypress");
		
		options.selectByIndex(4);
		
		Thread.sleep(2000);
		
		driver.close();

	}

}

// In create lead page