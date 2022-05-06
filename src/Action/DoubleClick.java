package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoapp.skillrary.com/product.php?product=selenium-training");
	WebElement plusbtn = driver.findElement(By.id("add"));
	Actions a=new Actions(driver);
	
	Thread.sleep(4000);
	a.doubleClick(plusbtn).perform();
	Thread.sleep(4000);
	driver.close();
	
        
	}

}
