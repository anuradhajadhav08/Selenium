package HandleMultipleElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example3_CountNoOfLinks_PresentInwebpage {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
    int size = driver.findElements(By.xpath("//a")).size();
//	int size = allLinks.size();
    System.out.println(size);
}
}
