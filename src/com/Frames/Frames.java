package com.Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath("//a[@class='gb_A']")).click();
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//span[text()='Calendar']")).click();

	}

}
