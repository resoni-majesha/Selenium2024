package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LeafTapsLogin extends BaseClass {
	
	// public ChromeDriver driver; // Move it to base class
	
	@Given("Open the Chrome browser")
	public void openChromeBrowser() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	/*
	 * @Given("Load the application URL") public void loadApplicationUrl() {
	 * 
	 * driver.get("http://leaftaps.com/opentaps/control/main"); }
	 */
	
	@Given("Load the application URL as {string}")
	public void loadApplicationUrl(String url) {
		
		driver.get(url);
	}

	/*
	 * @Given("Enter username as DemoSalesManager") public void enterUserName() {
	 * 
	 * driver.findElement(By.id("username")).sendKeys("Demosalesmanager"); }
	 */
	
	@Given("Enter username as {string}")
	public void enterUserName(String username) {
		
        driver.findElement(By.id("username")).sendKeys(username);
	}
	
	/*
	 * @Given("Enter password as crmsfa") public void enterPassword() {
	 * 
	 * driver.findElement(By.id("password")).sendKeys("crmsfa"); }
	 */
	
	@Given("Enter password as {string}")
	public void enterPassword(String password) {
		
		driver.findElement(By.id("password")).sendKeys(password);
	}
	
	@When("Click on login button")
	public void clickLoginButton() {
		
       driver.findElement(By.className("decorativeSubmit")).click();
	}
	
	@Then("Home page should be displayed")
	public void verifyHomePage() {
		
       System.out.println("Home page is displayed");
	}
	
	@But("Error message should be displayed")
	public void verifyErrorMessage() {
		
       System.out.println("Error message is displayed");
	}
	
	/*
	 * @And("Enter password as {string}") public void incorrectPassword(String
	 * password) {
	 * 
	 * driver.findElement(By.id("password")).sendKeys(password); }
	 */
}

/*
* We should implement all the steps. Feature file will not get executed
* 
* Go to the steps package and create a new class & the class name is LeafTapsLogin
* For each step, we have to create a method
* Step 1:
* public void openChromeBrowser() {
		ChromeDriver driver = new ChromeDriver();
	}
* Here feature Open Chrome Browser & steps Open Chrome Browser has no relationship
* To integrate it, write an annotation called @Given() at the top of the method
* Copy the Open browser text from feature file and pass it as argument in @Given method within double quotes
* @Given("Open the Chrome browser") Its integrated now
* 
* Step 2:
* Load the application URL
* driver.get("http://leaftaps.com/opentaps/control/main");
* driver will get error, a driver is not shared. ChromeDriver driver = new ChromeDriver(); -> driver is local variable
* Declare driver as global variable, it should be declared within the class
* public ChromeDriver driver; inside the class and remove ChromeDriver from driver = new ChromeDriver();
* driver.get("http://leaftaps.com/opentaps/control/main");
* @Given("") or And("") -> Using @And() will be confusing, so better go with @Given() in feature file
* 
* Step 3:
* Enter username as DemoSalesManager
* Enter password as crmsfa
* Create method for enterUserName 
* driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
* Create method for enterPassword
* driver.findElement(By.id("password")).sendKeys("crmsfa");
* @Given("") or And("")
* 
* Step 4: 
* Click on login button
* Create a method for clickLoginButton
* driver.findElement(By.className("decorativeSubmit")).click();
* @When("")
* 
* Step 5:
* Home page should be displayed
* Create a method verifyHomePage
* System.out.println("Home page is displayed");
* @Then
* 
* You can add the maximize & implicitly wait code in the openBrowser method
* 
* For pass data to method from feature file notes go to PassDataToMethodFromFeatureFile.java class under week6.day6121 package
*
*/