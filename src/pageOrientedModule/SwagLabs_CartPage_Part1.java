package pageOrientedModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabs_CartPage_Part1 {

	@FindBy(xpath = "//button[text()='Remove']") WebElement remove;
	
	public SwagLabs_CartPage_Part1(WebDriver driver) {
		PageFactory.initElements( driver,this);
	}
	
	public void RemovePoduct() {
		remove.click();
	}
}
