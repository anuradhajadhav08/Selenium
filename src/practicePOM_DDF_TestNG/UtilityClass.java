package practicePOM_DDF_TestNG;

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
	//This GENERIC Method
	//Aut Name : Anuradha
	//Working : get test data from Excel Sheet
	//What input passed this Method: 1. RowIndex 2. ColIndex
	public static String getTD(int RowIndex,int ColIndex) throws EncryptedDocumentException, IOException {
		FileInputStream file= new FileInputStream("C:\\Users\\ASUS\\Desktop\\Anuradha\\Example.xlsx");
		 Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
		String value = sh.getRow(RowIndex).getCell(ColIndex).getStringCellValue();
		return value;
	}
	
	
	public static void CapturedScreenShort( WebDriver driver,int TCID) throws IOException {
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\ASUS\\eclipse-workspace\\Selenium\\failedTcases\\TestCaseID"+TCID+".jpg");
		FileHandler.copy(src, dest);
		
	}
	
	public static String getDataFromPropertyFile(String Key) throws IOException {
		FileInputStream file= new FileInputStream("C:\\Users\\ASUS\\eclipse-workspace\\Selenium\\PropertyFiles.properties");
		Properties p = new Properties();
		p.load(file);
		
		String value = p.getProperty(Key);
		return value;
	}
	
	
}
