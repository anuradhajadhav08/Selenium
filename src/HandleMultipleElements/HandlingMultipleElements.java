package HandleMultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleElements {
public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("C:\\Users\\ASUS\\Desktop\\Anuradha\\ProgramPractice\\MULTIPLE CHECK BOX.HTML");
		
		List<WebElement> MultiCheckBox = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		
		for(int i=0; i<=MultiCheckBox.size()-1;i++) {
			
			MultiCheckBox.get(i).click();
			Thread.sleep(500);
		}
			
			for(int j=MultiCheckBox.size()-1; j>=0; j--) {
				
				MultiCheckBox.get(j).click();
				Thread.sleep(500);
				
			}
			
		}


}
