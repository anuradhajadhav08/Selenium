package Practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Example_1_ScreenShort {

	
	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mail.google.com/");
		
		File abc = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File s1 = new File("C:\\\\Users\\\\ASUS\\\\Desktop\\\\Anuradha\\\\ScreenShort\\\\ABC.jpg");
		
		FileHandler.copy(abc, s1);
		
		
	}
}
