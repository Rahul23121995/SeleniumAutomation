package Action;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkartmousehover {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.johnlewis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement mouse = driver.findElement(By.xpath("//a[text()='Furniture & Lights']"));
         Actions c=new Actions(driver);
         c.moveToElement(mouse).perform();
         
	}

}
