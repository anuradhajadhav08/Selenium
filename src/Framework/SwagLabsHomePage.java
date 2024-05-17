package Framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabsHomePage {
@FindBy(xpath = "//button[text()='Open Menu']")private WebElement menu;
 WebDriver driver;

public SwagLabsHomePage(WebDriver driver){
	this.driver=driver;
PageFactory.initElements( driver,this);	
}

public void MenuButton() {
	menu.click();
}

public void ToVerifyProductName( ) {
	
	String acttitle= driver.getTitle();
	String exptitle ="Sauce Labs BackPack";
	if(acttitle.equals(exptitle)) {
		System.out.println("Tc Pass");
	}
	else{
		System.out.println("TC Fail");
	}
	
}

}

