package practice_POM_DDF_TestNG_Base_Utility_Failed_Property;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Example1_SwagLabs_HomePage {

	WebDriver driver;
	@FindBy(xpath = ("(//button[text()='Add to cart'])[1]")) private WebElement AddToCart;
	@FindBy(xpath = "//button[text()='Open Menu']")private WebElement MenuButton;
	
	public Example1_SwagLabs_HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void VerifyTitle(String ExpTitle) {
		
		String actTitle = driver.getTitle();
	}
	
	public void ClickOnAddToCart() {
		AddToCart.click();
	}
	
	
	public void ClickMenuButton() {
		MenuButton.click();
	}
	

}
