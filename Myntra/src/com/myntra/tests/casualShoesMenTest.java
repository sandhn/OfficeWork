package com.myntra.tests;

import org.testng.annotations.Test;

import com.myntra.generic.BaseTest;
import com.myntra.pages.homePage;
import com.myntra.pages.menPage;

public class casualShoesMenTest extends BaseTest
{
	@Test
	public void testcasualshoesTest() 
	{
	homePage h=new homePage(driver);
	menPage m=new menPage(driver);
	
	//h.verifyTitle("Online Shopping for Women");
	h.clickOnMenTab();
	
	//m.verifyTitle("Men Shopping Online");
	m.casualLink();
	
	m.brandLink();
	
	m.searchBrand("Adidas");
	
	m.clickAdidas();
	}
}
