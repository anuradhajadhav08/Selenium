package ExcelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example15 {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	//excel sheet access
	FileInputStream file = new FileInputStream("C:\\Users\\ASUS\\Desktop\\Anuradha\\Example.xlsx");
	//excel sheet open
//	Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
//	
//	String abc = sh.getRow(2).getCell(0).getStringCellValue();
//	System.out.println(abc);
	String abc = WorkbookFactory.create(file).getSheet("DDF").getRow(2).getCell(0).getStringCellValue();
	System.out.println(abc);
}

}