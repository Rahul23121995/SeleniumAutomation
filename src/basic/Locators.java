package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.facebook.com/");
     driver.findElement(By.id("email")).sendKeys("trttrt");
      driver.findElement(By.name("pass")).sendKeys("utrutrtu");
      driver.findElement(By.name("login")).click();
	}

}
