package week4.day4224;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowIrctcLogin {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		ChromeDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://www.irctc.co.in/");
        
        driver.findElement(By.xpath("(//i[contains(@class,'justify')])[1]")).click();
        driver.findElement(By.xpath("//label[text()='FLIGHTS'][1]")).click();
        
        Set<String> windowHandles = driver.getWindowHandles(); // Get the window handles
        // System.out.println(windowHandles);
        
        List<String> windows = new ArrayList<String>(windowHandles);
        
        driver.switchTo().window(windows.get(1)); // Control to child tab
        String childTitle = driver.getTitle();
        System.out.println("Child Title "+childTitle);
        
        driver.switchTo().window(windows.get(0)); // Control to parent tab
        driver.close(); // Close the parent tab
        

	}

}
