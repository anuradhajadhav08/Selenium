package HandleMultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectMultipleCheckBox {

	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("C:\\Users\\ASUS\\Desktop\\Anuradha\\ProgramPractice\\MULTIPLE CHECK BOX.HTML");
		
		List<WebElement> MultiCheckBox = driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println(MultiCheckBox.size());
		
		for(WebElement check:MultiCheckBox) {
			check.click();
			System.out.println();
			
			Thread.sleep(1000);
			
		}
	}
}
