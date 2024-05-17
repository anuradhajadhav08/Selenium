package handling_of_listBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example2_SelectOption_MultiselectableOption {
	public static void main(String[] args) throws InterruptedException {
		
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	driver.get("C:\\Users\\ASUS\\Desktop\\Anuradha\\ProgramPractice\\ListBox.html");
	
	WebElement country = driver.findElement(By.xpath("//select[@id='12345']"));
	
	
	Select s = new Select(country);
	
	s.selectByVisibleText("Swizerland");
	s.selectByIndex(1);
	s.selectByValue("3");
	Thread.sleep(2000);
	

	

}
}