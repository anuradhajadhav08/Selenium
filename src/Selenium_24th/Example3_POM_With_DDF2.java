package Selenium_24th;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Example3_POM_With_DDF2 {
	@FindBy(xpath = "//button[text()='Add to cart']")private WebElement AddToCart;
	@FindBy(xpath ="//a[@class='shopping_cart_link']")private WebElement Symbol;
	WebDriver driver;
	public Example3_POM_With_DDF2(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements( driver,this);
	}

	public void ClickOnAddToCourt() {
		AddToCart.click();	
	}
	public void ClickOnSymbol() {
		Symbol.click();
	}
	//public String ToVerifyTitle(String expTitle) {
	//	String actTitle = driver.getTitle();
		
		//if(actTitle.equals(expTitle)) {
		//	System.out.println("TC PASS");
		//}
		//else {
			//System.out.println("TC FAIL");
		//}
		//return actTitle;
public String getHomePageTitle() {
	String actTitle = driver.getTitle();
	return actTitle;
}
	}
	
