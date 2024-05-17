package ExcelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example7_GetTypeOfCell {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream file = new FileInputStream("C:\\\\\\\\Users\\\\\\\\ASUS\\\\\\\\Desktop\\\\\\\\Anuradha\\\\\\\\new Excel.xlsx");
	CellType type = WorkbookFactory.create(file).getSheet("Sheet1").getRow(2).getCell(2).getCellType();// we dont no the data so we called this method
	System.out.println(type);
}
}
