package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loginscriptskillrary {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
	
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("rahulnshanbag@rediffmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("1233");
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
	
		
		String gettitle=driver.getTitle();
		System.out.println(gettitle);
if(gettitle.equals("Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!"))
			
		{
			System.out.println("pass;");
		}
else {
	System.out.println("fail;");
}
		
		
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		Thread.sleep(3000);
		driver.close();
		
		
		

	}

}
