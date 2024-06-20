package week4.day4124;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://leafground.com/alert.xhtml");
        
        driver.findElement(By.xpath("//span[text()='Show']")).click();
        
        // Switch driver control to alert
        Alert alert = driver.switchTo().alert();
        
        // Use the alert methods
        String alertText = alert.getText();
        System.out.println(alertText);
        
        // If yu are not handling the alert, then it will throw UnhandledAlertException
        // i.e., if the alert presents but yu are doing some other action -> Instead of line no: 32, 
        // you write & execute line 29 before line no: 33 alert.accept()
        // driver.findElement(By.xpath("//span[text()='Show']")).click();
        
        // Accept the alert
        alert.accept();
        
        // 2 exceptions
        // alert.accept(); // 1st alert -> Trying to accept the alert again -> Will throw an exception
        // If there is not alert and if yu try to accept it, it will throw NoAlertPresentException
        
        // 2nd alert Line no: 27 to 29
        
        // To click on the next alert show button
        // driver.findElement(By.xpath("(//span[text()='Show'])[1]")).click();
        
        // Sweet Alert
        driver.findElement(By.xpath("(//span[text()='Show'])[3]")).click();
        
        // Click on dismiss
        driver.findElement(By.xpath("//span[text()='Dismiss']")).click();
	}

}

/*
 * Target Locators
 * Alert - represents an alert dialog box
 * Frame
 * Window
 * When alarm rings, there will be snooze & stop button
 * We cannot open any other apps when the alarm rings
 * We need handle the alert in Selenium
 * When we handle the alert then only we can do other actions
 * Go to hdfc netbanking -> dont enter cust id, click continue > alert appears > 
 * which comes from the application and not the browser
 * We cannot do any action in the webpage when the alert appears
 * When go to a shop, there will be sensors as the product should not go outside without billing / unbilled products
 * Next example Ambulance -> Alarm to indicate the people to provide way
 * Alert is a information or message thrown from the application
 * How to handle -> Transfer the driver control to the alert box
 * Alerts are designed by javascript function
 * To confirm the popup as an alert, check the element that we can't able to inspect, cannot be ignored
 * We won't be able to inspect alert 7 we won't be able to access anything in the webpage
 * Types - 2 types
 * 1. Modal Alert - 
 *    i) Simple - Handle using normal click action
 *    ii) Confirmation
 *    iii) Prompt
 * 2. Non-Modal Alert - i) Sweet - Handle using normal click action
 * 
 * i) Simple Alert - It allow you to do only single action -> If we click on OK in the alert then we accept the alert information
 * Able to retrieve the text from the dialog box and print it in the console
 * ii) Confirmation Alert - Want to submit an online test -> Allows to chooose any one action
 * We can accept /reject by clicking on Ok or Cancel
 * Allows to get the text from the dialog box
 * iii) Prompt Alert -> One textbox and 2 button -> Can we enter anything and then click on OK or Cancel
 * Allows to choose anyone action, Accept/reject the dialog box, allows to get the text from the dialog box
 * allows to give user input into the alert box
 * 
 * How to handle it?
 * Transfer the driver focus to alert box
 * Syntax: driver.switchTo().alert();
 * Return type of it is Alert Interface and the implementation class is RemoteAlert
 * 
 * Actions allowed in Alert Interface
 * void accept() - To accept the alert
 * void dismiss() - to cancel the alert
 * String getText() - to get the text from the alert box
 * void sendKeys(String keysToSend) - to enter the text into the alert box
 * 
 * Exceptions in alert
 * 2 exceptions
 * 1. If there is not alert and if yu try to accept it, it will throw NoAlertPresentException
 * 2. If yu are not handling the alert, then it will throw UnhandledAlertException
 * 
 * Sweet Alert
 * Click on show button
 * Click on close or dismiss
 */
