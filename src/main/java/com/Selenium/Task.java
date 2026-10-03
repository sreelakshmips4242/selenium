package com.Selenium;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Task {

	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.navigate().to("https://www.flipkart.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());	
		System.out.println(driver.getPageSource());
		driver.close();
			// TODO Auto-generated method stub

	}

}