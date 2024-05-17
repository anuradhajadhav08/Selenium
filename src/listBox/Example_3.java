package listBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example_3 {
public static void main(String[] args) throws InterruptedException {
	
	
	WebDriver driver = new ChromeDriver();
	Thread.sleep(1000);
	
//	 driver.get("https://www.facebook.com/");
//	 
//	 driver.findElement(By.xpath("(//a[contains(text(),'Create')])[1]")).click();
//	 Thread.sleep(1000);
//	 
//	WebElement year = driver.findElement(By.xpath("//select[@name='birthday_year']"));
//	Thread.sleep(1000);
//	
//	Select al = new Select(year);
//	
	//al.selectByIndex(10);
   // al.selectByValue("2022");
//	al.selectByVisibleText("2022")
System.out.println("...........isMultiple.................");	
	
// Check ListBox is Multi-selectable or not
	
//	boolean result = al.isMultiple();
//	if(result==true) {
//		System.out.println("List box multiselectable");
//	}
//	else
//	{
//		System.out.println("Single Selectable");
//	}
System.out.println(".......Multi Selectable List Box........");
driver.get("file:///C:/Users/ASUS/Desktop/Anuradha/ProgramPractice/ListBox.html");

//driver.findElement(By.xpath("(//a[contains(text(),'Create')])[1]")).click();
//Thread.sleep(1000);
//
WebElement country = driver.findElement(By.xpath("//select[@id='12345']"));
//Thread.sleep(1000);
//
Select al = new Select(country);
//
al.selectByIndex(4);
al.selectByIndex(1);
al.selectByIndex(2);
al.selectByIndex(3);
al.deselectByIndex(2);
//
//List<WebElement> allOption = al.getAllSelectedOptions();
//
//for(WebElement option:allOption) {
//	String print = option.getText();
//	System.out.println(print);

System.out.println(".........Get First Selected..............");
//System.out.println(al.getFirstSelectedOption().getText());

//Thread.sleep(2000);
//WebElement selectedOption = al.getFirstSelectedOption();
//   Thread.sleep(2000);
//   String text = selectedOption.getText();
//   System.out.println(text);

	
//}

al.deselectAll();



	
	
	
	
}
}
