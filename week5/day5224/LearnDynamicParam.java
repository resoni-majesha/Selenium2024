package week5.day5224;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;

public class LearnDynamicParam {

}

/*
* Dynamic Parameterization
* Where can we apply dynamic parameterization? @Test
* What? To pass the external test data to testcases
* Why? To test the same functionality with different set of data or for running the same test with different configurations
* How? Using TestNG annotation based on the type of data
* 
* Supports multiple set of data to pass into single functionality
* Can be achieved by using @DataProvider annotation on top of the method supplying data to testcase
* 
* Dynamic Parameterization: 
* 1. Identify the data that are need to be dynamic for the particular testcase 
    ex: CreateLead : companyName, firstName, lastName, phoneNumber EditLead : phoneNumber,companyName 
* 2. Create a method sendData and annotate with @Dataprovider annotation and give a name for the DataProvider 
* 3. Create an Input array with rowCount and columnCount - add datas into the array with index starting from 0 
* 4. Return data back to the calling method 
* 5. Receive the data in the testcase using dataProvider attribute 
* 6. Pass input arguments to the test method and replace all the hardcoded data
* 
* @DatatProvider
* public object[][] senddata(){
* object[][] data = object[2][2];
* data[0][0]=01;
* data[0][1]="Emp1";
* 
* data[1][0]=02;
* data[1][1]="Emp2";
* 
* Steps:
* Steps 1: Create a normal method with return type of String[][]
* Step 2: Declare and assign the value to the 2D dimensional array
* Step 3: Add @DataProvider annotation on top of the method
* Step 4: Add dataProvider attribute the @Test Method
* Step 5: Add arguments to @Test method to pass data from the DataProvider method
* 
* @DatatProvider(name="getData")
* public String[][] fetchdata(){
* String[][] data = new String[2][4];
* data[0][0]="TestLeaf";
* data[0][1]="Hari";
* data[0][2]="R";
* data[0][3]=99;
* 
* data[1][0]="TestLeaf";
* data[1][1]="Babu";
* data[1][2]="G";
* data[1][3]=91;
* 
* return data;
* 
* public class CreateLead extends BaseClass{
* @Test(dataProvider = "getData")
*    public void createLead(String companyName, ....) {
*    
*    }
*    
* Here the 2 set of data is passed to create lead functionality
* Each data
* }
* 
* data[1][0]=02;
* data[1][1]="Emp2";
* 
* Copy the CreateLead again and rename it as CreateLead1
* Add below parameters in dynamic-parameter.xml file
* <parameter name="url" value="http://leaftaps.com/opentaps/control/main"></parameter> in suite
* and the below parameters in test tag
* <parameter name="username" value="DemoSalesManager"></parameter>
* <parameter name="password" value="crmsfa"></parameter>
* <parameter name="browser" value="chrome"></parameter>
* 
* Here, identify the dynamic data
* we have createLeadForm_companyName, createLeadForm_firstName, createLeadForm_lastName, createLeadForm_primaryPhoneNumber
* Annotate it with @DataProvider
* Provide name for @DataProvider, (name="getValue") before array method
* @DataProvider(name="getValue")
* 
* Create an Input array with rowCount and columnCount
* 4 values, company name, firstname, lastname, phone number, we are going to add 3 leads
* So create a 2 dimensional array with String[3][4] memory
* public String[][] fetchData() {
		// index value starts from 0
		String[][] value= new String[3][4];
* Add the values
* value[0][0] = "TestLeaf"; add fname, lname, phno also
* value[1][0] = "TestLeaf";
* value[2][0] = "TestLeaf";
* 
* Finally return the value -> return value;
* 
* Receive the data in the testcase using dataProvider attribute
* Add (dataProvider = "getValue") in @Test(dataProvider = "getValue")
* 
* Add the arguments to @Test method to pass data from the DataProvider method
* public void createLead(String cName,String fName,String lName,String phNo)
* 
* Remove the hard coded value and pass the variable
* driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
* driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
* driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
* driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phNo);
* 
* If yu want to create 50 datas, it will be difficult, so dynamic parameterization is not used in real time
* So we go for excel integration
* 
*/