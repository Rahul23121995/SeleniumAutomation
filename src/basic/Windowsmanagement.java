package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowsmanagement {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://job4freshers.co.in/");
		
		
		Thread.sleep(3000);
		driver.manage().window().maximize();
		
		
		Thread.sleep(3000);
		driver.manage().window().fullscreen();
		
		Thread.sleep(3000);
		driver.manage().window().minimize();
		
		

	}

}
