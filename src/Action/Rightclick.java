package Action;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Rightclick {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement rightclick = driver.findElement(By.name("q"));
		Actions a=new Actions(driver);
		
	Thread.sleep(4000);
		a.contextClick(rightclick).perform();
		Thread.sleep(4000);
		driver.close();
		

	}

}