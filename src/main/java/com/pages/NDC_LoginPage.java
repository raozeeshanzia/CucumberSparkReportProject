package com.pages;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;



public class NDC_LoginPage {
	private WebDriver driver;
	By username= By.id("signOnName");
	By password= By.id("password");
	By login_button= By.id("sign-in");
	By tools= By.xpath("//a[@title='Tools']");
	By myCompanies= By.xpath("(//img[@id='imgError'])[2]");
	By city= By.xpath("(//a[contains(text(), 'ISLAMABAD')])[1]");
	
	public NDC_LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void enterUserName(String userName) {
		
		WebElement userNameField= driver.findElement(username);
		userNameField.sendKeys(userName);
	}
	
	public void enterPassword(String Password) {
		
		WebElement passwordField= driver.findElement(password);
		passwordField.sendKeys(Password);
	}
	
	public void clickLoginButton() {
		
		WebElement loginButton= driver.findElement(login_button);
		loginButton.click();
	}
	
	public void clickTools() throws InterruptedException {
		driver.switchTo().frame(0);
		Thread.sleep(15000);
		WebElement toolsLink= driver.findElement(tools);
		toolsLink.click();
		driver.switchTo().defaultContent();
	}
	
	public void clickBranch() throws InterruptedException {
		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs2.get(1));
	    Thread.sleep(15000);
		WebElement myCompaniesLink= driver.findElement(myCompanies);
		myCompaniesLink.click();
		Thread.sleep(15000);
		WebElement branchCity= driver.findElement(city);
		branchCity.click();
		Thread.sleep(15000);
		
	}
	
	public void verifyDesiredPage() throws InterruptedException {
		String expected="T24 - ISLAMABAD";
		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs2.get(2));
	    Thread.sleep(15000);
		String actuall= driver.getTitle();
		System.out.print(actuall);
		Assert.assertEquals(actuall, expected);
		
		
	}
}
