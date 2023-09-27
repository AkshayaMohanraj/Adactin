package com.adactin.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	
public WebDriver driver;
	
	
	public Loginpage(WebDriver driver2) {
		this.driver=driver2;
		
		PageFactory.initElements(driver, this);
		}

	public WebElement getUsername() {
		return Username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}
	
	@FindBy(id = "username")
	private WebElement Username;

	@FindBy(name = "password")
	private WebElement password;
	
	@FindBy(name = "login")
	private WebElement login;

}
