package webTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1_GetRawSizeInTable {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("C:\\Users\\ASUS\\Desktop\\Anuradha\\WebTable.html");
	List<WebElement> allraws = driver.findElements(By.xpath("//table[@id='1234']//tr"));
	int size = allraws.size();
	System.out.println(size);
}
}
