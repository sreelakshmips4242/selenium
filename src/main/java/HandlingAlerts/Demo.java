package HandlingAlerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/windows");
		Thread.sleep(4000);
		driver.findElement(By.linkText("Click Here")).click();
		Thread.sleep(2000);
		Object[] windows=driver.getWindowHandles().toArray();//
		String parentWindow=windows[0].toString();
		String childWindow=windows[1].toString();
		driver.switchTo().window(childWindow);
		System.out.println("Child Window:"+driver.getTitle());	
		driver.switchTo().window(parentWindow);
		System.out.println("Parent Window:"+driver.getTitle());	
		driver.quit();
		}
}