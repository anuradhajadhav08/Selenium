package Framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabsHomePage_1 {
	@FindBy(xpath = "//button[text()='Open Menu']")private WebElement menu;
	 WebDriver driver;

	public SwagLabsHomePage_1(WebDriver driver){
		this.driver=driver;
	PageFactory.initElements( driver,this);	
	}

	public void MenuButton() {
		menu.click();
	}

	public void ToVerifyProductName(String exptitle ) {
		
		String acttitle= driver.getTitle();
		//String exptitle ="Sauce Labs BackPack";
		if(acttitle.equals(exptitle)) {
			System.out.println("Tc Pass");
		}
		else{
			System.out.println("TC Fail");
		}
		
	}

}
