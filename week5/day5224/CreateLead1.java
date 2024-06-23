package week5.day5224;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead1 extends ProjectSpecificMethod {

	@DataProvider(name="getValue")
	public String[][] fetchData() {
		// index value starts from 0
		String[][] value= new String[3][4];
		value[0][0] = "TestLeaf";
		value[0][1] = "Aravind";
		value[0][2] = "R";
		value[0][3] ="9878";
		
		value[1][0] = "TestLeaf";
		value[1][1] = "Ragu";
		value[1][2] = "G";
		value[1][3] ="9879";
		
		value[2][0] = "TestLeaf";
		value[2][1] = "Vinoth";
		value[2][2] = "S";
		value[2][3] ="9876";
		
		return value;
	}
		
	@Test(dataProvider = "getValue")
	public void createLead(String cName,String fName,String lName,String phNo) {
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phNo);
		driver.findElement(By.name("submitButton")).click();
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if (text.contains("Testleaf")) {
			System.out.println("Lead created successfully");
		}
		else {
			System.out.println("Lead is not created");
		}
		


	}

}

/*
* Created for dynamic parameterization
*/