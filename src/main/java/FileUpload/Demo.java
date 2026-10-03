package FileUpload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		/*WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/upload-download");
		Thread.sleep(4000);
		WebElement upload = driver.findElement(By.id("uploadFile"));
	    upload.sendKeys("\"C:\\Users\\devis\\Downloads\\Devi Saparya T S_resume (1).pdf\"");
	    */
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(4000);
		WebElement upload = driver.findElement(By.id("singleFileInput"));
		upload.sendKeys("C:\\Users\\user\\Desktop\\sreephoto.jpg");
		WebElement uploadButton = driver.findElement(By.id("Upload Single File"));

		uploadButton.click();
	}
	

}