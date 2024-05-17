package Popup;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example3_switchToChildWindow {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://skpatro.github.io/demo/links/");
	driver.findElement(By.xpath("//input[@name='NewTab']")).click();
	
	
	//get child window id
	Set<String> alllds = driver.getWindowHandles();// get id of main and child page return 
	ArrayList<String> al= new ArrayList<String>(alllds);
	String ChildID = al.get(1);
	
	//swith to child window
	driver.switchTo().window("ChildID");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[text()='Training']")).click();
	
	
}
}
