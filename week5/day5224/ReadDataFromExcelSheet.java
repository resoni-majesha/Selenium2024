package week5.day5224;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRichTextString;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcelSheet {
	
	public static void main(String[] args) throws IOException {
		
		// Step 1: Setup the path for workbook
		XSSFWorkbook wb = new XSSFWorkbook("./data/CreateLead.xlsx");
		
		// Step 2: Get the sheet from the book
		// wb.getSheet("Leads"); // Sheet name 
		XSSFSheet sheet = wb.getSheetAt(0); // Index Number // If yu change the sheet name, it will be difficult. So go with index no.
		
		// Step 3: Read the no. of rows present
		// excluding header part
		int rowCount = sheet.getLastRowNum();
		System.out.println("Number of rows presented in the sheet: " +rowCount);
		
		// including header part
		int rowCountWithHeader = sheet.getPhysicalNumberOfRows();
		System.out.println("Including the header value: "+rowCountWithHeader);
		
		// Step 4: Get into the column using row
		int cellCount = sheet.getRow(1).getLastCellNum(); // getLastCellNum() -> Ignoring the header
		System.out.println("Number of cells presented in the sheet: "+cellCount);
		
		// Step 5: To read the value from cell
		String ss = sheet.getRow(1).getCell(0).getStringCellValue();
		System.out.println(ss);
		
		// To get all the values, used nested for loop
		// Index 0 is header value, for row it should start from 1
		for (int i = 1; i <= rowCount; i++) {
			
			for (int j = 0; j < cellCount; j++) {
				
				String data = sheet.getRow(i).getCell(j).getStringCellValue();
				
				System.out.println(data);
				
			}
		}
		
		// Step 6: Close the workbook
		wb.close();
	}

}

/*
* Learn Excel Integration
* Add data in the excel sheet
* We are going to read the data in the excel sheet
*
* For that we need to add 2 more dependencies
* Apache POI
* What - Java Library to pass external test data to the testcases
* Why? To test the same functionality with different data
* How? Using TestNG annotation
* Apache POI - Java Library to read data from Microsoft applications like xlsx, xls, doc, docx, ppt,..
* poi-ooxml
* poi
* Microsoft Excel is not mandatory to have excel in your system
* Before 2016 .xls
* Now, .xlsx -> poi-ooxml library required
* 
* Create an excel
* Number is considered as String
* Add single quotes before numbers
* 
* Go to eclipse
* Create empty folder
* Right click project -> Folder name as data
* Copy and paste the Excel sheet to the data folder
* Right click the excel sheet -> Open with -> System Editor
* If your manager gives an excel sheet download and create a folder in the project, paste it in the folder
* 
* If yu want to read data in the excel sheet manually
* Open the excel sheet by double clicking
* Go to sheet
* Go to particular row, column and fetch the data
* Same thing we are going to write in the script
* 
* Step 1: Set the excel workbook path
*         XSSFWorkbook wbook = new XSSFWorkbook("./Data/Sample.xlsx");
*         XSSF - XML SpreadSheet Format
*         Import XSSFWorkbook
* Step 2: Get the sheet from the book
*         XSSFSheet sheet = wbook.getSheetAt(0); // Index of the sheet
*         Import XSSFSheet 
* Step 3: Get into the row
*         XSSFRow = row = sheet.getRow(0); // ) is for header part, it is not required. 
*         Import XSSFRow
* Step 4: Get into the column using row
*         Technical term for column in excel is cell
*         XSSFCell cell = row.getCell(1);
*         Import XSSFCell
* Step 5: To read the value from cell
*         String data = cell.getStringCellValue();
*         
* returns data from the excel sheet of (1,1)
* 
* To print the value in the console use the method getStringCellValue();
*/