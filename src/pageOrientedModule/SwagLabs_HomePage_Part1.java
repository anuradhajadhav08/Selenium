package pageOrientedModule;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabs_HomePage_Part1 {
	
	@FindBy(xpath = "(//button[text()='Add to cart'])[2]") WebElement AddProduct;
	@FindBy(xpath = "//a[@class='shopping_cart_link']") WebElement ClickOnCart;
	WebDriver driver;
	
	
	public SwagLabs_HomePage_Part1(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements( driver, this);
	}
	
	public void Add() {
		AddProduct.click();
	}
	
	public void ClickToCart() {
		ClickOnCart.click();
	}
	public void VerifyNameOfProduct() {
		
	
	
	String actProduct = driver.getTitle();
	String ExpProduct = "Swag Labs Backpack";
	System.out.println(ExpProduct);
	if(actProduct.equals(ExpProduct)) {
		System.out.println("Product Name: Swag Labs Backpack");
	}
	else {
		System.out.println("Product Name Not: Swag Labs Backpack");
	}
	

	
	}
	public void ToVerifyApplicationName() {
		String ActTitle=driver.getTitle();
		String ExpTitle="Swag Labs";
		System.out.println(ExpTitle);
		if(ActTitle.equals(ExpTitle)) {
			System.out.println("Tc Pass");
			
		}
		else {
			System.out.println("Tc Fail");
		}
	}
   
	
	

}
