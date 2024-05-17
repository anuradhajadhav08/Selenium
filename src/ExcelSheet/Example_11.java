package ExcelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example_11 {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream file= new FileInputStream("C:\\Users\\ASUS\\Desktop\\Anuradha\\Example111.xlsx");
//	String value = WorkbookFactory.create(file).getSheet("DDF").getRow(1).getCell(0).getStringCellValue();
//	System.out.println(value);
////	
	
//read numeric value
//	 double value = WorkbookFactory.create(file).getSheet("DDF").getRow(1).getCell(10).getNumericCellValue();
//	System.out.println(value);
	
	
	//read boolean value
//	  boolean value = WorkbookFactory.create(file).getSheet("DDF").getRow(1).getCell(11).getBooleanCellValue();
//	System.out.println(value);
//	
	
	//get rawSizeInSheet
//int value = WorkbookFactory.create(file).getSheet("DDF").getLastRowNum()+1;
//System.out.println(value);

//getCellSizeInSheet
//int colSize = WorkbookFactory.create(file).getSheet("DDF").getRow(0).getLastCellNum();
//System.out.println(colSize);
	
	//Print All Data In col
//	Sheet value = WorkbookFactory.create(file).getSheet("DDF");
//	int lastraw = value.getLastRowNum();
//	
//	for(int i=0; i<=lastraw-1;i++) {
//		String abc = value.getRow(i).getCell(0).getStringCellValue();
//		System.out.println(abc);
//	}
//
	
	
	//Print all data in sheet
//	Sheet value = WorkbookFactory.create(file).getSheet("DDF");
//	int lastRawIndex = value.getLastRowNum();
//	
//	for(int i=0; i<=lastRawIndex;i++) {
//		int abc = value.getRow(i).getLastCellNum()-1;

	
//	Sheet value = WorkbookFactory.create(file).getSheet("Sheet2");
//	int lastRawIndex = value.getLastRowNum();
//	
//	for(int i=0; i<=lastRawIndex;i++) {
//		
//		int lastcellIndex = value.getRow(i).getLastCellNum()-1;
//		for( int j=0;j<=lastcellIndex;j++) {
//			
//			String xyz = value.getRow(i).getCell(j).getStringCellValue();
//			System.out.print(xyz+" ");
//		}
//		System.out.println();
//		
	
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet2");
		int lastRowIndex = sh.getLastRowNum();
		//Step.1 Take outer for loop for Rows
		for(int i=0; i<=lastRowIndex;i++)
		{
		//Step.2 Inner for loop used for Columns
		int lastCellIndex = sh.getRow(i).getLastCellNum()-1;
		for(int j=0; j<=lastCellIndex; j++)
		{
		String info = sh.getRow(i).getCell(j).getStringCellValue();
		System.out.print(info+" ");
		}
		System.out.println();
		
	
		
	}


	
}
}
