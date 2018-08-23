package com.myntra.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.myntra.generic.BasePage;

public class menPage extends BasePage
{
	@FindBy(xpath="//a[@href='/men-casual-shoes?src=sNav']")
	private WebElement casualLNK;
	
	@FindBy(xpath="//div[@class='brand-more']")
	private WebElement brandLNK;
	
	@FindBy(xpath="//input[@placeholder='Search brand']")
	private WebElement searchBTN;
	
	@FindBy(xpath="//input[@value='Adidas']")
	private WebElement adidasBOX;
	
	public menPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void verifyTitle(String eTitle)
	{
		verifyTitle(eTitle);
	}
	public void casualLink()
	{
		casualLNK.click();
	}
	
	public void brandLink()
	{
		brandLNK.click();
	}
	
	public void searchBrand(String brand)
	{
		searchBTN.sendKeys(brand);
	}
	
	public void clickAdidas()
	{
		adidasBOX.click();
	}
}
