package POM_DDF_TestNG_BaseClass_UtilityClass_FailedTC_PropertyFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;


public class UtilityClass {
//Generic methods	 
public static String getTD (int rowIndex,int cellIndex ) throws EncryptedDocumentException, IOException {
//FileInputStream file = new FileInputStream("C:\\Users\\ASUS\\eclipse-workspace\\Selenium\\TestData\\Example111.xlsx");
	FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\TestData\\Example111.xlsx");
Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
String value = sh.getRow(rowIndex).getCell(cellIndex).getStringCellValue();
return value;
}
public static void captureScrrenShort(WebDriver driver,int TCID) throws IOException {
	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File dest = new File(System.getProperty("user.dir")+"\\failedTcases\\TestCaseID"+TCID+".jpg");
	 FileHandler.copy(src, dest);
	 
}
public static String GetDataFromPropertyFile(String key) throws IOException {
	FileInputStream file = new FileInputStream("C:\\Users\\ASUS\\eclipse-workspace\\Selenium\\propertyFile.properties");
	Properties p = new Properties();
	p.load(file);
String value = p.getProperty(key);
return value;
}
}
