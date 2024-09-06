package utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadData_Excelfile 
{
 public static String readDataFile(int row,int col) throws EncryptedDocumentException, IOException 
 {
	 FileInputStream file=new FileInputStream("C:\\Users\\Namrata Pawar\\eclipse-workspace\\selenium_framework_project\\TestData\\Book1.xlsx");
	 Sheet excel = WorkbookFactory.create(file).getSheet("Sheet1");
	 String value = excel.getRow(row).getCell(col).getStringCellValue();
	 
	 return value;
	 
 }
	
}
