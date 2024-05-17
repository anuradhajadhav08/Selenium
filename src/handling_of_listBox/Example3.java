package handling_of_listBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example3 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	Thread.sleep(2000);
	driver.manage().window().maximize();
	 driver.get("https://www.facebook.com/");
	 
	 driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(2000);
		
		   WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		   
		   Select s = new Select(month);
		   boolean result = s.isMultiple();
		   System.out.println(result);
		   
		   if(result==true) {
			 System.out.println("ListBox is Multiselectable");  
		   }
		   else {
			   System.out.println("ListBox is not Multiselectable");
		   }
		
	 
	 
}
}
