package week4.day4224;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnWindowHandling {
	
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
        
        driver.findElement(By.xpath("//span[text()='Learn More']")).click(); // To click on learn more
        
        // Get window handle
        String parent = driver.getWindowHandle();
        System.out.println("Parent window address " +parent);
        String parentTitle = driver.getTitle();
        System.out.println("Parent Title " +parentTitle);
        
        // GetwindowHandles
        
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
        
        driver.close(); // To close the current/child window or tab
        
        //To switch back to parent window
        driver.switchTo().window(windows.get(0));
        
        driver.findElement(By.xpath("//span[text()='Learn More']")).click(); 
        // Again click on learn more -> NoSuchWindowException
        // As the control is still in child window -> Go to line no: 56
        
        driver.quit(); // it closes all the opened window or tab in the browser
        
	}

}

/*
* Window Handling
* Why? If yu want to switch between multiple window or tab
* Each window will have unique address of browser window/tab
* eg: Each house holds unique address
* How to handle? Transfer the driver control to child window
* To handle multiple window scenarios in selenium, window handler is used
* Window address will be alphanumeric- BD9G8THY4
* To get the address of opened windows there are two methods
* 1. getWindowHandle() - to get the current window id as a string -> Return type is String
* 2. getWindowHandles() - returns the set of all the opened windows/tab as Set<string> -> Return type is Set<String>
* To handle windows:
*  i) Transfer the driver focus to required window
*  driver.switchTo().Window(Windowname);
*  Return type is Webdriver Interface and the inplementation class is RemoteWebDriver
* How to handle multiple windows?
* 1. Get the window handles
* Set<String> windowHandles = driver.getWindowHandles();
* 2. Convert the set to list, Use a for loop
* 3. Use SwitchTo method to switch b/w the windows using the Windowhandle
*  
* To handle notification 
* We need to use chrome option, for that we need to go to peter.sh
* Got to experiments tab, ctrl+F, notification -> disable notification -> Copy --disable-notifications
* ChromeOptions options = new ChromeOptions();
* options.addArguments("--disable-notifications");
* 
*/