package week4.day4224;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollDownAmazon {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://www.amazon.in/");
        
        // WebElement scrollDown = driver.findElement(By.xpath("(//span[text()='Sign in'])[3]"));
        WebElement scrollDown = driver.findElement(By.xpath("//div[text()='See personalized recommendations']/following::span[text()='Sign in']"));
        Actions act = new Actions(driver);
        act.scrollToElement(scrollDown).perform();
        
        // scrollDown.click();

	}

}
