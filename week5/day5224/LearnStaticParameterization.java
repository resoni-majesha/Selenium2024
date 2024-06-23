package week5.day5224;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;

public class LearnStaticParameterization {

}

/*
* No hardcoding of data inside the java class
* What? To pass the external testdata to the testcases
* Why? To test the same functionality with different set of data or for running the same test with different configurations 
* How? Using TestNg annotations based on the data type
* Two ways to achieve parametrization
* 1. Static Parameterization - email id uname & pwd
* 2. Dynamic Parameterization - Forms-> Each time providing different data
* 
* Static Parametrization
* To pass the data through xml file
* Can be achieved through @Parameters annotation in testmethod
* Syntax: @Parameters({"url", "username", "password")}
* Advantage:
* Confidential credential if we give in testcase, everyone will see. 3rd person will misuse it
* In that case we can parameterize the values, we will pass the value in some other way
* 
* Steps to achieve static parameterizaion
* Step 1: Passing the data through xml file
*       Syntax in xml file:
*       <parameter name = "username" value="demosalesManager"></parameter>
* We need to give the name & value always
* 
* Step 2:  Add @Parameter annotation in the BaseClass
* Take the value from the xml file and provide it in the BaseClass file
* @Parameter("username")
* username -> comes from the <parameter> in xml file, name should be similar to the name in xml file
* 
* Step 4:
* @Parameter order in BaseClass should be same when we pass the values in driver.findElement
* Pass the hardcoded value in the method
* 
* To pass data which are common to all testcases
* can be done at both suite level and test level
* 
* Steps to implement Static Parameterization: 
* 
* Step 1: Identify the data that are common across all the test cases 
* Step 2: Add parameter tag for each data in the XML file 
* ex: url,username,password ,browser 
* Step 3: Map the parameters in the class using @Parameters ex: @Parameters({"url","username", "password"}) 
* Note: The name should exactly match the names in the xml 
* Step 4: Use that parameters inside the method using arguments Note: Sequence matters but the name of the arguments does not matter 
* Step 5: Finally, replace the arguments with the hardcoded values 
* Note: You should always run from the xml file when you use parameters
* 
* Copy createlead, delete lead, projectspecificmethods and paste in week5.5224
* Convert to xml file
* Add the parameter value in xml file manually
* If yu provide the value inside suite, it will be applicable for all 
* <parameter name="url" value="http://leaftaps.com/opentaps/control/main"></parameter>
* If yu provide the parameter value in test it will be applicable only to that test
* <parameter name="username" value="DemoSalesManager"></parameter>
* <parameter name="password" value="crmsfa"></parameter>
* 
* Go to base class, ProjectSpecificmethod and add @Parameter({"url","password","username"}), give the value in any order
* 
* When yu come to input args, yu should follow the same @Parameter order in ProjectSpecificmethod 
* public void preSetup(String url, String pwd, String uname)
* Provide the hardcoded value and pass the variable name as given input args
* driver.get(url);
* driver.findElement(By.id("username")).sendKeys(uname);
* driver.findElement(By.id("password")).sendKeys(pwd);
* Run the xml file
* 
* Cross Browser testing
* Add <parameter name="browser" value="chrome"></parameter> for TestCase1
* Add <parameter name="browser" value="edge"></parameter> in TestCase2
* Add browser in @Parameters({"url","password","username","browser"})
* Add String browser in public void preSetup(String url, String pwd, String uname, String browser)
* For crossbrowser testing add the if elseif statement, as yu need to use 2 browsers - Chrome, Edge
* if(browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if(browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver(); 
		}
* We won't be able to import edge, as the driver declared globally is public ChromeDriver driver;
* Now, add the grandparent class - RemoteWebDriver as globally		
* public RemoteWebDriver driver;
* Now, run the static-parameter xml file
* 
* To run the testcases parallel, add threadCount & parallel="tests" in suite 
* <suite name="Suite" thread-count="5" parallel="tests" verbose="5">
*/