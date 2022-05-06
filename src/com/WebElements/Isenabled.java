package com.WebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isenabled
{

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.ebay.com/");
		
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
WebElement search = driver.findElement(By.xpath("//input[@type='submit']"));
   
if  (search.isEnabled())
      {
     System.out.println("pass-The element is enabled");
	  }
else {
	System.out.println("Fail-The element is not enabled");
     }




	}
}
