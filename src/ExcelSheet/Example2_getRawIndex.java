package ExcelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example2_getRawIndex {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("C:\\Users\\ASUS\\Desktop\\Anuradha\\new Excel.xlsx");//naviagte excel  sheet
	
		//naviagte the perticlar sheet using getsheet method
	int rawsize = WorkbookFactory.create(file).getSheet("Sheet2").getLastRowNum()+1;
	System.out.println(rawsize);
}
}
