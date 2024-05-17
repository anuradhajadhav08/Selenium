package ExcelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class Example12_ExcelSheet {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
	 FileInputStream file =new FileInputStream("C:\\Users\\ASUS\\Desktop\\Anuradha\\new Excel.xlsx");
		 
//	Sheet raw = WorkbookFactory.create(file).getSheet("Sheet2");
//	Row s1 = raw.getRow(1);
//	Cell s2 = s1.getCell(0);
//	String abc = s2.getStringCellValue();
//	System.out.println(abc);
//	 
//	 String value = WorkbookFactory.create(file).getSheet("Sheet2").getRow(0).getCell(0).getStringCellValue();
//	 System.out.println(value);
//	 
	 
	 //Get raw size in sheet
//	 int s1 = WorkbookFactory.create(file).getSheet("Sheet2").getLastRowNum()+1;
//	 System.out.println(s1);
//	 
	 
	 
//	 // get cell size in sheet
//	  int value = WorkbookFactory.create(file).getSheet("Sheet2").getRow(1).getLastCellNum();
//	  System.out.println(value);
// 
	 
  
			// Print all data in sheet	
		
//			Sheet sh = WorkbookFactory.create(file).getSheet("Sheet2");
//			int lastRowIndex = sh.getLastRowNum();
//			//Step.1 Take outer for loop for Rows
//			for(int i=0; i<=lastRowIndex;i++)
//			{
//			//Step.2 Inner for loop used for Columns
//			int lastCellIndex = sh.getRow(i).getLastCellNum()-1;
//			for(int j=0; j<=lastCellIndex; j++)
//			{
//			String info = sh.getRow(i).getCell(j).getStringCellValue();
//			System.out.print(info+" ");
//			}
//			System.out.println();
//			
			
			
			
			
//			
//
//			
//////			//Print all data in sheet
//			Sheet value = WorkbookFactory.create(file).getSheet("Sheet2");
//			int lastRawIndex = value.getLastRowNum();
//	
//				
//			for(int i=0; i<=lastRawIndex;i++) {
//				
//				int lastcellIndex = value.getRow(i).getLastCellNum()-1;
//				for( int j=0;j<=lastcellIndex;j++) {
//					
//					String xyz = value.getRow(i).getCell(j).getStringCellValue();
//					System.out.print(xyz+" ");
//				}
//				System.out.println();
	 
	 
	 
//Get cell Type Value

//	 CellType cellType = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(3).getCellType();
//	 System.out.println(cellType);
	 
	 
	 //Verify type of cell
	 Sheet findType = WorkbookFactory.create(file).getSheet("Sheet1");
	 
	  CellType datatype = findType.getRow(1).getCell(2).getCellType();
	  
	  System.out.println(datatype);
	  
	  
	if(datatype==CellType.STRING) {
		String type = findType.getRow(1).getCell(2).getStringCellValue();
		System.out.println(type);
	}
	else if(datatype==CellType.NUMERIC) {
			double type = findType.getRow(1).getCell(2).getNumericCellValue();
			System.out.println(type);
		}
	else if (datatype==CellType.BOOLEAN) {
		boolean type = findType.getRow(1).getCell(2).getBooleanCellValue();
		System.out.println(type);
	}
	
		  
	  }

	 
}


