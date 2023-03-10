package com.Popups.allTypes;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AlertPopups {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		WebElement ele = driver.findElement(By.id("course"));
       Actions a=new Actions(driver);
       a.moveToElement(ele).perform();
       driver.findElement(By.xpath("//a[text()='Selenium Training']")).click();
       driver.findElement(By.xpath("//button[text()=' Add to Cart']")).click();
           Alert b= driver.switchTo().alert();
           System.out.println(b.getText());
             b.accept();
              driver.close();
	}

}
