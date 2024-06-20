package week4.day4224;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnSnapShots {

	public static void main(String[] args) throws IOException {
		
		ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://www.amazon.in/");
        
        WebElement ele = driver.findElement(By.linkText("Sell"));
		
        // Create a folder inside your project -> Not under src main Java but in your project
        
        // Step 1: Take a screenshot
        File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
        
        // Step 2: Create a path for the snapshot to be added
        // File trg = new File("./Snaps/img.png"); // ./ represents current project, Snaps -> folder name
        
        File trg = new File("./Snaps/img1.png");
        
        // Step 3: To connect step 1 & step 2 -> Merge
        FileUtils.copyFile(screenshotAs, trg);
        
        // Run the program, Refresh the project -> Right click -> Refresh, Open Snaps -> Open with System Editor
        
        // To take another page snapshot, write the code line 22 and rename the img name as img1 in line 32
	}

}

/*
* For snap shots, need to add commons-io dependency in pom.xml
* 1. Create a folder inside your project -> Not under src main Java but in your project
* 2.
*/