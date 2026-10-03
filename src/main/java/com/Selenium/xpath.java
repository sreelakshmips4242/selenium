package com.Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {

	public static void main(String[] args) throws InterruptedException {
		//XPATH BY ATTRIBUTE
		/*
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("problem_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		*/
		//XPATH BY NAME
		
				
				WebDriver driver=new ChromeDriver();
				driver.get("https://www.saucedemo.com/");
				Thread.sleep(4000);
				driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
				driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
				driver.findElement(By.xpath("//input[@id='login-button']")).click();
				driver.findElement(By.xpath("//button[text()='Add to cart'][2]")).click();
				
			/*
				//XPATH BY CONTAINS FUNCTION  //a[contains(text(),'Test')]
				WebDriver driver=new ChromeDriver();
				//driver.get("https://www.automationexercise.com/");
				Thread.sleep(4000);
				//driver.findElement(By.xpath("//a[contains(text(),'Signup')]")).click();
				//driver.findElement(By.xpath("//a[contains(text(),'Test')]")).click();
				//driver.findElement(By.xpath("//a[contains(text(),'API')]")).click();
				//driver.findElement(By.xpath("//a[contains(text(),'Video')]")).click();
				driver.findElement(By.xpath("//a[contains(text(),'Products')]")).click();
				
				//driver.get("https://www.automationexercise.com/products");
				Thread.sleep(4000);
				driver.findElement(By.xpath("//input[contains(@id,'search')]")).sendKeys("Shirts");
			*/
	}
}
