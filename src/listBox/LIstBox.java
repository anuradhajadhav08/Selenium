package listBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LIstBox {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	Thread.sleep(1000);
	driver.get("C:\\Users\\ASUS\\Desktop\\Anuradha\\ProgramPractice\\aaaa.html");
	Thread.sleep(1000);
	 WebElement city = driver.findElement(By.xpath("//select[@id='1234']"));
	 Thread.sleep(1000);
	Select al = new Select(city);
	
     //al.selectByIndex(2);
	al.selectByVisibleText("Pune");
	al.selectByIndex(0);
	
	boolean s1 = al.isMultiple();
	System.out.println(s1);
	if(s1==true) {
		System.out.println("List Box is Multiselectable");
		
	}
	else {
		System.out.println("List Box is not Multiselectable");	
	}
	
	System.out.println(al.getFirstSelectedOption().getText());
	System.out.println("-----------------------");
	System.out.println("get all selected option");
	List<WebElement> s2 = al.getAllSelectedOptions();
	
	System.out.println(s2);
	for(WebElement B1:s2) {
		System.out.println(B1.getText());
	}
	
	System.out.println("get all option");
List<WebElement> A = al.getOptions();
	
	System.out.println(A.size());
	for(WebElement B2:A) {
		System.out.println(B2.getText());
	}
	Thread.sleep(1000);
	
	al.deselectAll();
	
	
}
}
