package POM_DDF_TestNG_BaseClass_UtilityClass_FailedTC_PropertyFile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SwagLabHomepage {
@FindBy(xpath = "//button[text()='Open Menu']")private WebElement menu;
WebDriver driver;
public SwagLabHomepage(WebDriver driver) {
	
	PageFactory.initElements(driver, this);
	this.driver=driver;
	
}
public String getSwagLabHomePageTitle( ) {
	String actTitle = driver.getTitle();
	return actTitle;
}
public void ClickSwagLabLoginpageMenuBtn() {
	menu.click();
}
}

