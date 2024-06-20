package week4.day4124;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrames {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/frame.xhtml");
		
		// Handle the frame 1
		driver.switchTo().frame(0);
		
		// NOSuchElementException - When the element is not found in the DOM, xpath is wrong
		driver.findElement(By.id("Click")).click(); // Not handling the frame. Go to line no: 17
		
		// Switch back to main page from Frame
		driver.switchTo().defaultContent();
		
		// Click on browser icon in main page
		driver.findElement(By.xpath("//i[@class='pi pi-globe layout-menuitem-icon']")).click();

	}

}

/*
* Frames
* When yu buy a frame, and if yu want to change the foto in the frame, yu will replace the foto in the same frame
* Similarly, if the data needs to changed frequently dev will change the data inside the iframes eg: Amazon app movie releases
* eg: Foto frame, locker - Inside the locker we will have a big box, and the big box will contain small box and segregate gold, silver
* Another example: News App -> News will be updated everyday, which can be changed inside iframe tag
* What is frame? Frame is like a DOM inside another DOM
* Why? To act on any element inside the frame
* How to handle? Change the driver focus to frame
* Go to amazon.in -> Inspect the starting of the page -> Search //iframe
* How to identify whether the frame is inside the iframe tag
* iframe - inline frame -> Identified in 2 ways
* 1. Right click -> Webpage -> Frame source
* 2. Searching //iframe in DOM
* html inside another html -> iframe has one html
* How to handle it?
* Pass the driver focus to frame
* Syntax: driver.switchTo().frame(args);
* Return type of switchTo() is WebDriver Interface and the implementation class is RemoteWebDriver
* frame is an example for Method Overloading
* 3 ways
* 1. Using Index
*    driver.switchTo().frame(int index);
*    Index starts from 0
* 2. Using id/name attribute
*    driver.switchTo().frame(String id/name attribute)
* 3. Using WebElement
*    driver.switchTo().frame(driver.findElement(WebElement);
*/