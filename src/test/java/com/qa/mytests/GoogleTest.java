package com.qa.mytests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.factory.TLDriverFactory;

public class GoogleTest extends BaseTest {

	@Test
	public void getTitleGoogle_0() {
		TLDriverFactory.getTLDriver().get("https://www.google.com/");

		String title = TLDriverFactory.getTLDriver().getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Google");

	}

	@Test
	public void getTitleGoogle_1() {
		TLDriverFactory.getTLDriver().get("https://www.google.com/");
		String title = TLDriverFactory.getTLDriver().getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Google");

	}

	@Test
	public void getTitleGoogle_2() {
		TLDriverFactory.getTLDriver().get("https://www.google.com/");
		String title = TLDriverFactory.getTLDriver().getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Google");

	}

	@Test
	public void getTitleGoogle_3() {
		TLDriverFactory.getTLDriver().get("https://www.google.com/");
		String title = TLDriverFactory.getTLDriver().getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Google");

	}

	@Test
	public void getTitleGoogle_4() {
		TLDriverFactory.getTLDriver().get("https://www.google.com/");
		String title = TLDriverFactory.getTLDriver().getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Google");

	}

}
