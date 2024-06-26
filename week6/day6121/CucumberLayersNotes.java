package week6.day6121;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CucumberLayersNotes {

}

/*
* BDD framework will understand the Gherkin language
* Jherkin language is nothing but the below keywords
* Keywords
* 
* 1. Feature                    6. Then                   9. Scenario Outline
* 2. Background                 7. And                    10. Examples
* 3. Scenario                   8. But
* 4. Given
* 5. When
* When yu use these keywords to write your scenarios, then it is a Gherkin language
* 1. Feature: Functionality 
* eg: Login functionality is used to login to the application, Create lead functionality is used to create leads
* 
* 2. Scenario: Testcase
* Test Scenario for login functionality
* i) Positive Scenario: Passing correct username & password
*                       Demosalesmanager / crmsfa
*                       DemoCSR / crmsfa
* ii) Negative Scenario: Passing incorrect username & password
* 
* Testcase will have Testcase ID, Testcase, Name, Testcase Description, - These are identifiers in any testcase
* Test Data, Precondition, Test Steps, Expected Results, Actual Result - These are important in any testcase
* So, wherever there is a preCondition, that has to be represented with a keyword called Given
* 
*  3. Given - PreCondition
*  4. When - Test Condition
*  5. Then - Expected results for positive scenarios
*  6. But - Expected results for negative scenarios
*  
*  
*  Layers in Cucumber Framework
*  Layers are nothing but packages, we are going to create 3 packages
*  3 Layers
*  
*  Features                           Step Definition/Implementation                                      Runner
*  (Gherkin)                          (Java methods)                                                      (TestNG)
*  
*  1. Features - You have to write the testcases using Gherkin language
*  2. Step Definition/Implementation - Whatever test step we write that has to be implemented in Java Code using Selenium
*  3. Runner - Whatever code(testcase) we write that has to be executed using TestNG as runner to execute the testcases
*  
*  To have cucumber, we need to add 2 dependencies, cucumber-java - To get cucumber annotations & cucumber libraries, 
*  cucumber-testng - To run the cucumber program 
*  
*  We should have 2 plugins
*  1. Cucumber Eclipse Plug-in
*  2. Natural Plug-in
*  Go to Help -> Eclipse Marketplace -> Search Cucumber
*  
*  For a clear reference, write the cucumber code in src/test/java
*  Cucumber has 3 layer i.e, 3 packages
*  Create 3 packages under src/test/java - features, steps, runner
*  
*  Now, create a test scenario in Cucumber
*  Use features package & create testcase in Gherkin language
*  Right click on features package -> File -> New, write the file name as Login.feature
*  .feature file extension in file name is mandatory
*  You could see green color icon under features package
*  
*  Keywords are case sensitive. It should end with colon. Then only the keyword would be enabled in purple color
*  Syntax: Init caps and end with colon
*  
*  Step 1: Feature:
*  Then write the description what is the feature you are going to test
*  Feature: Login functionality of Leaftaps application
*  
*  Step 2: Scenario:
*  Write description
*  Scenario: Login with correct credentials
*  
*  Steps for login functionality
*  1. Open the Chrome browser
*  2. Load the application URL
*  3. Enter username as DemoSalesManager
*  4. Enter password as crmsfa
*  5. Click on login button
*  
*  Expected result:
*  Home page should be displayed 
*  
*  Step 3:
*  Precondition: 
*  Open the Chrome browser
*  Load the application URL
*  
*  Given Open the Chrome browser
*  Colon is not required for steps 
*  Given Load the application URL
*  
*  Step 4: 
*  Enter username as DemoSalesManager
*  Enter password as crmsfa
*  Whether the above 2 are pre condition or test condition
*  Yes it's a pre condition, as there is no validation happens, we are just entering the value
*  Another example, if yu go to GitHub signup page and entering an username that already exist, 
*  then it will show Username is not available. Here it performs a validation as it checks with the database
*  But when yu enter the usename in LeafTaps nothing happens, so it is not a validation 
*  If no validation happens in the backend, then it is not a test condition, its a precondition
*  
*  Given Enter username as DemoSalesManager
*  Given Enter password as crmsfa
*  
*  
*  Step 5: 
*  Click on login button
*  When clicking on login button, it checks the database whether the entered username or pwd already exists
*  If the username / pwd is correct, then it will allow inside the application based on the validation
*  So, this is a test condition as this is a validation
*  Keyword for test condition is When
*  
*  When Click on login button
*  
*  Step 6:
*  Expected result:
*  Home page should be displayed 
*  Use keyword then, as it is a positive flow
*  
*  Then Home page should be displayed 
*  
*  Feature: Login functionality for leafTaps application
*  Scenario: Login with correct credentials
*  Given Open the Chrome browser
*  Given Load the application URL
*  Given Enter username as DemoSalesManager
*  Given Enter password as crmsfa
*  When Click on login button
*  Then Home page should be displayed 
*  
*  If yu look into the Login.feature steps, Given comes multiple times
*  If the keyword comes sequentially, then for readability purpose use the keyword And
*  And is the conjuction used for a readability purpose
*  
*  Given Open the Chrome browser
*  And Load the application URL
*  And Enter username as DemoSalesManager
*  And Enter password as crmsfa
*
* We get a warning in feature file, as we didn't implemented the steps in Java
* We should implement all the steps. Feature file will not get executed
* 
* Go to the steps package and create a new class & the class name is LeafTapsLogin
* 
* Once LeafTapsLogin is done, then go to runner class called RunLogin
* 
*/