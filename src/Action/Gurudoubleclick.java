package Action;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Gurudoubleclick {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement dc = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
        Actions a=new Actions(driver);
        
        Thread.sleep(4000);
        a.doubleClick(dc).perform();
        Thread.sleep(3000);
        
        driver.close();
	}

}
