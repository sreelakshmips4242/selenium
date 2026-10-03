package com.Selenium;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EmptyBrowser {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		//get
		driver.get("https://saucelabs.com/");
		//getTitle()
		System.out.println(driver.getTitle());
		//getCurrentUrl
		System.out.println(driver.getCurrentUrl());
		//getPageSource
		System.out.println(driver.getPageSource());
		//getWindowHandle
		System.out.println(driver.getWindowHandle());
	
		// TODO Auto-generated method stub
	}
}