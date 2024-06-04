package week2.day2221;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnBasicXpath {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.findElement(By.xpath("//label[@for='username']")).sendKeys("demosalesmanager");
		
		driver.findElement(By.xpath("//label[@for='password']")).sendKeys("crmsfa");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();

	}

}

/*
 * Absolute Xpath
 * Yu want to go from T.Nager to Siruseri
 * We use google maps to traverse from one place to the other
 * If we give from starting point to the ending point then it is called absolute Xpath
 * Travelling from starting point all the way to the ending point
 * Absolute Xpath -> Root (Origin) to Destination
 * 
 * Xpath index starts from 1
 * If yu want to take another index, write the Xpath and use [] braces - Xpath[]
 * Absolute Xpath for Leaftaps username - /html/body/div[2]/div[2]/div/form/p/input[1]
 * Absolute Xpath are expensive, not recommended to use it, if developer add one new div in future in b/w
 * everything will break
 * 
 * Relative Xpath
 * eg: Yu already know the route, after 10 days yu are coming to Siruseri, yu need to come to my apartment
 * Now yu need only the partial route to come from Siruseri to my home
 * Relative Xpath -> Partial Location (not full)
 * Relative Xpath is easy to explain, i.e., From the closer point(Siruseri) to the destination
 * Use relative Xpath in reality
 * Relative Xpaths are preferred. 2 types
 * 1. Based on Attribute
 * 2. Based on Text
 * 
 * Syntax: 
 * Attribute based Xpath: //tagName[@attribute='attributeValue']
 * Text based Xpath: //tagName[text()='textValue']
 * 
 * Relative Attribute based Xpath for Leaftaps username - //label[@for='username']
 * Relative Attribute based Xpath for Leaftaps Login - //input[@type='submit']
 * We can use and & or to write the Xpath for 2 attributes
 * For login - //input[@type='submit' and @value=login'] - which is not required in real time
 * 
 * Relative Text based Xpath for Leaftaps username - //label[text()='Username']
 * 
 * We can also use contains
 * If there is username & tomorrow it can change as userid, so use contains
 * 
 * Partial Attribute based Xpath with contains for Leaftaps username
 * Syntax: //tagName[contains(@attribute,'attributevalue')]
 * //label[contains(@for,'user')] - Partial Attribute match
 * 
 * Partial Text based Xpath with contains for Leaftaps username
 * Syntax: //tagName[contains(text(),'textvalue')]
 * //label[contains(text(),'User')] - Partial Text match
 * 
 * Collection/Index Based Xpath
 * When there are multiple matches
 * Syntax: (Relative Xpath)[Index]
 * LeafTaps: Lead > Find Lead - (//input[@name='lastName'])[3]
 * 
 * Function Based Xpath
 * When there are multiple matches
 * First match doesn't have function
 * We can do [last()-1] to got to previous one from the last
 * Syntax: (Relative Xpath)[last()]
 * LeafTaps: Lead > Find Lead - (//input[@name='lastName'])[last()]
 * 
 */
