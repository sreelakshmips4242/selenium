package com.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.navigate().to("https://www.amazon.in/");
		//navigate().back
		driver.navigate().back();
		//navigate().forward
		driver.navigate().forward();
		//navigate().refresh
		driver.navigate().refresh();
		// TODO Auto-generated method stub

	}

}