package week4.day4224;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnDoubleClick {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_ondblclick");
        
        //handle frame
        driver.switchTo().frame("iframeResult");
        
        //object for action class
        Actions act = new Actions(driver);
        
        act.doubleClick(driver.findElement(By.xpath("")));

	}

}
