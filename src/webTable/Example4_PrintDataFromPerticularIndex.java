package webTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example4_PrintDataFromPerticularIndex {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("C:\\\\Users\\\\ASUS\\\\Desktop\\\\Anuradha\\\\WebTable1.html");
		
		String text = driver.findElement(By.xpath("//table[@id='1234']//tr[1]//th[2]")).getText();
		System.out.println(text);
		
	}
}
