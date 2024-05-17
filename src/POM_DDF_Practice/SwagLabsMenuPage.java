package POM_DDF_Practice;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabsMenuPage {
	
 @FindBy(xpath = "//a[text()='Logout']")private WebElement Logout;
 public SwagLabsMenuPage(WebDriver driver) {
	 
	 PageFactory.initElements( driver,this);
 }
 public void SwagLabsMenuPagelick() {
	 Logout.click();
}
}
