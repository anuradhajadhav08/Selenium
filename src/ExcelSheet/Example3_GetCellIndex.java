package ExcelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example3_GetCellIndex {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream file = new FileInputStream("C:\\\\Users\\\\ASUS\\\\Desktop\\\\Anuradha\\\\new Excel.xlsx");
	short cellsize = WorkbookFactory.create(file).getSheet("Sheet2").getRow(1).getLastCellNum();
	System.out.println(cellsize);
}
}
