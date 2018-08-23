package com.myntra.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.myntra.generic.BasePage;

public class homePage extends BasePage
	{	
	  
		@FindBy(xpath= "//a[.='Men']")
		private WebElement menBTN;
		
		@FindBy(xpath= "//a[.='Women']")
		private WebElement womenBTN;
		
		public homePage(WebDriver driver)
		{
			super(driver);
			PageFactory.initElements(driver, this);
		}
		
		public void verifyTitle(String eTitle)
		{
			verifyTitle(eTitle);
		}
		
		public void clickOnMenTab()
		{
			menBTN.click();
		}
		
		public void clickOnWomenTab()
		{
			womenBTN.click();
		}
		
		
	
	}
