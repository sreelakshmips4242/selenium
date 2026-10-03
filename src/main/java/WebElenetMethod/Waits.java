package WebElenetMethod;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//global wait
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.facebook.com/");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 WebElement psw=driver.findElement(By.name("pass"));
		 psw.sendKeys("abcd");
		 
		 //Explicit Wait
		 WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(40));
		 WebElement email=wait.until(
				 ExpectedConditions.visibilityOfElementLocated(By.name("email")));
		 email.sendKeys("abcd@gmail.com");
		 
		// WebElement login=wait.until(
		 //ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Log in']")));
		 //login.click();
		 
		 //FLUENT WAIT 
		 Wait<WebDriver> wait1=new FluentWait<WebDriver>(driver)
				 	.pollingEvery(Duration.ofSeconds(1))
		 			.withTimeout(Duration.ofSeconds(30))
		 			.ignoring(NoSuchElementException.class);
		 WebElement login=wait1.until(
		 					 ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Log in']")));
		 login.click();
		
		
		 			
	// TODO Auto-generated method stub
		
	}

}