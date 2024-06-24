package week5.day5224;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelIntegrationWithTc {

// Step iv): Retain the static keyword
	// static will have common reference value to all testcases
	public static String[][] readExcel() throws IOException {       // Step v) Go to CreateLeadExcel class line no: 28
		
		// Step 1: Setup the path for workbook
				XSSFWorkbook wb = new XSSFWorkbook("./data/CreateLead.xlsx");
				
				// Step 2: Get the sheet from the book
				// wb.getSheet("Leads"); // Sheet name 
				XSSFSheet sheet = wb.getSheetAt(0); // Index Number // If yu change the sheet name, it will be difficult. So go with index no.
				
				// Step 3: Read the no. of rows present
				// excluding header part
				int rowCount = sheet.getLastRowNum();
				
				// Step 4: Get into the column using row
				int cellCount = sheet.getRow(1).getLastCellNum(); // getLastCellNum() -> Ignoring the header
				
				
// Step i): Create String[][] inside the excel program with row and column count and assign the value
				String[][] value = new String[rowCount][cellCount];
				
				
				// To get all the values, used nested for loop
				// Index 0 is header value, for row it should start from 1
				for (int i = 1; i <= rowCount; i++) {
					
					for (int j = 0; j < cellCount; j++) {
						
						String data = sheet.getRow(i).getCell(j).getStringCellValue();
						
// Step ii): Assign values from the excel sheet to DataProvider
						value[i-1][j]=data;
						// Excel sheet index will start from 1
						// dataProvider index will start from 0
						
					}
				}
				
				// Step 6: Close the workbook
				wb.close();
				
// Step iii)    
				return value; // Step iv) Line no: 10

	}

}

/*
* Linked with CreateLeadExcel class
* 
* Steps to do Excel Integration: 
* 1. Create 2-dimensional array in the ExcelIntegrationWithTc Class with rowCount and columnCount 
  String[][] data = new String[rowCount][columnCount]; 
* 2. Push stringCellValue to the Array 
  data[i-1][j]=stringCellValue; 
* 3. Close the workbook and return the data 
  wBook.close(); 
  return data; 
* 4. Change main method to a normal static method 
  public static String[][] readExcel(){ 
  
  } 
* 5. Inside the testcase within the sendData() call the readExcel() from ReadExcel Class and return the data 
@DataProvider(name="fetchData") 
public String[][] sendData() throws IOException { 
return ReadExcel.readExcel();
*/