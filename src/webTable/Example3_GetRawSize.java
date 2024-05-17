package webTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example3_GetRawSize {

	public static void main(String[] args) {
		
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("C:\\Users\\ASUS\\Desktop\\Anuradha\\WebTable1.html");
		 
		    int rawsize = driver.findElements(By.xpath("//table[@id='1234']//tr")).size();
		    System.out.println("Rawsize:"+rawsize);
//		int size = rawsize.size();
//		System.out.println(size);
		    
		   System.out.println("................Print Col Size..................");
		   int colsize = driver.findElements(By.xpath("//table[@id='1234']//tr//th")).size();
		   System.out.println("Colsize:"+colsize);
//		 
	}
}