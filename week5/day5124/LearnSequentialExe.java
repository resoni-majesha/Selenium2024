package week5.day5124;

public class LearnSequentialExe {

}

/*
* Sequential Execution
* Steps to execute multiple testcases sequentially
* Step 1: Select the testcases with @Test
* Step 2: Right Click -> Convert to TestNG
* Step 3: Generates XML structure with the selected testcase and click ok
* Step 4: Allows to execute multiple testcases, when executed as TestNG suite
* 
* XML file structure
* <suite> - root element of xml file, it contains multiple <test> elements
* <test> - represents the test suite which contains multiple <classes>
* <classes> - represent test classes execute and contains multiple <class> to be run
* <class> - represents the specific test class which holds the information like class name of which is to be executed
* suite name, test name can be customized
* Click on all the files with @Test CreateLead, DeleteLead, EditLead, DuplicateLead
* Right click -> Convert to testNG -> Customize the name  as sequential execution - testng-seq.xml file will be created
* Execution order will be similar to the file ordered in XML
* To print the error log in the console, add verbose in xml file, value can be given from 1 to 10
* If yu give 0, it won't print the log in the console
*/