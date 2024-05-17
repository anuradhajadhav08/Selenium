package pageOrientedModule;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabsHomePage {
	@FindBy(xpath = "(//button[text()='Add to cart'])[1]")private WebElement AddToCart;
	@FindBy(xpath = "//button[text()='Open Menu']")private WebElement MenuButton;
	@FindBy(xpath = "//div[text()='Sauce Labs Backpack']]")private WebElement PN;
	 WebDriver driver;
	public SwagLabsHomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void ClickOnAddToCart() {
		AddToCart.click();;
	}
	public  void ToVerifyPN( ) {
		String actText = driver.getTitle();
	String expTitle="Swag Labs";
	System.out.println(expTitle);
		if(actText.equals(expTitle)) {
			System.out.println("TC Pass");
		}
		else {
			System.out.println("TC Fail");
		}
		
	}
	
	public void VerifyHomePageTitle( ) {
		String actName=driver.getTitle();
		String expName="Swag Labs";
		if(actName.equals(expName)) {
			System.out.println("Tc Pass");
		}
		else {
			System.out.println("Tc Pass");
		}
	}

	public void ClickOnMenuButton() {
			MenuButton.click();;
		}	
}
