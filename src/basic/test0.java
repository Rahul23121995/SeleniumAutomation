package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test0 {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.facebook.com/");
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	
	driver.findElement(By.id("email")).sendKeys("653363");
	
	driver.findElement(By.name("pass")).sendKeys("25656");
	Thread.sleep(3000);
	driver.findElement(By.name("login")).click();
	
	driver.findElement(By.linkText("Forgotten password?")).click();	
	driver.findElement(By.cssSelector("input[type='text']")).sendKeys("7676330700");
	driver.findElement(By.cssSelector("button[type='submit']")).click();
	driver.navigate().back();
	driver.navigate().forward();
	driver.navigate().refresh();
	driver.close();
	
	
	
	

	}

}
