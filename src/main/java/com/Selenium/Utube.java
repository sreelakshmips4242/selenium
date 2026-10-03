package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Utube {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		Thread.sleep(4000);
		
		
		driver.findElement(By.name("search_query")).sendKeys("kalyani");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='ytSearchboxComponentSearchButton']")).click();
		Thread.sleep(4000);
		driver.findElement(By.partialLinkText("KALYANI (with Shreya Ghoshal)")).click();		
		//DYNAMIC ID
		//driver.findElement(by.xpath)
	}

}