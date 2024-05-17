package ExcelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example_13_getRawSizeInSheet {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("C:\\\\Users\\\\ASUS\\\\Desktop\\\\Anuradha\\\\Example111.xlsx");
		
		int abc = WorkbookFactory.create(file).getSheet("DDF").getLastRowNum()-1;
		
		System.out.println(abc);
		
		
	}
	
	
}
