package handling_of_listBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example1_AllExampleOF_ListBox {
public static void main(String[] args) {
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	
	driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	
	 WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
	   
	   Select s = new Select(month);
	   
	s.selectByIndex(5);
	
	
	//to find list box multi selectable or not
	boolean multiple = s.isMultiple();
	if(multiple==true){
		System.out.println("Print list box is multiselectable");
	}
	else {
		System.out.println("Print list box is  not multiselectable");

	}
	
	
	
}	

}
