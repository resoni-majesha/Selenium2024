package week5.day5121;

public class TestNgNotes {

	
}

/*
* TestNG - Test Next Generation
* TestNG is a Test Execution Framework -> More Features
* Official Website: testng.org
* Open Source Framework -> Has a detailed documentation
* Developed by Cedric Beust in 2004. Current version 7.10.2. We are gonna use 7.4.0
* Developed from the inspiration of junit & nuit - Unit testing frameworks for Java & .Net
* Drawbacks of junit & nuit are closed in TestNG
* TestNG can be used for unit testing, functional testing, End to end testing
* Its a integration testing framework
* junit & nunit can be used only for unit testing
* TestNG is more popular in the Testing Industry
* junit is used by the developers
* So we are learning TestNG with Selenium
* Why TestNG? We are able to execute Create Lead, Edit Lead, Delete Lead etc., testcases. Then whats the purpose of TestNG
* Consider yu have 100 testcases. Yu need to run all the 100 testcases at the sametime (with a single click)
* Doing this manual will take lot of time
* 
* Advantages
* 1. TestNG gives a simple solution to execute all the testcases sequentially
* 
* 2. Execute the Testcases parallely
* If yu have 100 TC's, yu will take 4 hours to execute it. If your manager wants to complete the execution within one hour,
* then it can be done by choosing the priority testcases, parallely with different browsers, If yu have additional resource like 4 
* people,yu can complete within one hour. 4 modules, Mdule 1 by one person, 2 by another and so on.
* Same can be achieved in Automation also
* 
* 3. Test execution summary
* If yu entering the wrong element id, name -> then the element will not be present in the DOM -> NoSuchElementException -> TC Fails
* But we wont get the pass/Fail status, which we need to send after each execution
* 
* 4. HTML report at the end of execution -> which can be shared to stakeholders
* 
* 5. Parameterize the testcase - To execute multiple data
* We can parameterize the execution with multiple set of data. eg: Leaftaps -> yu have login with uname & pwd
* Using right uname & pwd, wrong uname & right pwd, right un=ame & wrong pwd, wrong uname & pwd
* If yu want to create lead yu can use multiple first name, last name etc
* Annotations & Attributes helps yu to control the execution
* 
* 6. Assertion - TestNg verification
* Lets say if yu want to verify something, we use if condition. eg: Verify the title. TestNG has assertion - To compare 2 values
* If both matches, it's passed, else its failed. Assertion is used instead of conditional statement in TestNG
* 
* 7. Catergorize the testcases using groups
* If yu have 200 testcases, out of which 50 TC's are regression testcases, 20 smoke TC's
* If your manager ask yu to execute only the regression testcases, yu can categorize the testcases
* 
* 8. Retry the failed testcases
* Yu executed 100 testcases, 5 testcases failed and yu raised a defect.
* Developer fixed those 5 and yu want to re execute those 5 testcases, which can be done by TestNG
* 
* 9. Cross browser testing
* Testing in different browsers
* 
* Setup:
* TestNG - Eclipse Plugin
* TestNG Maven dependency
* 
* week5.testcase package has all the testcases
*/ 