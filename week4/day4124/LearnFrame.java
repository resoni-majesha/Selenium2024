package week4.day4124;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrame {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://leafground.com/alert.xhtml");
        
        //frame 1
        driver.switchTo().frame(0); // To click the first frame using index
        
        // NoSuchElementException - Element not found - Check whether the element is inside the frame
        driver.findElement(By.id("Click")).click(); // Control will be inside the frame now
        
        // Switch back to the main page
        driver.switchTo().defaultContent(); // Control will be in main page now

        Thread.sleep(2000);
        driver.findElement(By.xpath("//i[@class='")).click();
	}

}

/*
* Frames
* Pictures are embedded inside the frame
* Locker - Big box, inside that small box -> We can segregate gold, diamonds etc
* Frame is like another DOM embedded inside the DOM
*  <html>
*    <iframe>
*    <html>
*       </html>
*         </iframe>
*          </html>
* html inside html
* Why Frames -> To act on any element inside the frame
* How? Transfer the driver focus to frame
* Eg: Amazon
* Inspect -> Ctrl+F -> //iframe
* If dev wants to change anything they will add inside the iframe
* eg: if they need to change the movie name or any another details changed in homepage often that needs to be released each month        
* 
* How to identify iframe - inline frame
* Identify in two ways
* By right click on Webpage-> Frame source
* By searching //iframe in DOM   
* When right clicking on the webpage, if yu find view frame source, then yu must handle the frame in the particular page
* 
* To handle alert
* Transfer driver focus to frame
* Syntax: driver.switchTo().frame(args);
* Return type is WebDriverInterface and the inplementation class is RemoteWebDriver
* 
* Ways to SwitchTo frame
* 1.Using Index:
*   i) driver.switchTo().frame(int index);
*   ii) Index starts with 0
* 2. Using id,name attribute - driver.switchTo().frame(String id/name attribute);
* 3. Using WebElement - driver.switchTo().frame(driver.findElement(WebElement);
* 
* If there is no meaningful attribute data, then we can go for using Index
* 
* Nested frame
* Frame inside frame
* Open wardrobe -> Locker -> then we can take the things
* First outer then we need to go inside
* 
* How to handle nested frame
* Possible to switch between the frames using index, string id/name or Webelemnt
* take the drive focus to the main content of Webpage
* driver.switchTo().defaultContent();
* take the driver focus to the immediate parent frame
* driver.switchTo().parentFrame();
*/