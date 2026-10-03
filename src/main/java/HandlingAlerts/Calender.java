package HandlingAlerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/datepicker/");
		Thread.sleep(4000);
		driver.switchTo().frame(0);
		WebElement dp=driver.findElement(By.id("datepicker"));
		dp.click();
		driver.findElement(By.xpath("//a[text()='5']")).click();
		String selected=driver.findElement(By.id("datepicker")).getAttribute("type");
		System.out.println(selected);
	}

}
