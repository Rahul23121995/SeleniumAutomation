package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		
		Thread.sleep(3000);
		System.out.println(driver.getCurrentUrl());
		
		Thread.sleep(3000);
		driver.close();

	}

}
