package handling_of_listBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example3_Verify_MultiSelectable_OR_Not {
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.get("C:\\Users\\ASUS\\Desktop\\Anuradha\\ProgramPractice\\ListBox.html");
		
		WebElement country = driver.findElement(By.xpath("//select[@id='12345']"));
		
		
		Select s = new Select(country);
		boolean result = s.isMultiple();
		
		System.out.println(result);
		
		if(result==true) {
			System.out.println("ListBox is Multiselectable");
		}
		else {
			System.out.println("ListBox is not Multiselectable");
		}
	}
}
