package com.Autosuggestion;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 
	driver.get("https://www.amazon.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
        searchbox.sendKeys("wash");
        
        
        Thread.sleep(3000);
        List<WebElement> suggest = driver.findElements(By.xpath("//div[@class='s-suggestion s-suggestion-ellipsis-direction']"));
        System.out.println(suggest.size());
        
        for(WebElement f:suggest)
        {
        	System.out.println(f.getText());
        }
        driver.close();
        
	}

}
