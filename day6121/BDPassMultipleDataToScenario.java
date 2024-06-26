package week6.day6121;

public class BDPassMultipleDataToScenario {

}

/*
* You want to execute single scenario for multiple set of data, uname: DemoCSR, Demosalesmanager in feature,
* then use a keyword called Scenario Outline - This Scenario Outline must be followed with Examples keyword
* Without examples, it will not get executed
* Use a pipe symbol 
* Examples:
* |username|password|
* Here first row is always the header, first data as username, second data as password
* Second row onwards provide the data
* |'Demosalesmanager'|'crmsfa'|
* |'DemoCSR'|'crmsfa'|
* 
* Examples:
* |username|password|
* |Demosalesmanager|crmsfa|
* |DemoCSR|crmsfa| 
* Enclose everything inside pipe symbol
* Inorder to represent this data, put it inside single quotes, provide string inside single quotes
* So this scenario is going to be executed 2 times, as it has 2 datas
* 
* Now, the Examples should be integrated to the below steps
* And Enter username as 'DemoSalesManager'
* And Enter password as 'crmsfa'
* So, remove the 'Demosalesmanager' and put angular bracet <> and add the column name inside it - <username>
* Do the same for password - <password> instead of 'crmsfa'
* 
* Same thing yu can do for url also, if yu are using different url
* 
* If you look into both the scenarios,
* Given Open the Chrome browser
* And Load the application URL as "http://leaftaps.com/opentaps/control/main"
* Both of them are common. Instead of writing same scenarios twice, use a keyword called Background
* Add the 2 scenarios in Background keyword
* 
* For that create a feature file called BLogin.feature
* Background:
* Given Open the Chrome browser
* And Load the application URL as "http://leaftaps.com/opentaps/control/main"
* This Background will be getting executed before each scenario
* 
* In TestNG @BeforeMethod annotation will be getting executed each times, similar to that Background keyword will also get executed
* 
* Now add Given for both the scenarios
* 
* There is no keyword in Cucumber to execute @AfterMethod scenarios
* 
* Now create another feature filed named CreateLead.feature - Go to CreateLeadNotes.java
*/