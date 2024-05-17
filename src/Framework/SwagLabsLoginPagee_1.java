package Framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabsLoginPagee_1 {
	//variable declaration
	@FindBy(xpath = "//input[@id='user-name']")	private WebElement Username;
	@FindBy(xpath="//input[@name='password']") private  WebElement Password;
	@FindBy(xpath="//input[@id='login-button']") private  WebElement Login;
	WebDriver driver;
	//Step2: variable Intialisation

	public SwagLabsLoginPagee_1(WebDriver driver) {
	this.driver= driver;
	PageFactory.initElements(driver,this );
	}

	//Step 3; used variable

	public void UN(String UnameValue) {
		Username.sendKeys("standard_user");
		
	}
	public void pass(String password) {
		Password.sendKeys("secret_sauce");
		
	}
	public void Button() {
		Login.click();
	}

	public void ToVerifyTitleName(String exptitle) {
		String acttitle = driver.getTitle();
		System.out.println(acttitle);
		if(acttitle.equals(exptitle)) 
		{
			System.out.println("TC Pass");
			
		}
		else
		{
			System.out.println("TC Fail");
		}

}
}
