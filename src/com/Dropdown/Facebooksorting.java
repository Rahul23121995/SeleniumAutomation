package com.Dropdown;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebooksorting {

	public static void main(String[] args) {
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.facebook.com/");
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    
    driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
    WebElement dropdown = driver.findElement(By.id("month"));
       Select s = new Select(dropdown);
       s.selectByIndex(0);
       s.selectByValue("3");
       s.selectByVisibleText("Jun");
       
       System.out.println("Multiselect="+ s.isMultiple());
       
       List<WebElement> all = s.getOptions();
       System.out.println("Size="+ all.size());
            ArrayList al = new ArrayList<>();
            
       for(WebElement b:all)
       {
    	  String text = b.getText();
    	  al.add(text);
    	 
       }
       System.out.println("before sorting="+al.toString());
       Collections.sort(al);
       
       System.out.println("after sorting="+al.toString());
       
     
    	
        driver.close();
       
       
	}

}
