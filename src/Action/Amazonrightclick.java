package Action;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazonrightclick {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement rightclick = driver.findElement(By.id("twotabsearchtextbox"));
	    Actions s=new Actions(driver);
	    Thread.sleep(3000);
	    s.contextClick(rightclick).perform();
	    Thread.sleep(3000);
	    driver.close();

	}

}
