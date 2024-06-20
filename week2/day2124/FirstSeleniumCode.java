package week2.day2124;

import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumCode {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://leaftaps.com/opentaps/control/main");

	}

}

/*
 * Selenium is a UI automation tool
 * Open source, easy to integrate with other tool
 * Use while functional & regression testing
 * Popular tool - Selenium, Max Download, Playwright - getting Popular, Cypress - Decent market share, 
 * Puppeteer - Dev tool
 * Why Selenium? Much needed in market/ job openings
 * 
 * Selenium - Core Java, Python, C#, JavaScript, Ruby, Perl
 * Playwright - Core Java, Python, C#, JavaScript
 * Cypress - -------Missing
 * Puppeteer -
 * 
 * 2004 Jason Huggins developed Selenium IDE, then Selenium RC - deprecated
 * 2006 - Simon Stewart - WebDriver
 * 2017 - Integrated WebDriver & Selenium
 * 
 * Selenimum Suite has 4 components - Selenium IDE, Selenium RC, Selenium WebDriver, Selenium Grid
 * In 2nd version, Selenium RC has been deprecated
 * Components in Selenium 4 - Slenium IDE, Selenium WebDriver, Selenium Grid
 * Browsers - Safari, Firefox, Chrome, Edge, Opera
 * OS- Apple, Windows, Linux
 * 
 * Selenium.dev/downloads will contain the latest Selenium version
 * Github Repository for Selenium - github.com/Selenium HQ/selenium
 * 
 * Selenium cannot talk directly with Database, need to add JDBC library to talk with Database
 * Cannot automate desktop application, Requires java library apache POI
 * Selenium will not automate mobile application - Appium for mobile application automation
 * 
 * How Selenium interact with browser?
 * Langugae bindings - Java, C#, Pyhthon, JS - Code will be connected to the browser using W3C protocol
 * It will send a API call through W3C protocol,
 * then it will download the driver, then the browser will be launched, then it will give a response
 * 
 * Selenium dependency need to be added in pom.xml - 4.13.0 version
 * We will get the dependencies from Maven repository
 * 
 * Go to Maven repository.com - Search Selenium
 * All the selenium version will be displayed
 * We should not go with the latest version as it will have some issues
 * When yu open Maven dependencies, all the jar file will be added
 * 
 * If yu want to change the version, change in pom.xl dependency
 * All the jar file will be updated automatically in Maven dependencies
 * So that we are going with Maven Project.
 * If it is Java project we need to add all the library manually
 * 
 * Diff b/w Github & Selenium
 * Github is to push the code, Maven contains the selenium dependencies 
 * 
 * 1 missing
 */
