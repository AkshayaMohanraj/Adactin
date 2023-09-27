package com.adactin.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search {
	
public  WebDriver driver;	
	
	@FindBy(id = "location")
	private WebElement location;
	
	public Search(WebDriver driver2) {
		
		this.driver=driver2;
		
		PageFactory.initElements(driver, this);
		}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getRoomno() {
		return roomno;
	}

	public WebElement getCheckin() {
		return checkin;
	}

	public WebElement getCheckout() {
		return checkout;
	}

	public WebElement getAdult() {
		return adult;
	}

	public WebElement getChildren() {
		return children;
	}

	public WebElement getSearch() {
		return search;
	}

	public WebElement getReset() {
		return reset;
	}

	@FindBy(name = "hotels")
	private WebElement hotel;
	
	@FindBy(name = "room_type")
	private WebElement roomtype;
	
	@FindBy(id = "room_nos")
	private WebElement roomno;
	
	@FindBy(name = "datepick_in")
	private WebElement checkin;
	
	
	@FindBy(id = "datepick_out")
	private WebElement checkout;
	
	@FindBy(name = "adult_room")
	private WebElement adult;
	
	@FindBy(id = "child_room")
	private WebElement children;
	
	@FindBy(name = "Submit")
	private WebElement search;
	
	@FindBy(id = "Reset")
	private WebElement reset;
	

}
