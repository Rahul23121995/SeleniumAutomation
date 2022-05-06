package com.TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test1 {

	@Test
	public void settings()
	{
		Reporter.log("settings",true);
	}
	
	@Test(priority= -1,invocationCount=5)
	public void calls()
	{
		Reporter.log("calls",true);
	}
	
	@Test(enabled=false)
	public void chats()
	{
		Reporter.log("chats",true);
	}
	
}
