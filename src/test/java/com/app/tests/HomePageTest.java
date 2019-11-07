package com.app.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.app.pages.Basepage;
import com.app.pages.HomePageObjects;

public class HomePageTest extends Basepage{
	HomePageObjects hp;
	Basepage bp;
	
	public HomePageTest() {
		hp=new HomePageObjects();
		bp=new Basepage();
		}
	@Test
	public void verifyTabNavigation() {
		Assert.assertTrue(bp.elementFound(hp.gettabWomen()));
		Assert.assertTrue(bp.elementFound(hp.gettabDresses()));
		Assert.assertTrue(bp.elementFound(hp.gettabTshirts()));
	}
	@Test
	public void verifyWomen() {
		hp.clickwomen();
		Assert.assertTrue(bp.getTitle().contains("Women"));
	}
	@Test
	public void verifyDresses() {
		hp.clickDresses();
		Assert.assertTrue(bp.getTitle().contains("Dresses"));
	}
	@Test
	public void verifyTshirts() {
		hp.clickTshirts();
		Assert.assertTrue(bp.getTitle().contains("T-shirts"));
	}

	}


