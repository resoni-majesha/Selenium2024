package week4.day4224;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnJavaScriptClick {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		ChromeDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://login.salesforce.com/?locale=in");
        
        driver.findElement(By.id("username")).sendKeys("dilip@testleaf.com");
        driver.findElement(By.id("password")).sendKeys("testleaf@2024");
        driver.findElement(By.id("Login")).click();
        
        Set<String> windowHandles = driver.getWindowHandles();
        System.out.println(windowHandles);
        
        // To handle the particular window, convert set into list
        // Create an empty list
        
        List<String> windows = new ArrayList<String>(windowHandles); // Set is converted to list
        
        // Now yu can switch b/w multiple windows
        driver.switchTo().window(windows.get(1));
        String childTitle = driver.getTitle();
        System.out.println("Child Title " +childTitle);
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("//button[text()='Confirm']")).click();
        
        driver.findElement(By.xpath("//div[@class()='slds-icon-waffle']")).click();
        driver.findElement(By.xpath("(//button[@class='slds-button'])[2]")).click();
        driver.findElement(By.xpath("//p[@class='slds-truncate']")).click();
        
        // driver.findElement(By.xpath("//span[text()='Accounts']")).click(); // Will get JavaScript exception
        // Dev has created the particular code using Javascript
        
        WebElement jsClick = driver.findElement(By.xpath("//span[text()='Accounts']"));
        driver.executeScript("arguments[0].click();", jsClick);
        // For each javascript exception, we need to create another above 2 lines

	}

}
