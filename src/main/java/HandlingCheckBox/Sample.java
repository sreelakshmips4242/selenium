package HandlingCheckBox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		Thread.sleep(4000);
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
	    search.sendKeys("Kurthis");
		search.sendKeys(Keys.ENTER); 
		driver.findElement(By.xpath("//span[text()='pull on']"));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(4000);
		WebElement check=driver.findElement(null)
	}

}
