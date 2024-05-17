package handling_of_listBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example4_GetSelectOption_from_SingleSelectable {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	 driver.get("https://www.facebook.com/");
	 
	 driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(2000);
		
		   WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		   
		   Select s = new Select(month);
		   WebElement alloption = s.getFirstSelectedOption();
		String text = alloption.getText();
		System.out.println(text);
}
}
