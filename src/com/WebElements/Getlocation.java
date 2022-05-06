package com.WebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getlocation {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement username=driver.findElement(By.id("pass"));
          Point loc= username.getLocation();
          System.out.println(loc.getX()+"x axis coordinate");
          System.out.println(loc.getY()+"Y axis coordinate");
          
          driver.close();
	}

}
