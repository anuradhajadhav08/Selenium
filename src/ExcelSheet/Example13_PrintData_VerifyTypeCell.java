package ExcelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example13_PrintData_VerifyTypeCell {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
	FileInputStream file = new  FileInputStream("C:\\\\Users\\\\ASUS\\\\Desktop\\\\Anuradha\\\\new Excel.xlsx");
	
//	Cell cellInfo = WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getCell(2);
//	
//	CellType s1 = cellInfo.getCellType();
//	
	//System.out.println(s1);
//	if(s1==CellType.STRING) {
//		
//		String abc = cellInfo.getStringCellValue();
//		
//		System.out.println(abc);
//		
//	}
//	else if(s1==CellType.NUMERIC) {
//double abc = cellInfo.getNumericCellValue();
//		
//System.out.println(abc);
//
//		
//		
//	}
//	else if(s1==CellType.BOOLEAN) {
//		boolean abc = cellInfo.getBooleanCellValue();
//				
//		System.out.println(abc);

				
				
			//}
	

	
	 Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
	 int cellInfo = sh.getRow(1).getLastCellNum()-1;
	 
	 for(int i=0;i<=cellInfo;i++) {
		Cell cellType = sh.getRow(1).getCell(i);

		CellType s1 = cellType.getCellType();
		
	if(s1==CellType.STRING) {
			String abc = cellType.getStringCellValue();
			
			System.out.println(abc+ "");
			
		}
		else if(s1==CellType.NUMERIC) { 
			double abc = cellType.getNumericCellValue();
			
            System.out.println(abc+ "");

			
			
		}
		else if(s1==CellType.BOOLEAN) {
			boolean abc = cellType.getBooleanCellValue();
			System.out.println(abc + "");
		}
	 }
}
}
