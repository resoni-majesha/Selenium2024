package week5.day5121;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TTestCase1Annotations extends TBaseClass {
  @Test
  public void test1() {
	  
	  System.out.println("test1");
  }
  
	/*
	 * @Test public void test2() {
	 * 
	 * System.out.println("test2"); }
	 */
  
  @BeforeMethod
  public void preCondition1() {
	  
	  System.out.println("Precondition for Testcase1");
  }
  
	/*
	 * @BeforeMethod public void beforeMethod() {
	 * System.out.println("beforeMethod - TestCase1"); }
	 * 
	 * @AfterMethod public void afterMethod() {
	 * System.out.println("afterMethod - TestCase1"); }
	 * 
	 * @BeforeClass public void beforeClass() {
	 * System.out.println("beforeClass - TestCase1"); }
	 * 
	 * @AfterClass public void afterClass() {
	 * System.out.println("afterClass - TestCase1"); }
	 * 
	 * @BeforeTest public void beforeTest() {
	 * System.out.println("beforeTest - TestCase1"); }
	 * 
	 * @AfterTest public void afterTest() {
	 * System.out.println("afterTest - TestCase1"); }
	 * 
	 * @BeforeSuite public void beforeSuite() {
	 * System.out.println("beforeSuite - TestCase1"); }
	 * 
	 * @AfterSuite public void afterSuite() {
	 * System.out.println("afterSuite - TestCase1"); }
	 */

}

