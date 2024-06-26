package week6.day6121;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;

public class MPassDataToMethodFromFeatureFile {

}

/*
* Create MLogin.feature file, make the other changes in the already created files itself -> LeafTapsLogin.java, RunLogin.java
* If yu go to MLogin.feature file, Demosalesmanager, crmsfa are datas
* If yu look into the method implementation, we hardcoded the data
* Tomorrow, if yu change the data in the feature file, Demosalesmanager as DemoCSR, 
* we need to change the harcoded data in the method inside steps package
* driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
* Should change driver.findElement(By.id("username")).sendKeys("DemoCSR");
* Changing the data in Java file is not a good approach, it will undergo code review
* 
* Step 1:
* Go to MLogin.feature file, Demosalesmanager a String data, Put the 'Demosalesmanager' inside single quotes
* And Enter username as DemoSalesManager -> And Enter username as 'DemoSalesManager', repeat the same for password crmsfa
* Now, go to the method implemetation, i.e, Java file LeapTapsLogin, Remove the Demosalesmanager text from the @Given() annotation
* add a curly braces {} and add string text inside the curly braces
* @Given("Enter username as DemoSalesManager") -> @Given("Enter username as {string}")
* Repeat the same for password crmsfa also
* @Given("Enter password as crmsfa") -> @Given("Enter password as {string}")
* 
* Step 2: 
* Pass the data to the method
* If yu want to pass data to the method, create argument for the method. So create a single argument - String username
* pass the username to sendKeys()
* Create a single argument
* @Given("Enter username as {string}")
* public void enterUserName(String username) {
* driver.findElement(By.id("username")).sendKeys(username);
* }
* Repeat the same for password - crmsfa
* 
* So, tomorrow, if yu want to change the different username , pwd, go to MLogin feature file and just change the uname & pwd
* No need to touch the Java code
* 
* We can also pass the url from the feature file
* Go to Mlogin.feature file
* And Load the application URL -> And Load the application URL as "http://leaftaps.com/opentaps/control/main"
* @Given("Load the application URL as {string}")
* Pass String url as argument to the method
* Add url to driver.get(url)
* If yu want to run for UAT env, then yu can change the url in MLogin.feature file
* 
* So the data is taken from the feature file
* 
* Consider, yu have another testcase for negative scenario - Incorrect password
* 
* Scenario: Login with incorrect credentials
* Given Open the Chrome browser
* And Load the application URL as "http://leaftaps.com/opentaps/control/main"
* And Enter username as 'DemoSalesManager'
* And Enter password as 'crmsfa123'
* When Click on login button
* But Error message should be displayed 
* 
* Now the execution will happen 2 times for each scenario
* 
* Here Given Open the Chrome browser already implemented in steps java file, so we shouldn't do another implementation
* For negative Open Chrome browser scenario, the positive open Chrome browser will be executed
* 
* Here we provide the incorrect password, for that we shouldn't write the implementation again as the data will be taken from feature
* If yu another write implementation for incorrect password, then it will throw an exception called DuplicateStepDefinitionException
* 
* Write implementation for @But()
* 
* If yu dont have implemenation for any one of the step eg: But Error message should be displayed, 
* then it will throw an exception called UndefinedStepException and a snippet on how to write the method
*/