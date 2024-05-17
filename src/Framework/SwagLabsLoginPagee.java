package Framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabsLoginPagee {
//variable declaration
@FindBy(xpath = "//input[@id='user-name']")	private WebElement Username;
@FindBy(xpath="//input[@name='password']") private  WebElement Password;
@FindBy(xpath="//input[@id='login-button']") private  WebElement Login;
WebDriver driver;
//Step2: variable Intialisation

public SwagLabsLoginPagee(WebDriver driver) {
this.driver= driver;
PageFactory.initElements(driver,this );
}

//Step 3; used variable

public void UN() {
	Username.sendKeys("standard_user");
	
}
public void pass() {
	Password.sendKeys("secret_sauce");
	
}
public void Button() {
	Login.click();
}

public void ToVerifyTitleName() {
	String acttitle = driver.getTitle();
	System.out.println(acttitle);
	String expTitle="Swag Labs";
	if(acttitle.equals(expTitle)) 
	{
		System.out.println("TC Pass");
		
	}
	else
	{
		System.out.println("TC Fail");
	}
}
}
