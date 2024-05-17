package Selenium_24th;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Example2_POM2_HomePage {

@FindBy(xpath = "//button[text()='Add to cart']")private WebElement AddToCourt;
@FindBy(xpath ="//a[@class='shopping_cart_link']")private WebElement Symbol;
WebDriver driver;
public Example2_POM2_HomePage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements( driver,this);
}

public void ClickOnAddToCourt() {
	AddToCourt.click();	
}
public void ClickOnSymbol() {
	Symbol.click();
}

}




