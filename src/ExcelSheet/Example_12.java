package ExcelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example_12 {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file= new FileInputStream("C:\\\\Users\\\\ASUS\\\\Desktop\\\\Anuradha\\\\Example111.xlsx");
		
		String value = WorkbookFactory.create(file).getSheet("DDF").getRow(1).getCell(0).getStringCellValue();
		
		System.out.println(value);
		
		
		
	}

}
