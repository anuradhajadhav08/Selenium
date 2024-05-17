package Selenium_24th;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Example3_POM_With_DDF3 {
	@FindBy(xpath = "//button[text()='Remove']")private WebElement Remove;
	@FindBy(xpath = "//button[text()='Checkout']")private WebElement CheackOut;


	public Example3_POM_With_DDF3(WebDriver driver)
	{
		PageFactory.initElements( driver,this);
	}
	public void ClickOnRemove() {
		Remove.click();
	}
	public void ClickOnCheackOut() {
		CheackOut.click();
	}

}
