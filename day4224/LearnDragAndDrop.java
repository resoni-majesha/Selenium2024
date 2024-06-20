package week4.day4224;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnDragAndDrop {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://leafground.com/drag.xhtml");
        
        WebElement src = driver.findElement(By.id("form:drag_content"));
        
        WebElement target = driver.findElement(By.id("form:drop"));
        
        Actions act = new Actions(driver);
        act.dragAndDrop(src, target).perform();
        
        //keyboard actions
        
        driver.findElement(By.id("username")).sendKeys("dilip", Keys.ENTER);
        // Keys.TAB
        // Keys.ADD

	}

}

/*
* Drag is source, drop is target
*
*/