package Wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class sample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		 driver.get("https://www.amazon.com/");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
		 Actions act=new Actions(driver);
		 Thread.sleep(4000);
		 WebElement b=driver.findElement(By.xpath("//span[text()='Account & Lists']"));
		 act.moveToElement(b).build().perform();
	}

}