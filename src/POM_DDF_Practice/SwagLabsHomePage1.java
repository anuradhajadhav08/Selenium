package POM_DDF_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabsHomePage1 {
	@FindBy(xpath = "(//button[text()='Add to cart'])[1]")private WebElement AddToCart;
	@FindBy(xpath = "//div[@class='inventory_item_name ']")private WebElement ProductName;
	public SwagLabsHomePage1(WebDriver driver) {
		PageFactory.initElements( driver,this);
	}
	public void SwagLabsYourcartProductName(String ExpPN) {
		 String actPN = ProductName.getText();
		 System.out.println(actPN);
		 if(actPN.equals(ExpPN)) {
			System.out.println("Pass"); 
		 }
		 else {
			 System.out.println("Fail");
		 }
		
	}
	public void ClickOnProduct() {
		AddToCart.click();
		
	}
		}


