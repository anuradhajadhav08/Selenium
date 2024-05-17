package Webdriver;



import java.awt.Point;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Method {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();//open browser
	
	
	//get url on browser
	driver.get("https://www.facebook.com/");
	
	//driver.get("https://meet.google.com/srj-rqwy-cci");
	
	
	//maximize the browser
	
	driver.manage().window().maximize();
	
	
	driver.close();// specific tab closed
	//driver.quit();// closed the browser
	
	
	// navigate maethod
	//driver.navigate().back();
	//driver.navigate().forward();
	//driver.navigate().refresh();
	
	
	
	//used method getTitle
	//String abc = driver.getTitle();
	//System.out.println(abc);
	
	//get Url on webpage
	
	
	//String xyz = driver.getCurrentUrl();
	//System.out.println(xyz);
	
	
	// SetSize() of browser
	
//	Dimension d = new Dimension();
//	d.setSize(400,300);
//	
	
	
	//getsize() ofBrowser
	//Dimension aaa = driver.manage().window().getSize();
	//System.out.println(aaa);
	
	
	
	// setPosition() of browser
	
    // Point p = new Point(100,50);
	
	//driver.manage().window().setPosition(p);
	
	
	
	
	
	
	
	
	
}
}