/*
 * TestNG Annotations
 * 
 * @Test - Testcase
 * Create a new package -> Right Click -> TestNG -> Create TestNG class
 * Yu will be able to see the source folder. By default, the source folder will be src/test/java
 * You can change the src/test/java to src/main/java, otherwise it will be created in src/test/java - Be mindful on source folder
 * It will have the package name and class name. Enter the class name as TestCase1
 * Yu will have lot of annotations
 * @BeforeMethod @BeforeClass @BeforeTest @BeforeSuite
 * @AfterMethod @AfterClass @AfterTest @AfterSuite @DataProvider
 * Yu wont be able to see @Test annotation here
 * If yu create the TestNG class, @Test will be mandatory. So it will be added when yu create the class
 * 
 * Now, all the annotations are added & yu have the methods and syso statement
 * When yu run this as TestNG, the output will be 
 * beforeSuite
 * beforeTest
 * beforeClass
 * beforeMethod
 * test1
 * afterMethod
 * afterClass
 * afterTest
 * PASSED: test1
 * 
 * An xml file will be created in test-output -> index.html. Click on the link in the xml file
 * It look for an open suite tag it will execute the @Before Suite, if it sees an open test tag it will execute the @Test Suite
 * Next is open Class tag, @Class will get executed. 
 * Next to @BeforeClass, we have the testcase, testcase will be treated as Test Method
 * So, before each testcase @BeforeMethod will get executed, here we have only one testcase, 
 * so only one @BeforeMethod will be executed. Then it will execute @Test. Here @Test will be treated as Method
 * When we will call the method, it will point out the testcase
 * then @AfterMethod, class tag gets closed @AfterClass, then @AfterTest, then @AfterSuite
 * 
 * @BeforeSuite
 *     @BeforeTest
 *         @BeforeClass
 *            @BeforeMethod
 *               @Test
 *            @AfterMethod
 *         @AfterClass
 *     @AfterTest
 * @AfterSuite
 * 
 * Now consider yu have 2 testcases, test1(), test2(), the order of execution will be
 * beforeSuite
 * beforeTest
 * beforeClass
 * beforeMethod
 * test1
 * afterMethod
 * beforeMethod
 * test2
 * afterMethod
 * afterClass
 * afterTest
 * PASSED: test1
 * PASSED: test2
 * 
 * So, the @BeforeMethod & the @AfterMethod will be executed before & After each testcase
 * @BeforeSuite is not a mandatory annotation, if it exists it will execute, if its not there it not a problem
 * @BeforeTest, @BeforeClass are also not mandatory, if its not there it will not bother
 * @BeforeMethod & @AfterMethod are mandatory
 * 
 * All the annotations mentioned are specific to LearnTestNgAnnotations class
 * 
 * Let's create another class with all the above methods
 * but the TestCase name as test2 and the className as TestCase2
 * Create xml file for both current and the testcase2 class,name it as testng-annotations
 * beforeSuite - TestCase1
 * beforeSuite - TestCase2
 * beforeTest - TestCase1
 * beforeTest - TestCase2
 * beforeClass - TestCase1
 * beforeMethod - TestCase1
 * test1 - TestCase1
 * afterMethod - TestCase1
 * beforeMethod - TestCase1
 * test2 - TestCase1
 * afterMethod - TestCase1
 * afterClass - TestCase1
 * beforeClass - TestCase2
 * beforeMethod - TestCase2
 * test2 - TestCase2
 * afterMethod - TestCase2
 * afterClass - TestCase2
 * afterTest - TestCase1
 * afterTest - TestCase2
 * afterSuite - TestCase1
 * afterSuite - TestCase2
 * 
 * Here, suite, test, methods are common. If the annotations are common for both the classes, remove them from both the classes 
 * and add it to a new class named BaseClass
 * Apply Inheritance concept -> TestCase1Annotations extends BaseClass, TestCase2 extends BaseClass
 * Now, run the testng-annotations.xml file
 * 
 * beforeSuite 
 * beforeTest
 * 
 * beforeClass
 * beforeMethod
 * test1
 * afterMethod
 * afterClass
 * 
 * beforeClass
 * beforeMethod
 * test2
 * afterMethod
 * afterClass
 * 
 * afterTest
 * afterSuite
 * 
 * Now, consider the xml file has 2 test sets, each having 2 classes
 * 
 * beforeSuite
 * 
 * beforeTest
 * beforeClass
 * beforeMethod
 * test1
 * afterMethod
 * afterClass
 * 
 * beforeClass
 * beforeMethod
 * test2
 * afterMethod
 * afterClass
 * 
 * afterTest
 * 
 * beforeTest
 * beforeClass
 * beforeMethod
 * test1
 * afterMethod
 * afterClass
 * 
 * beforeClass
 * beforeMethod
 * test2
 * afterMethod
 * afterClass
 * afterTest
 * 
 * afterSuite
 * 
 * Based on the tags in xml, these annotations will be executed
 * 
 * We have BaseClass and it has all the common methods that are applicable for both testcase1 and testcase2.
 * Lets say yu have specific methods in testcase1 -> @BeforeMethod in TestCase1 class
 * Run the xml code now
 * 
 * beforeSuite
 * beforeTest
 * beforeClass
 * beforeMethod
 * Precondition for Testcase1
 * test1
 * afterMethod
 * afterClass
 * beforeClass
 * beforeMethod
 * test2
 * afterMethod
 * afterClass
 * afterTest
 * afterSuite
 * 
 * First before method executed from baseClass, then the precondition for testcase1 got executed
 * precondition wont get executed for testcase2 as it is specific only to testcase1
 * 
 * @BeforeSuite - Used when yu want to start anything at beginning of your execution. 
 *                eg: Test Report -> If yu want to start the report/capture the report
 *                Or if yu want to connect to a cloud environment to execute the automation code
 *                
 *     @BeforeTest - If yu want to give test details, db connection specific to that test
 *     
 *         @BeforeClass - If yu want to report the test details to report
 *         
 *            @BeforeMethod - Precondition for a testcase
 *               @Test
 *            @AfterMethod - Post condition for a testcase
 *            
 *         @AfterClass - If yu have any code to tear down -> tear down means close the connection
 *       
 *     @AfterTest - If yu want close the db connection
 *     
 * @AfterSuite - End report / close cloud environment connection
 * 
 * If somebody says his system is slow, because of Chrome browser and he wants to kill the Chrome after automation execution,
 * then he can put that code inside after suite
 */
