package com.qa.mytests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.factory.TLDriverFactory;

public class FaceBookTest extends BaseTest{

	@Test
	public void getTitleFacebook_0() {
		TLDriverFactory.getTLDriver().get("https://www.facebook.com/");
        String title = TLDriverFactory.getTLDriver().getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Facebook");

	}

	@Test
	public void getTitleFacebook_1() {
		TLDriverFactory.getTLDriver().get("https://www.Facebook.com/");
		String title = TLDriverFactory.getTLDriver().getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Facebook");

	}

	@Test(enabled=false)
	public void getTitleFacebook_2() {
		TLDriverFactory.getTLDriver().get("https://www.Facebook.com/");
		String title = TLDriverFactory.getTLDriver().getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Facebook");

	}
	
	
}
