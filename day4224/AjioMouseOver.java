package week4.day4224;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AjioMouseOver {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://www.ajio.com/");
        
        WebElement mouseOver = driver.findElement(By.xpath("//span[text()='MEN']"));
        
        Actions act = new Actions(driver);
        act.moveToElement(mouseOver).perform();

	}

}
