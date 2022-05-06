package com.Frames;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Switchbackfromframe {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.snapdeal.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement ele = driver.findElement(By.xpath("//span[text()='Sign In']"));
      Actions a=new Actions(driver);
      a.moveToElement(ele).perform();
      driver.findElement(By.xpath("//a[text()='login']")).click();
      driver.switchTo().frame(0);
      
      driver.findElement(By.id("userName")).sendKeys("24245");
      
      driver.findElement(By.id("close-pop")).click();
      driver.switchTo().defaultContent();
      Thread.sleep(3000);
      driver.findElement(By.name("keyword")).sendKeys("phone");
      List<WebElement> suggestion = driver.findElements(By.xpath("//span[text()='phone']"));
      System.out.println(suggestion.size());
      
      for(WebElement c:suggestion)
      {
    	  System.out.println(c.getText());
      }
      Thread.sleep(3000);
      driver.close();
	}

}
