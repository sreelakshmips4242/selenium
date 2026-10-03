package KeyBoardActions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		/*
		//ENTER
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		Thread.sleep(4000);
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("sarees");
		search.sendKeys(Keys.ENTER);
		*/
		/*
		//BACKSPACE
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		Thread.sleep(4000);
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("sarees");
		search.sendKeys(Keys.BACK_SPACE);
		*/
		
		/*
		//CLEAR
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		Thread.sleep(4000);
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("sarees");
		search.sendKeys(Keys.CLEAR);
		*/
		
		/*
		//COPY PASTE
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		Thread.sleep(4000);
		WebElement ca = driver.findElement(By.id("currentAddress"));
		ca.sendKeys("Abc Apartment Whitefield Banglore");
		ca.sendKeys(Keys.CONTROL+"A");
		ca.sendKeys(Keys.CONTROL+"C");
		
		Thread.sleep(4000);
		WebElement pa = driver.findElement(By.id("permanentAddress"));
		pa.sendKeys(Keys.CONTROL+"V");
		driver.close();
		*/
		
		/*
		//SHIFT KEY
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		Thread.sleep(4000);
		WebElement email = driver.findElement(By.id("userEmail"));
		email.sendKeys("abcd"+Keys.SHIFT+"@");
		email.sendKeys("gmail.com");
		*/
		
		/*
		//ARROW UP AND DOWN
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		Thread.sleep(4000);
		WebElement drop = driver.findElement(By.id("oldSelectMenu"));
		drop.sendKeys(Keys.ARROW_DOWN);
		drop.sendKeys(Keys.ARROW_DOWN);
		drop.sendKeys(Keys.ARROW_DOWN);
		drop.sendKeys(Keys.ARROW_UP);
		driver.close();
		*/
		
		/*
		//ESCAPE
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		Thread.sleep(4000);
		driver.manage().window().fullscreen();
		WebElement esc = driver.findElement(By.id("twotabsearchtextbox"));
		esc.sendKeys("sarees");
		esc.sendKeys(Keys.ESCAPE);
		*/
		
		//DELETE
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		Thread.sleep(4000);
		WebElement dele = driver.findElement(By.id("twotabsearchtextbox"));
		dele.sendKeys("sarees");
		Thread.sleep(4000);
		dele.sendKeys(Keys.CONTROL+"A");
		dele.sendKeys(Keys.DELETE);
		
		//
	}
}