package com.Selenium;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssSelector {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/?hl=en");
		Thread.sleep(4000);
		//using attribute
		//driver.findElement(By.cssSelector("input[name='email']")).sendKeys("1234");
		//using starts with
		//driver.findElement(By.cssSelector("input[name^='pass']")).sendKeys("1234");
		//using ends with
		driver.findElement(By.cssSelector("div[class$='mpni']")).click();
		//using contains
		driver.findElement(By.cssSelector("div[class*='xd4mpni']")).click();


		
}
}