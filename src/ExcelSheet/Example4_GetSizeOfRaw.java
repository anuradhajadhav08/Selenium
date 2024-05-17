package ExcelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example4_GetSizeOfRaw {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream file = new FileInputStream("C:\\\\Users\\\\ASUS\\\\Desktop\\\\Anuradha\\\\new Excel.xlsx");
	 int raw = WorkbookFactory.create(file).getSheet("Sheet2").getLastRowNum()-1;
	 
	System.out.println(raw);
}
}
