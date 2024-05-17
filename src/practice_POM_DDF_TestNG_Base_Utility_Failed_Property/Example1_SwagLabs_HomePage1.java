package practice_POM_DDF_TestNG_Base_Utility_Failed_Property;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Example1_SwagLabs_HomePage1 {
	WebDriver driver;
	@FindBy(xpath = ("(//button[text()='Add to cart'])[1]")) private WebElement AddToCart;
	@FindBy(xpath = "//button[text()='Open Menu']")private WebElement MenuButton;
	
	public Example1_SwagLabs_HomePage1(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public String VerifyTitle() {
		
		String actTitle = driver.getTitle();
		return actTitle;
		
	}
	public String VerifyProductName() {
		String actTitle=driver.getTitle();
		return actTitle;
	}
	
	public void ClickOnAddToCart() {
		AddToCart.click();
	}
	
	
	public void ClickMenuButton() {
		MenuButton.click();
	}
	
}
