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
driver.get("https://www.google.co.in/");
File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
System.out.println(src);
File dest = new File("C:\\Users\\ASUS\\Desktop\\Anuradha");
FileHandler.copy(src, dest);

}
}