package week5.day5124;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class LearnAnnotations {
  @Test
  public void testCase1() {
	  System.out.println("@Test1");
	  
  }
  
  @Test
  public void testCase2() {
	  System.out.println("@Test2");
	  
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("@BeforeMethod");
	  
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("@AfterMethod");
	  
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("@BeforeClass");
	  
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("@AfterClass");
	  
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("@BeforeTest");
	  
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("@AfterTest");
	  
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("@BeforeSuite");
	  
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("@AfterSuite");
	  
  }

}

/*
* Learn TestNG Annotations
* Meta tags which provides information to the test methods
* Why? Maintain a structured, readable, user friendly testcases
* When? To control the execution order and behaviour of the test methods
* 
* Annotations:
* @BeforeSuite
* @BeforeTests
* @BeforeClass
* @BeforeMethod
* @Test
* @AfterMethod
* @AfterClass
* @AfterTest
* @AfterSuite
* @DataProvider
* 
* @Test is the mandatory annotation
* Annotation Hierarchy
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
* @Before - All the @Before annotations will be running before the testcases and are used to setup the preConditions
* @After - All the @After annotations will be running after the testcases and are used to setup the postConditions
* 
* @BeforeSuite
* @BeforeTest
* @BeforeClass
* @BeforeMethod
* @Test
* @AfterMethod
* @AfterClass
* @AfterTest
* 
* If yu have 2 @Test, @BeforeMethod and @AfterMethod will be executed for each @Test
* 
* @BeforeSuite
* @BeforeTest
* @BeforeClass
* @BeforeMethod
* @Test1
* @AfterMethod
* @BeforeMethod
* @Test2
* @AfterMethod
* @AfterClass
* @AfterTest
* 
* So we can add the common teststeps
*/