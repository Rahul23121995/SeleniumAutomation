package com.WebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
         if(search.isDisplayed())
         {
        	 System.out.println("Pass- The element is displayed");
         }
         else
         {
        	 System.out.println("Fail- The element is not displayed");
         }
         driver.close();
	}

}
