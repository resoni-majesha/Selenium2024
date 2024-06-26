package week4.day4224;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnScrollDown {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://www.ajio.com/");
        
        WebElement scrollDown = driver.findElement(By.linkText("Track Your Order"));
        
        Actions act = new Actions(driver);
        act.scrollToElement(scrollDown).perform();
        
        Thread.sleep(3000);
		
        scrollDown.click();
	}

}
