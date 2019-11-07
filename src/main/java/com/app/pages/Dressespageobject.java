package com.app.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Dressespageobject extends Basepage{
	public Dressespageobject() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = ".//*[@id='ul_layered_id_attribute_group_1']/li/label[1]/a")
	private WebElement small;

	public WebElement smallsize() {
		return small;

	}

	@FindBy(xpath = ".//*[@id='ul_layered_id_attribute_group_1']/li/label[2]/a")
	private WebElement medium;

	public WebElement mediumsize() {
		return medium;

	}

	@FindBy(xpath = ".//*[@id='ul_layered_id_attribute_group_1']/li/label[3]/a")
	private WebElement large;

	public WebElement largesize() {
		return large;

	}

	@FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[2]/a")
	private List<WebElement> tablecount;

	public int gettablecount() {
		return tablecount.size();

}
}
