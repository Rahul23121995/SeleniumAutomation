package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loginscriptlinkedin {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/signin");
		
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("rahulshanbhag639@gmail.com");
	    driver.findElement(By.xpath("//span[text()='Next']")).click();
	    driver.findElement(By.xpath("//input[@type='password']")).sendKeys("663866538");
	    driver.findElement(By.xpath("//span[text()='Next']")).click();
	    
	          String title = driver.getTitle() ;
	          System.out.println(title);
	          
	          if(title.equals("Welcome to gmail account"))
	          {
	        	  System.out.println("Pass-Home page is displayed");
	          }
	          else {
	        	  System.out.println("Fail-Home page is not displayed");
	          }
	          
	         String url = driver.getCurrentUrl(); 
	         System.out.println(url);
	         
	         Thread.sleep(3000);
	         driver.close();
		

	}

}
