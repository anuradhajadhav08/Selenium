package ExcelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example8_getDataverifyTypeOfCell {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream file= new FileInputStream("C:\\\\Users\\\\ASUS\\\\Desktop\\\\Anuradha\\\\new Excel.xlsx");
	 Cell cellInfo = WorkbookFactory.create(file).getSheet("sheet1").getRow(1).getCell(3);
	CellType type = cellInfo.getCellType();
	System.out.println(type);
	if(type==CellType.STRING) 
	{
		String s1 = cellInfo.getStringCellValue();
		System.out.println(s1);
	}
	 else if(type==CellType.NUMERIC) {
		 String s1 = cellInfo.getStringCellValue();
			System.out.println(s1);

	}
}
}
