package com.WebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
    WebElement ele = driver.findElement(By.name("sex"));
    
    if(ele.isSelected())
    {
    	System.out.println("Pass- the element is selected");
    }
    else {
    	System.out.println("Fail- the element is not selected");
    }
    driver.close();
	}

}
