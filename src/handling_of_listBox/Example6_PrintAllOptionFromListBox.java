package handling_of_listBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example6_PrintAllOptionFromListBox {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	Thread.sleep(2000);
	
	   WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
	   
	   Select s = new Select(month);
	   
	  List<WebElement> alloption = s.getOptions();
	  //print Size of alloption
	  //int size = alloption.size();
	  System.out.println(alloption.size());
	  
	  for(WebElement option:alloption) {
		 String text = option.getText();
		 System.out.println(text);
	  }
	
	
	
}
}
