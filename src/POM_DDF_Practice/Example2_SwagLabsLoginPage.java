package POM_DDF_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Example2_SwagLabsLoginPage {
 @FindBy(xpath = "//input[@id='user-name']") private  WebElement UserName;
 @FindBy(xpath = "//input[@id='password']")  private WebElement Password;
 @FindBy(xpath = "//input[@type='submit']")  private WebElement Click;
 public Example2_SwagLabsLoginPage(WebDriver driver){
	 PageFactory.initElements(driver, this);
	
}
 public void UN(String Name) {
	 UserName.sendKeys(Name);
	
}
 
 public void Pass(String abc) {
	Password.sendKeys(abc);
}
 
 public void clickOnButton() {
	Click.click();
}
 

}
