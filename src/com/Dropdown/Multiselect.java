package com.Dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiselect {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoapp.skillrary.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement dd = driver.findElement(By.id("cars"));
        Select a = new Select(dd);
        a.selectByIndex(2);
        a.selectByValue("199");
        a.selectByVisibleText("More Than INR 500 ( 55 ) ");
        
        
        System.out.println(a.isMultiple());
        
        if(a.isMultiple())
        {
        	a.deselectAll();
        }
        
        driver.close();
	}

}
