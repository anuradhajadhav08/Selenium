package ExcelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example1_getStringData {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream file = new FileInputStream("C:\\Users\\ASUS\\Desktop\\Anuradha\\new Excel.xlsx");//naviagte excel  sheet
	Workbook book = WorkbookFactory.create(file);//open sheet
	//naviagte the perticlar sheet using getsheet method
	String sheet = book.getSheet("Sheet2").getRow(1).getCell(1).getStringCellValue();
	
	System.out.println(sheet);
	
}
}
