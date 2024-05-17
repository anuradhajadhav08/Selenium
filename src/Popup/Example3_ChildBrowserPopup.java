package Popup;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example3_ChildBrowserPopup {
public static void main(String[] args) {
	
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	//driver.manage().window().maximize();
	
	driver.get("https://skpatro.github.io/demo/links/");
	
	driver.findElement(By.xpath("(//input[@type='button'])[2]")).click();
	
	
	
	Set<String> AllID= driver.getWindowHandles();
	System.out.println(AllID);
	
	
	ArrayList<String> id = new ArrayList<String>(AllID);
	
	String ChildWindow = id.get(1);
	System.out.println(ChildWindow);
	
	driver.switchTo().window(ChildWindow);
	
	driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
	
	
	
	
	
	
	
	
//	String abc = id.get(0);
//	System.out.println(abc);
//	
	
	
	
	
	
}
}
