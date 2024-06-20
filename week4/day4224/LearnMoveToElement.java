package week4.day4224;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnMoveToElement {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://snapdeal.com/");
        
        WebElement mouseOver = driver.findElement(By.xpath("//span[text()='Home & Kitchen']"));
        
        Actions act = new Actions(driver);
        
        act.moveToElement(mouseOver).perform(); // Mouse over & home and kitchen and then go and click Juicer Mixer Grinders
        
        driver.findElement(By.xpath("//span[text()='Juicer Mixer Grinders']")).click();
	}

}
