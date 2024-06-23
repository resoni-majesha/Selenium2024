package week5.day5121;

import org.testng.annotations.Test;

public class LearnTestNgAttributes {

	/*
	 * @Test(invocationCount=5) public void createLead() {
	 * 
	 * System.out.println("Create Lead"); }
	 */
	
	@Test
	public void createLead() {
		
		System.out.println("Create Lead");
	}
	
	@Test
	public void editLead() {
		
		System.out.println("Edit Lead");
	}
	
	@Test
	public void deleteLead() {
		
		System.out.println("Delete Lead");
	}
	
}

/*
* Yu have testCase1 in this class
* When some testcase fail, if the data is not there in application,
* If yu dont want to execute those scenario, if yu want to have enough data forming testcase
* To create a testdata, yu need to create createLead testcases 5 times
* To run the createLead testcase 5 times, we normally put it in the for loop
* But in TestNG, they are giving an attribute - invocationCount -> @Test(invocationCount=5)
* If yu given invocationCount = 5, the testcase will be executed 5 times
* 
* If yu have 3 testCases in TestNgAttribute class and it has same annotations for all the testcases,
* then the order of execution will be in ASCII order // c, d, e
* 
* So, in xml, its based on the position, but in testcase, its based on the ASCII order
* 
* If yu want to change the execution order, // c, e, d, then there is an attribute called priority
* 
* TestNG Attributes:
* invocationCount
* priority
*/