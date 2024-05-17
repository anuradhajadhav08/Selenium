package POM_DDF_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabsHomePage2 {
	WebDriver driver;
	@FindBy(xpath = "(//button[text()='Add to cart'])[1]")private WebElement AddToCart;
	@FindBy(xpath = "//button[text()='Open Menu']")private WebElement MenuButton;

		public SwagLabsHomePage2(WebDriver  driver) {
			this.driver=driver;
		PageFactory.initElements(driver, this);	
		}
//		public void SwagLabsHomePageTitle(String ExpTitle) {
//		String actTitle = driver.getTitle();	
//		System.out.println(actTitle);
//		 if(actTitle.equals(ExpTitle)) {
//			 System.out.println("Pass");
//		 }
//		 else
//			 System.out.println("Fail");
//		}
		public String getSwagLabsTitle() {
			String actTitle = driver.getTitle();
			return actTitle;
		}
		public void SwagLabsHomePagCart() {
			AddToCart.click();
		}
		public void SwagLabsHomePageMenu() {
			MenuButton.click();
		}

}
