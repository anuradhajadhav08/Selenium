package handling_of_listBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example5_getSelectedOption_MultipleSelectedOption {
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.get("C:\\Users\\ASUS\\Desktop\\Anuradha\\ProgramPractice\\ListBox.html");
		
		WebElement country = driver.findElement(By.xpath("//select[@id='12345']"));
		
		
		Select s = new Select(country);
		
		
		s.selectByVisibleText("Swizerland");
		s.selectByIndex(1);
		
		Thread.sleep(2000);
		List<WebElement> alloption = s.getAllSelectedOptions();
		//get size of selected option in multiselectable list box
		int size = alloption.size();
		System.out.println(size);
		
		for(WebElement option:alloption) {
			String text = option.getText();
			System.out.println(text);
		}
		
	}		
}
