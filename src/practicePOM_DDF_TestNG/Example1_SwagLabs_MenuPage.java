package practicePOM_DDF_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Example1_SwagLabs_MenuPage {
	@FindBy(xpath = "//a[text()='Logout']")private WebElement Logout;
	 public Example1_SwagLabs_MenuPage(WebDriver driver) {
		 
		 PageFactory.initElements( driver,this);
	 }
	 public void SwagLabsclickOnLogout() {
		 Logout.click();
	}
}
