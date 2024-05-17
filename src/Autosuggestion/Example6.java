package Autosuggestion;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example6 {
	
	public static void main(String[] args) throws
	InterruptedException
	{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.findElement(By.xpath("//textarea[@class='gLFyf']")
	).sendKeys("redmi");
	Thread.sleep(2000);
	String expText="redmi note 13 pro";
	List<WebElement> allOptions =
	driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li"))
	;
	for(WebElement option: allOptions)
	{
	String actText = option.getText();
	if(actText.equals(expText))
	{
	option.click();
	break;
	}
	}
	}
	}


