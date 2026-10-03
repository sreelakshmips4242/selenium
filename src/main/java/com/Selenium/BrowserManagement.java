package com.Selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserManagement {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		/*driver.get("https://www.facebook.com/")*/
		driver.get("https://www.amazon.com/");
		//maximize()
		/*driver.manage().window().maximize();*/
		//minimize
		/*driver.manage().window().minimize();*/
		//fullscreen
		/*driver.manage().window().fullscreen();*/
		//driver.close();
		//driver.quit();
		//getSize
		/*Dimension size=driver.manage().window().getSize();
		System.out.println("Width "+size.getWidth());
		System.out.println("Height "+size.getHeight())*/
		//setSize
		/*driver.manage().window().setSize(new Dimension(1000,900));*/
	    //getPosition
		/*Point p=driver.manage().window().getPosition();
		System.out.println("X coordinate"+p.getX());
		System.out.println("Y coordinate"+p.getY());*/
		//setPosition
		driver.manage().window().setPosition(new Point(100,200));
		
		// TODO Auto-generated method stub

	}
}