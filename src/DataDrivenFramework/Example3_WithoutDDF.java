package DataDrivenFramework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example3_WithoutDDF {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.saucedemo.com/");
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("standard_user");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		Thread.sleep(1000);

	    driver.findElement(By.xpath("//input[@type='submit']")).click();
	    
	    String actTitle=driver.getTitle();
	    System.out.println(actTitle);
	    			
	    String expTitle="Swag Labs";
	    
	    if(actTitle.equals(expTitle)) {
	    
	    	System.out.println("TC Pass");
	    	
	    }
	    else {
	    	System.out.println("TC Fail");
	    }
	    		
		
	}
}
