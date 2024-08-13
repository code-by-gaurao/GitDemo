 package com.e_learingproject.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoardPage extends BaseTest {


	WebDriver driver;
	//constructor
	public DashBoardPage(WebDriver lDriver)
	{
		this.driver=lDriver;
		
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//*[@id=\"login-list\"]/li[1]/a") WebElement dashboardClick;
	
    @FindBy(xpath="//*[@id=\"learn-press-user-profile\"]/ul/li[3]") WebElement offerAcademies;
	
	@FindBy(xpath="//*[@id=\"tab-academies\"]/div/div/ul/li[1]/form/div/button") WebElement subsribebtn;
	
	public void dashboardclick()
	{
		dashboardClick.click();	
		offerAcademies.click();
		subsribebtn.click();
		
		}
}
