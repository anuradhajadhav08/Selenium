package ExcelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example14_PrintAllDataInColumn {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
	FileInputStream file = new FileInputStream("C:\\\\Users\\\\ASUS\\\\Desktop\\\\Anuradha\\\\new Excel.xlsx");
	
	Sheet rawsize = WorkbookFactory.create(file).getSheet("Sheet2");
	
	int abc = rawsize.getLastRowNum();
	
	for(int i=0; i<=abc ;i++ ) {
		
		String xyz = rawsize.getRow(i).getCell(0).getStringCellValue();
		
		System.out.println(xyz);
		
	}
	
	System.out.println("----------------Print All Data In Sheet----------------" );
	
	 for(int i =0;i<=abc; i++) {
		 
		int getlastcellindex = rawsize.getRow(i).getLastCellNum()-1;
		 
		for(int j=0; j<=getlastcellindex; j++ ) {
			String value = rawsize.getRow(i).getCell(j).getStringCellValue();
			System.out.println(value);
		}
	 }
}
}
