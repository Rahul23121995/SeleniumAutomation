package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
	     driver.findElement(By.linkText("Forgotten password?")).click();
	     driver.findElement(By.id("identify_email")).sendKeys("245245");
	     driver.findElement(By.name("did_submit")).click();

	}

}
