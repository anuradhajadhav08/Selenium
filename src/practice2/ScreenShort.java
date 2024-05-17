package practice2;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShort {
public static void main(String[] args) throws IOException {
	
	WebDriver driver = new ChromeDriver();
	 driver.get("https://meet.google.com/ped-kvcc-hwo");
	 
	File s1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	File dest = new File("C:\\Users\\ASUS\\Desktop\\Anuradha\\ScreenShort\\ABC.jpg");
	
	FileHandler.copy(s1, dest);
}
}
