package com.app.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageObjects extends Basepage{
	
	@FindBy(xpath="//*[@id=\"block_top_menu\"]/ul/li[1]/a")
	private WebElement tabWomen;
	@FindBy(xpath="//*[@id=\"block_top_menu\"]/ul/li[2]/a")
	private WebElement tabDresses;
	@FindBy(xpath="//*[@id=\"block_top_menu\"]/ul/li[3]/a")
	private WebElement tabTshirts;
	
	public HomePageObjects() {
		PageFactory.initElements(driver, this);
	}
	
	public void clickwomen() {
		tabWomen.click();
	}
	public void clickDresses() {
		tabDresses.click();
	}
	public void clickTshirts() {
		tabTshirts.click();
	}
	public WebElement gettabWomen() {
		return tabWomen;
	}
	public WebElement gettabDresses() {
		return tabDresses;
	}
	public WebElement gettabTshirts() {
		return tabTshirts;
	}
	

}
