package com.app.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.app.pages.Basepage;
import com.app.pages.Dressespageobject;
import com.app.pages.HomePageObjects;

public class Dressespagetest {
	Dressespageobject dp;
	Basepage bp;
	HomePageObjects hp;

	public Dressespagetest() {
		dp = new Dressespageobject();
		bp = new Basepage();
		hp = new HomePageObjects();
	}

	@Test
	public void dresstab() {
		hp.clickDresses();
		Assert.assertTrue(bp.getTitle().contains("Dresses - My Store"));
	}

	@Test
	public void verificationsizes() {
		Assert.assertTrue(bp.elementFound(dp.smallsize()));
		Assert.assertTrue(bp.elementFound(dp.mediumsize()));
		Assert.assertTrue(bp.elementFound(dp.largesize()));
	}

	@Test
	public void verifycount() {
		int tablecount = dp.gettablecount();
		int headcount = dp.gettablecount();
		Assert.assertTrue(tablecount == headcount);

}
}

