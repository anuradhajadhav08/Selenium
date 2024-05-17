package Practice;

import java.awt.Desktop.Action;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1_UsingWebdriverMethod_GetTitle {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	String acttitle = driver.getTitle();
	String Exptitle="Facebook";
	
	System.out.println(driver.getTitle());
	if(acttitle.equalsIgnoreCase(Exptitle)){
		System.out.println("TC Passed");
		
	}
	else {
		System.out.println("Tc Failed");
	}
}
}
