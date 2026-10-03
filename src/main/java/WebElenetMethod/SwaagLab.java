package WebElenetMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwaagLab {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(4000);
		
		//Verify login user-name standard_user

		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[text()='Add to cart'][1]")).click();
		
		
		driver.findElement(By.id("shopping_cart_container")).click(); 
		Thread.sleep(2000);
		driver.findElement(By.id("remove-sauce-labs-backpack")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("checkout")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("first-name")).sendKeys("assdad");
		Thread.sleep(2000);
		driver.findElement(By.id("last-name")).sendKeys("bnmvb");
		Thread.sleep(2000);
		driver.findElement(By.id("postal-code")).sendKeys("12345");
		Thread.sleep(2000);
		driver.findElement(By.id("continue")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("finish")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("back-to-products")).click();
		driver.findElement(By.id("continue-shopping")).click();
		
	
	
		
		
		
	}

}
