package week5.day5121;

public class LearnParallelXml {

}


/*
* Parallel Execution
* Select all the 3 testcases -> Right click -> TestNg -> Convert to TestNG
* There will be an option called parallel mode -> Select classes under parallel mode -> Change location name as testng-parallel.xml
* Click on Finish. xml file testng-parallel.xml will be created under the project
* Open it, yu could see there will be an attribute called parallel classes under test set
* parallel = "classes" in suite set is not required
* There will be an attribute called thread count = "5", it decides how many maximum browsers can be opened at a time
* If yu have Tc's less than 5 then it is fine
* If yu have more than 5 testcases then it will open 5 browsers in the order given in xml file
* Other TC's will be in queue, if any testcases. If any TC's completed first, then the 6th testcase will be executed
* thread count we can give any number based on your system configuration -> Real time 5 will be fine
*/