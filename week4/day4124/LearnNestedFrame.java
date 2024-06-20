package week4.day4124;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnNestedFrame {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://leafground.com/frame.xhtml");
        
        // Switch to first frame
        driver.switchTo().frame(2);
        
        // Handle the inner frame
        driver.switchTo().frame("frame2");
        
        driver.findElement(By.id("Click")).click();
        
        // Parent Frame
        driver.switchTo().parentFrame();
        
        // Main Page
        driver.switchTo().defaultContent();

	}

}

/*
* Nested Frames
* If id, name is present in DOM, we must use it, we should not go for index value -> Handle the inner frame
*/