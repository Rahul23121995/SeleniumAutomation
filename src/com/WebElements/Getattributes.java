package com.WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getattributes {

	public static void main(String[] args) throws InterruptedException {
  WebDriver driver=new ChromeDriver();
  driver.manage().window().maximize();
  driver.get("https://www.amazon.com/");
  WebElement username=driver.findElement(By.id("twotabsearchtextbox"));
       System.out.println(username.getAttribute("id"));
    Thread.sleep(3000);   
       driver.close();

	}

}
