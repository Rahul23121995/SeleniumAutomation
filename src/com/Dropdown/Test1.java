package com.Dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement dropdown = driver.findElement(By.id("gh-cat"));
         Select s=new Select(dropdown);
         
         s.selectByIndex(6);
         Thread.sleep(3000);
         s.selectByValue("2984");
         Thread.sleep(3000);
         s.selectByVisibleText("Clothing, Shoes & Accessories");
         Thread.sleep(3000);
         
        List<WebElement> alloptions = s.getOptions();
        System.out.println(alloptions.size());
        for(WebElement a:alloptions)
        {
        	System.out.println(a.getText());
        }
         driver.close();
	}


}
