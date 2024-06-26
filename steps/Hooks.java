package steps;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseClass {
	
	@Before
	public void preCondition() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://leaftaps.com/opentaps/control/main");

	}
	
	@After
	public void postCondition() {
		
       driver.close();
	}

}

/*
* Common methods for Hooks
* 
* We have Background scenario in both BLogin.feature, CreateLead.feature
* Create a Java class in steps package named Hooks
* Hooks in cucumber has 2 annotations
* 1. @Before
* 2. @After
* Why are these annotations are called as Hooks,
* Initially Cucumber was developed in a language called Ruby
* In Selenium Java, we call it as @Before, @After as annotations, but in Ruby they call it as Hooks. Still they use the same name
* 
* Within Hooks class, create methods, preCondition, postCondition
* Provide @Before annotation for preCondition method and import it from cucumber.io 
* Provide @After method for postCondition
* 
* Hooks is a java class, so it should also extends BaseClass
* Take the common Background scenarios from feature file i.e., copy the codes from LeafTapsLogin
* and put it in the Hooks class preCondition
* driver = new ChromeDriver();
* driver.manage().window().maximize();
* driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
* Remove it from the LeafTapsLogin class
* 
* And the post condition would be driver.close();
* 
* Copy driver.get(""); also in preCondition()
* 
* Now, the Background in both feature files are not required. Comment that in BLogin.feature, CreateLead.feature
* As it will get executed from the Hooks class preCondition
* 
* Steps:
* 
* Created a Base Class
* Declared the driver globally as static variable
* Create a Hooks class and implement @Before & @After methods
* All the Java class should extends BaseClass
*/