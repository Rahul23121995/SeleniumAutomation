package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Skillrary {
	
	@FindBy(xpath="//a[text()='LOGIN']")
	private WebElement Loginbutton;
	
	@FindBy(id="email")
	private WebElement usernamebtn;
	
	@FindBy(id="password")
	private WebElement passwordbtn;
	
	@FindBy(name="login")
	private WebElement submit;
	
	public Skillrary(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void login()
	{
		Loginbutton.click();
	}
	public void username(String username)
	{
		usernamebtn.sendKeys(username);
	}
	public void password(String pwd)
	{
		passwordbtn.sendKeys(pwd);
	}
	
	public void submit()
	{
		submit.click();
		
	}

}
