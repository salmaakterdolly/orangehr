package com.sa.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.sa.common.UserBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login extends UserBase{
	
	@Given("^as a user i am on registration page$")
	public void as_a_user_i_am_on_registration_page() throws Throwable {
	  launchBrowser();
	    
	}

	@When("^i enter \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void i_enter(String username, String password, String login) throws Throwable {
	  
		driver.findElement(By.name("txtUsername")).sendKeys(username);
		driver.findElement(By.name("txtPassword")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
		Thread.sleep(5000); 
	}

	@When("^i click on dashboard$")
	public void i_click_on_dashboard() throws Throwable {
	  
	    
	}

	@When("^i click on leavelist$")
	public void i_click_on_leavelist() throws Throwable {
		driver.findElement(By.xpath("//*[@class='quickLinkText' and contains(text(),'Leave List')]")).click(); 
		 Thread.sleep(5000);  
	    
	}

	@When("^i click on admin$")
	public void i_click_on_admin() throws Throwable {
	  
		Actions action = new Actions(driver);
		WebElement we = driver.findElement(By.id("menu_admin_viewAdminModule"));
	    action.moveToElement(we).moveToElement(driver.findElement(By.id("menu_admin_UserManagement"))).click().build().perform();
	     
	}

	@When("^i click on user managment$")
	public void i_click_on_user_managment() throws Throwable {
	  
	    
	}

	@When("^i click on user$")
	public void i_click_on_user() throws Throwable {
	  
	    
	}

	@When("^i click on search$")
	public void i_click_on_search() throws Throwable {
	  
	    
	}

	@Then("^i see the user leave list$")
	public void i_see_the_user_leave_list() throws Throwable {
	  
	    
	}


}
