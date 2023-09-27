package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.Baseclass_New;
import com.adactin.helper.Reader_Manager;
import com.adactin.pageobjectmodel.Pagemanager;
import com.adactin.testrunner.Adactin_Testrunner;
import com.adactin.testrunner.Adactin_Testrunner.AdactinTest_Runner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Adactin_Stepdefinition extends Baseclass_New
{
	public static WebDriver driver=AdactinTest_Runner.driver;
	public static Pagemanager page=new Pagemanager(driver);
	
	
	@Given("^User is on the adactin Application$")
	public void user_is_on_the_adactin_Application() throws Throwable {
		
		String url = Reader_Manager.getInstance().getInstanceCR().getUrl();
		getUrl(url);
	   
	}

	@When("^User Enetr the User_Name in \"([^\"]*)\" Field$")
	public void user_Enetr_the_User_Name_in_Field(String username) throws Throwable {

	   inputValuestoElement(page.getLogin().getUsername(), username);
	}

	@When("^User Enter Password in \"([^\"]*)\" Field$")
	public void user_Enter_Password_in_Field(String password) throws Throwable {

	   inputValuestoElement(page.getLogin().getPassword(), password);
	}

	@Then("^User Enter Login Button to search Hotels$")
	public void user_Enter_Login_Button_to_search_Hotels() throws Throwable {

	   elementClick(page.getLogin().getLogin());
	}

	@When("^User Select the Location in location Field$")
	public void user_Select_the_Location_in_location_Field() throws Throwable {

	   selectValuesfromDD(page.getSer().getLocation(), "4", "london");
	}

	@When("^User Select Hotel in hotel Field$")
	public void user_Select_Hotel_in_hotel_Field() throws Throwable {

	   selectValuesfromDD(page.getSer().getHotel(), "8", "hotel sunshine");
	}

	@When("^User Select RoomType in Roomtype Field$")
	public void user_Select_RoomType_in_Roomtype_Field() throws Throwable {

	   selectValuesfromDD(page.getSer().getRoomtype(), "4", "standard");
	}

	@When("^User Enter No\\.of Rooms in RoomNos Field$")
	public void user_Enter_No_of_Rooms_in_RoomNos_Field() throws Throwable {

	   selectValuesfromDD(page.getSer().getRoomno(), "10", "one");
	}

	@When("^User Enter Check_In Date in Checkin Field$")
	public void user_Enter_Check_In_Date_in_Checkin_Field() throws Throwable {

	   inputValuestoElement(page.getSer().getCheckin(), "02/10/2023");
	}

	@When("^User Enter Check_Out Date in checkout Field$")
	public void user_Enter_Check_Out_Date_in_checkout_Field() throws Throwable {

	   inputValuestoElement(page.getSer().getCheckout(), "05/10/2023");
	}

	@When("^User Enter Adults per Room details in respective Field$")
	public void user_Enter_Adults_per_Room_details_in_respective_Field() throws Throwable {

	   selectValuesfromDD(page.getSer().getAdult(), "4", "two");
	}

	@When("^User Enter Childrens per Room details in respective Field$")
	public void user_Enter_Childrens_per_Room_details_in_respective_Field() throws Throwable {

	   selectValuesfromDD(page.getSer().getChildren(), "4", "one");
	}

	@Then("^User Enter Search Button to Search Hotel$")
	public void user_Enter_Search_Button_to_Search_Hotel() throws Throwable {

	   elementClick(page.getSer().getSearch());
	}



}
