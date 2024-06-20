package week4.day4124;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptExercise {

	public static void main(String[] args) {
		
          ChromeDriver driver = new ChromeDriver();
          driver.manage().window().maximize();
          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
          
          driver.get("https://leafground.com/alert.xhtml");
          
          driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
          Alert alert = driver.switchTo().alert();
          
          alert.sendKeys("Resoni");
          alert.dismiss();
          
          String text = driver.findElement(By.xpath("//span[@id='confirm_result']")).getText();
          System.out.println(text);
	}

}
