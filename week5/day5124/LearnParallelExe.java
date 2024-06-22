package week5.day5124;

public class LearnParallelExe {

}

/*
* Parallel execution
* It's mostly for time saving
* Steps to execute multiple testcases parallely
* Step 1: Select the testcases with @Test
* Step 2: Right click -> Convert to TestNG
* Step 3: Generates xml structure with the selected testcase
* There will be an option called parallel mode. Can be done in 3 ways
* 1. test -> multiple test suits inparallel
* 2. classes -> multiple <class> in parallel
* 3. methods -> test methods of a class in parallel
* 4. none -> default mode sequential
* 
* classes level
* Select the classes createlead, editlead, deletelead -> Right click -> convert to testNG
* 
* test level
* for test level we need multiple test part
* Copy and paste the test part
* First test has createLead, deleteLead
* Second test has editLead, duplicateLead
* Delete parallel = test, give it in suite level itself
* Remove threadCount, parallel= test in the suite tag
* Even if threadCount = "5", it will open 2 browser as we provided 2 class in 2 tests
* 
* Attributes in testng.xml
* threadCount
* will work only for parallel execution
* If threadCount = 5, 5 browsers will be created, which means 5 number of browsers to be opened
* We have 3 testcases, createlead, editlead, deletelead
* First thread will be assigned to first testcase, second thread to 2nd TC, 3rd thread to 3rd TC
* If yu have given threadCount as 10, 10 browsers will be opened and the system will hang. So yu should give threadCount as 5
* If yu give threadCount as 2 and yu have 3 testcase, #rd will be in queue, then the testcase which is executed first,
* then that thread will take the 3rd one to be executed.
* Minimum threadCount will be 2
* 
* Now, add the threadCount="5" parallel="classes" in first test tag, then 3 browsers will be opened,
* 2 for first test tag as it has parallel="classes", 1 for second test
* If yu add parallel="classes" in second test tag 4 browsers will be opened 
* 
* To get the status reprot, right click on project -> Refresh
* Yu have index.html, emailable -report.html -> Right click -> OPen with -
* > System Editor
* 
* If I have 50 TC's to be completed, then if i use parallel execution it will be completed faster
*/