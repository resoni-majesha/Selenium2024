package week2.day2221;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebTable {

	public static void main(String[] args) {
		
        ChromeDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        
        driver.get("https://leafground.com/table.xhtml");
        
        // To get the text from the table in 2nd row, 1st cell(column)
        
		/*
		 * String text = driver.findElement(By.xpath("//table[@id='table_id']//tr[2]/td[1]")).getText();
		 * 
		 * System.out.println(text);
		 */
        
        /*// To get the first column, first data, add the above 2 lines inside the for loop
        
        for (int i = 2; i <= 5; i++) { 
        	
        // Here tr should be changed as tr[1], tr[2],... so write tr as tr[i] - //table[@id='table_id']//tr[i]/td[1]
        // 'i'is the variable, variable shouldn't come inside double qoutes - "//table[@id='table_id']//tr["+i+"]/td[1]"
        // Each time i  will be incremeted and the xpath will get changed. This is called dynamic xpath
        // We can do this only xpath locator(advantage of xpath)
       	// We can add variable within the xpath, if there is a variable with the xpath, then it is a dynamic xpath
        	
       	   String text = driver.findElement(By.xpath("//table[@id='table_id']//tr["+i+"]/td[1]")).getText();
   		 
       	   System.out.println(text);*/
        
        	
        /*// For dynamic row values, i.e., erail.in - from to search - Make the for rows dynamic, use dynamic for loop 
        
        List<WebElement> rows = driver.findElements(By.xpath("//table[@id='table_id']//tr"));
        
        for (int i = 2; i <= rows.size(); i++) {
			
        	String text = driver.findElement(By.xpath("//table[@id='table_id']//tr["+i+"]/td[1]")).getText();
      		 
        	System.out.println(text);
		}*/
       	   
        // If yu are dealing with rows and columns, use nested for loop
        
        /*List<WebElement> rows = driver.findElements(By.xpath("//table[@id='table_id']//tr"));
        
        for (int i = 2; i <= rows.size(); i++) { //rows
        	
        	for(int j = 1; j <= 6; j++) { // columns
			
        	// Add variable j in td	
        	String text = driver.findElement(By.xpath("//table[@id='table_id']//tr["+i+"]/td["+j+"]")).getText();
      		 
        	System.out.println(text);*/
       	   
        // To make the columns dynamic
        	
        /*List<WebElement> rows = driver.findElements(By.xpath("//table[@id='table_id']//tr"));	
        
        List<WebElement> cells = driver.findElements(By.xpath("//table[@id='table_id']//tr[2]/td"));
        
        //System.out.println(cells.size());
        
        for (int i = 2; i <= rows.size(); i++) { //rows
        	
        	for(int j = 1; j <= cells.size(); j++) { // columns
			
        		String text = driver.findElement(By.xpath("//table[@id='table_id']//tr["+i+"]/td["+j+"]")).getText();
         		 
            	System.out.println(text);*/
            	
        // If the no. of values are changing for each row, 
            	
        List<WebElement> rows = driver.findElements(By.xpath("//table[@id='table_id']//tr"));
        
        for (int i = 2; i <= rows.size(); i++) { //rows
        	
        	List<WebElement> cells = driver.findElements(By.xpath("//table[@id='table_id']//tr["+i+"]/td"));
        	
        	for(int j = 1; j <= cells.size(); j++) { // columns
			
        		String text = driver.findElement(By.xpath("//table[@id='table_id']//tr["+i+"]/td["+j+"]")).getText();
         		 
            	System.out.println(text);
		}
	}

}

}	
/*
 * If yu find an element with tagName called <table>, then that is a WebTable
 * In redbus website, open date and inspect calendar.
 * All the calendars are WebTable
 * 
 *  WebTable -2 types
 *  1. Static Table
 *  2. Dynamic Table
 *  
 *  Data can change but the no. of rows and columns remains same
 *  Static Table - No. of rows & columns remains same
 *  Dynamic Table - (erail.in) - Searching for trains in erail.com
 *  If the no. of rows or columns getting changed dynamically based on input, then it is called dynamic table
 *  
 *  Structure of WebTable
 *  <table>
 *       <tbody>
 *            <tr>  </tr> //Indicates no. of rows in the table ( 5 rows, it will have 5 <tr> tags in static table)
 *            <tr>              // Expand <tr> tag, yu will see <td> (table data) tag inside each <tr> tag 
 *                 <td> </td>
 *                 <td> </td>
 *                 <td> </td>
 *                 <td> </td>
 *                 <td> </td>
 *                 <td> </td>            
 *            </tr>
 *            <tr>  </tr>
 *            <tr>  </tr>
 *            <tr>  </tr>    
 *       </tbody>       
 *  </table>
 *  
 *  In dynamic table, <tr> tag will be changed based on the input
 *  
 *  Relationship between <tr> tag & <td> tag - Parent - Child relationship
 *  Relationship between <table> tag & <tr> tag - Grandparent - Grandchild relationship 
 *  
 *  Hardcode the end condition in for loop, as the no. of rows is changing on erail.in, i.e., the row is dynamic
 *  
 *  Whenever yu are dealing with number of rows and columns, we should have a nested for loop
 *  
 *  Check box doesn't have any value, so it will retrieve blank value
 *  
 *  If no. of cells is getting changed for each row, cells will come after for loop
 *  If we calculate the no. of cells for only one row, then will work fine
 *  In redbus.in, for feb all the rows have 7 days which is fine
 *  But for march, last row has only 3 data
 *  For April, first row has 4 data and the last row has 5 data
 *  No. of changing which is dynamic for each row.
 *  How to handle the dynamic data
 *  Calculate the no. of cells for each row
 *  
 *  When we inspect first row, some dev's will use <th> tag, which is table header
 *  Some dev's will have this as <td>
 *  Always check the header tag
*/