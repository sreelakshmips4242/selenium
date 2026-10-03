package HandlingAlerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestAutomation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(4000);
		driver.findElement(By.id("name")).sendKeys("sreelakshmi");
		driver.findElement(By.id("email")).sendKeys("sreelakshmip205@gmail.com");
		driver.findElement(By.id("phone")).sendKeys("7994922509");
		driver.findElement(By.id("textarea")).sendKeys("gfsdhsgfhsgfjhsgfhgshfgshjfgbd");
		Thread.sleep(4000);
		driver.findElement(By.id("female")).click();
		driver.findElement(By.id("tuesday")).click();
		Select country = new Select(driver.findElement(By.id("country")));
		country.selectByVisibleText("India");
		driver.findElement(By.id("colors")).sendKeys("blue");
		driver.findElement(By.id("animals")).sendKeys("cheetah");
		//driver.switchTo().frame(0);
		WebElement dp=driver.findElement(By.id("datepicker"));
		dp.click();
		driver.findElement(By.xpath("//a[text()='5']")).click();
		String selected=driver.findElement(By.id("datepicker")).getAttribute("type");
		System.out.println(selected);
		//2nd datepicker
		WebElement date2 = driver.findElement(By.id("txtDate"));
		date2.click();
		driver.findElement(By.xpath("//a[text()='20']")).click();
		String selected2 = date2.getAttribute("value");
		System.out.println(selected2);
		driver.findElement(By.id("start-date")).sendKeys("09-09-2026");
		driver.findElement(By.id("end-date")).sendKeys("27-09-2026");
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		
		WebElement upload = driver.findElement(By.id("singleFileInput"));
		upload.sendKeys("C:\\Users\\user\\Desktop\\sreephoto.jpg");
		driver.findElement(By.id("multipleFilesInput"))
	      .sendKeys(
	          "C:\\Users\\user\\Desktop\\sreephoto.jpg\n" +
	          "C:\\Users\\user\\Downloads\\WhatsApp Image 2026-09-22 at 7.02.38 PM.jpeg"
	      );
		driver.findElement(By.id("Wikipedia1_wikipedia-search-input")).sendKeys("flower");
		driver.findElement(By.id("Wikipedia1_wikipedia-search-button")).click();
		driver.findElement(By.xpath("//a[text()='Flower']")).click();
		driver.findElement(By.xpath("//button[text()='toggleButton(this)']")).click();

	}
}
