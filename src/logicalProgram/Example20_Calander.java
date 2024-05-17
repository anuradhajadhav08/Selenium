package logicalProgram;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example20_Calander {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.redbus.in/");
	 driver.findElement(By.xpath("(//div[@class='sc-ifAKCX gLwVlD'])[1]")).sendKeys("Amravati");
	 driver.findElement(By.xpath("(//div[@class='sc-ifAKCX gLwVlD'])[2]")).sendKeys("Pune");

	 Thread.sleep(1000);
	 driver.findElement(By.xpath("//span[text()='Date']")).click();
	 Thread.sleep(1000);
	 
	 driver.findElement(By.xpath("//span[text()='Date']")).click();
	 
	 String ExpMonth="April";
	 
	 
	 
	 
	 
}
}
