package com.WebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Submitfunction {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
        WebElement user=driver.findElement(By.id("twotabsearchtextbox"));
            user.sendKeys("phone");
            Thread.sleep(3000);
            user.clear();
            Thread.sleep(3000);
            user.sendKeys("cooker");
            
          driver.findElement(By.id("nav-search-submit-button")).submit();
          driver.close();
	}

}
