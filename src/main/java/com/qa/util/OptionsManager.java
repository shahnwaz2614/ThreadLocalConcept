package com.qa.util;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class OptionsManager {
	
	//get chrome options or handle browser profiling
	
	public static ChromeOptions getChromeOptions(){
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--start-maximized");
	//	options.addArguments("--headless");
		options.addArguments("--ignore-certificate--errors");
		options.addArguments("--disable-popup-blocking");
		options.addArguments("--incognito");
		
		return options;
		
		
	}
	//get firefox options
	public static FirefoxOptions getFirfoxOptions(){
		FirefoxOptions fo=new FirefoxOptions();
		FirefoxProfile profile=new FirefoxProfile();
		profile.setAcceptUntrustedCertificates(true);
		profile.setAssumeUntrustedCertificateIssuer(false);
	    fo.setCapability(FirefoxDriver.PROFILE, profile);
		return fo;
		
		
	}
	
	
	

}
