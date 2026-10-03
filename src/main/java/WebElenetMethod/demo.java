package WebElenetMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.urbancompany.com/");
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//p[contains(text(),'Login')]")).click();

		
	}

}
