package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cssselector {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.cssSelector("input[id='email']")).sendKeys("ttyrjgf");
		driver.findElement(By.cssSelector("input[name='pass']")).sendKeys("12345");
		driver.findElement(By.cssSelector("button[name='login']")).click();

	}

}
