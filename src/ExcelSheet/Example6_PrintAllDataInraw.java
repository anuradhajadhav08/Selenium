package ExcelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example6_PrintAllDataInraw {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("C:\\Users\\ASUS\\Desktop\\Anuradha\\new Excel.xlsx");//naviagte excel  sheet
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet2");
		 int LastCellindex = sh.getRow(0).getLastCellNum()-1;

		for(int i=0;i<=LastCellindex;i++) {
			String value = sh.getRow(0).getCell(i).getStringCellValue();
			System.out.println(value);
		}
	}	
}

