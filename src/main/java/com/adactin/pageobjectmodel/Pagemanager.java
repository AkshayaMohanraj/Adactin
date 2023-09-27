package com.adactin.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Pagemanager {
	
public WebDriver driver;
	
	private static Loginpage login;
	private static Search ser;
	
	
	public Pagemanager(WebDriver driver2) {
		
		this.driver=driver2;
		PageFactory.initElements(driver, this);
		
	}
	public Loginpage getLogin() {
		
		
			login= new Loginpage(driver);
		
		return login;
	}
	public Search getSer() {
		
		
			ser = new Search(driver);
		
		return ser;
	}

}
