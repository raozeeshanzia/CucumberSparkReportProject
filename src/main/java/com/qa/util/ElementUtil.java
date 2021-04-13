package com.qa.util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class ElementUtil {
	
	WebDriver driver;
	
	public void switchToWindow(WebDriver driver) {
		
		for(String winHandle : driver.getWindowHandles()){
		    driver.switchTo().window(winHandle);
		    driver.manage().window().maximize();
		    
		}
	}
	
	public void implicitWait(int time,WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}

}
