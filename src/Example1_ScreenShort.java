import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Example1_ScreenShort {
public static void main(String[] args) throws IOException {
	WebDriver driver= new ChromeDriver();
	driver.get("https://meet.google.com/cdo-mfuw-xrn");
	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	System.out.println(src);
	File dest= new File("");
	FileHandler.copy(src, dest);
}
}
