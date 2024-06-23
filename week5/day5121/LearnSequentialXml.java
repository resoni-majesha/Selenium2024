package week5.day5121;

public class LearnSequentialXml {

}

/*
* How to execute testcases sequentially & parallely
* 
* Sequentially
* To execute CreateLead, EditLead & DeleteLead testcase sequentially
* Press ctrl button and select all the 3 programs -> Right Click -> TestNG -> Convert to TestNG
* An XML file will be created -> If yu want to change the name, change it in location & click on finish
* testng_seq.xml -> Open it
* 
* <?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
<suite name="Suite">
  <test thread-count="5" name="TestLead">
    <classes>
      <class name="week5.testcase.DeleteLead"/>
      <class name="week5.testcase.EditLead"/>
      <class name="week5.testcase.CreateLead"/>
    </classes>
  </test> <!-- Test -->
  
  <test thread-count="5" name="TestAccount">            // Example for multiple test set inside <suite> tag
    <classes>
      <class name="week5.testcase.DeleteAccount"/>
      <class name="week5.testcase.EditAccount"/>
      <class name="week5.testcase.CreateAccount"/>
    </classes>
  </test>  
</suite> <!-- Suite -->
* 
* xml file structure
* 
* first tag
* <suite> - Set of different testcases -> Name of the suite tag comes by default as Suite. If yu want yu can change the suite name
*           name - LeafTaps
*   <test> - Set of test cases belongs to some modules or regression TC's, get all the reg TC's under one test set or module 1, 2,...
*            You can change the test name. Test tag means multiple testcases -> For release 1, release 2, ....
*            eg: If yu have worked with HP ALM, yu will create test suite to execute any testcases
*            Under <Suite> tag yu can have multiple test set, but we should give different name for each set
*            name - LeafTaps-Leads
*      <classes>
*         
*           <class name = "packageName.className"
*       
*      </classes>
*   </test>
* </suite>
* 
* There is no need to create the xml file manually, select the testcase and convert it into xml file
* Now, go to testng_seq.xml and run as TestNG. It will execute all the 3 programs
* Order of execution will be based on the positions yu have placed the testcases in xml file
* If yu want to change the order of execution, yu can change it in the xml file by copy and paste each class name
* So, we can edit the xml file. If yu want to add the duplicate lead, yu can add it in the xml file 
* <class name="week5.testcase.DuplicateLead"/>
* But duplicate lead should have @Test
* 
* If yu don't want to execute any one of the file, then yu can comment out the particular line -> ctrl+Shift+/
* Yu can delete also
* 
* Now, Run the xml code - testng_seq.xml
* If anything fails, go to console - Results of running suite & click the failed method, yu will get a brief note
* 
* TestNG will generate the HTML report, where can we find it?
* Once the xml file is runned, right click on the project, click on Refresh -> yu will see a folder named test-output
* Expand test-output folder - yu will see, emailable-report.html -> Right click on it -> Open with System editor
* Yu will get a report with pass / fail status and also the execution time. This report can be mailed to the developers
* If any of the TC's are failed, yu can click on it and find the exception
* 
* There is an another important file calld index.html - This will have the result -> Result File
* When yu click on the first link, yu will have the xml code
* Click on the failed TC link to check the exceptions
* index.html is the result for the testng execution
* 
* Now, run createLead, editLead & deleteLead TC's individually, TestNG will create a xml file implicitly
* To check this, got to index.html, right click - Open with System Editor, yu will get the file - with name custom suite
* This is the default xml file
* 
* If yu make any mistake in element, it will throw NoSuchElementException. But it wont br printed in console
* Inorder to print it in console, add (verbose = " ") in the test tag under xml file
* verbose is an attribute to get the log in the console - with that we can debug and fix the issue
* Value for verbose is 1 to 10 -> 1 least, 10 max. If yu give least value, it will give least information, same for max
* For automation - 5 is enough
* What is the range for verbose - 1 to 10
* Default value - 2 
* How? If yu run the CreateLead class alone yu will get the log printed in console
* Go to index.html -> Right click -> Open, it creates the xml file with verbose = 2
* For 2 also, yu will get the same level of information 
*/