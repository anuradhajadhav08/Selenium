package ExcelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example5_PrintAllDataInCell {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("C:\\Users\\ASUS\\Desktop\\Anuradha\\new Excel.xlsx");//naviagte excel  sheet
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet2");
		int rawsize = sh.getLastRowNum();
		for(int i=0;i<=rawsize;i++) {
			String value = sh.getRow(i).getCell(0).getStringCellValue();
			System.out.println(value);
		}
	}	
}
