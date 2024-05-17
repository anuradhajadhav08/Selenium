package POM_DDF_TestNG;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class UtilityClass {


public static String getTD(int rawvalue, int cellvalue) throws EncryptedDocumentException, IOException {
	

	FileInputStream file = new FileInputStream("C:\\Users\\ASUS\\Desktop\\Anuradha\\Example123.xlsx");
	Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
	String value = sh.getRow(rawvalue).getCell(cellvalue).getStringCellValue();
	return value;
	
	
	
}

public static void getScreenShort(WebDriver driver) {
	File screeShot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	file f1= new File("")
	
	
}
}
