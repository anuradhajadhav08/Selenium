package Popup;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example3_switchToChildWindow_2 {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://skpatro.github.io/demo/links/");
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 
	 
	 //click on new tab
	  driver.findElement(By.xpath("//input[@name='NewTab'] ")).click();
	  
	  // switch to child window
	  // first we need to get id using filehandlwe metnod
	   Set<String> allID = driver.getWindowHandles();
	   // this all id stored in arraylist
	   ArrayList< String> al = new ArrayList<String>(allID);
	   String ChildID = al.get(1);//main page index =0,childpage id =1
	   
	   driver.switchTo().window("ChildID");
	   
	   //click on training
	   driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
}
}
