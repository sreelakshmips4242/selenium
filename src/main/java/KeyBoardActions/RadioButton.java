package KeyBoardActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.spicejet.com/");
		//Thread.sleep(4000);
		//WebElement r=driver.findElement(By.xpath("//div[text()='round trip']"));
		//Thread.sleep(4000);
		//r.click();
		driver.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(4000);
		driver.findElement(By.id("female")).click();
		//FILE UPLOAD 


}
}