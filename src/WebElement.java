import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement {
public static void main(String[] args) {
	
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.facebook.com/");
	
	
 //WebElement userName = driver.findElement(By.xpath("//input[@type='text']")).sendKeys("radha.jadhav08@gmail.com");
	
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("anuradha08");
	driver.findElement(By.xpath("//button[@value='1']")).click();
	
}
}
