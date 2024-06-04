package week2.day2124;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		
		// Launch the Chrome browser
		
		ChromeDriver driver = new ChromeDriver();
		
		// FirefoxDriver driver = new FirefoxDriver();
		
		//Maximize the window
		
		driver.manage().window().maximize();
		
		// Pass the URL
		
		driver.get("http://leaftaps.com/opentaps/control/main"); // get() is the method to pass the URL
		
		// Close the browser
		
		driver.close();

	}

}

/*
 * To check how the chrome browser is launched,
 * Go to Run , type .cache > Selenium > chromedriver > win64 > 125..0.6422.141
 * 
 * ChromeDriver driver = new ChromeDriver(); By writing this line, current chrome version will be downloaded automatic
 * 
 * Intially the code is written, then with the help of W3C protocol, it will download the driver browser and 
 * then it will launch the browser
 * 
 * Selenium will interact with the new browser. i.e., a new browser will be opened running the code each time
 * If yu r running 50 or 100 times, multiple browser will be opened, then the capacity will be down and RAM will be full
 * So yu need to close it. Inorder to close it use close() method
 * 
 */
