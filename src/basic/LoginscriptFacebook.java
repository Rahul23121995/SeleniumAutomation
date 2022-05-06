package basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginscriptFacebook {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.id("email")).sendKeys("7676330700");
         driver.findElement(By.name("pass")).sendKeys("9449500100");
         driver.findElement(By.name("login")).click();
         
           String title =  driver.getTitle();
           System.out.println(title);
           
           if(title.equals("Facebook"))
           {
        	   System.out.println("pass- homepage is displayed");
           }
           else
           {
        	   System.out.println("fail-homepage is not displayed");
           }
           String url=driver.getCurrentUrl();
           System.out.println(url);
           
           driver.close();
	}

}
