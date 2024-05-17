package ExcelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example10 {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream file= new FileInputStream("C:\\Users\\ASUS\\Desktop\\Anuradha\\new Excel.xlsx");
	//get String Data
//	String sheet = WorkbookFactory.create(file).getSheet("Sheet2").getRow(0).getCell(0).getStringCellValue();
//	System.out.println(sheet);
//	
	
	
	
	//get last rowindex
//	int RawSize = WorkbookFactory.create(file).getSheet("Sheet2").getLastRowNum()+1;
//	System.out.println(RawSize);
	
	
	// get cell Index
//short cellsize = WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getLastCellNum();
//System.out.println(cellsize);
	
	
	
	//Print all data in cell
	Sheet sheet = WorkbookFactory.create(file).getSheet("Sheet2");
	int sh = sheet.getLastRowNum();
	for(int i=0;i<=sh;i++) {
		 String value = sheet.getRow(i).getCell(0).getStringCellValue();
		 System.out.println(value);
	}
}
}
