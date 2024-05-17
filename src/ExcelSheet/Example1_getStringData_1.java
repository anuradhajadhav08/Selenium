package ExcelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example1_getStringData_1 {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream file = new FileInputStream("C:\\Users\\ASUS\\Desktop\\Anuradha\\Example111.xlsx");
//	  String value = WorkbookFactory.create(file).getSheet("DDF").getRow(1).getCell(4).getStringCellValue();
//	 System.out.println(value);	
	
	 
//	 //GetRawSize of sheet
//	 int Rawsize= WorkbookFactory.create(file).getSheet("DDF").getLastRowNum()+1;
//	 System.out.println(Rawsize);
//	 
	 
	 
	 //Get cellSize
	 int cellsize= WorkbookFactory.create(file).getSheet("DDF").getRow(1).getLastCellNum();
	 System.out.println(cellsize);
	 
	 
	 //ReadNumericDataAsString
//	String value = WorkbookFactory.create(file).getSheet("DDF").getRow(0).getCell(1).getStringCellValue();
//	System.out.println(value);
//	  
	 
	
	//Print all daTA IN CELL
//	Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
//	int lastrawIndex = sh.getLastRowNum();
//	for(int i=0;  i<=lastrawIndex;  i++) {
//		String value = sh.getRow(i).getCell(0).getStringCellValue();
//		System.out.println(value);
//	}
//	 
//	Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
//	int lastcellindex = sh.getRow(0).getLastCellNum()-1;
//	for(int i=0;i<=lastcellindex;i++) {
//		String value = sh.getRow(1).getCell(i).getStringCellValue();
//		System.out.println(value);
	
	
	
//	Workbook sh = WorkbookFactory.create(file);
//	Sheet sheet = sh.getSheet("DDf");
//	Row raw = sheet.getRow(1);
//	Cell cell = raw.getCell(1);
//	String value = cell.getStringCellValue();
//	System.out.println(value);
////	}
//	
}
}
