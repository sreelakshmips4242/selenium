package WebElenetMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class swagLab {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		//Thread.sleep(4000);

		//driver.findElement(By.xpath("//button[text()='Add to cart'][1]")).click();
		driver.findElement(By.xpath("//button[text()='Add to cart'][1]")).click();

		Thread.sleep(2000);

		//driver.findElement(By.xpath("//button[@id='remove-sauce-labs-backpack']")).click();

		driver.findElement(By.id("shopping_cart_container")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("continue-shopping")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("checkout")).click();		
		Thread.sleep(2000);
		driver.findElement(By.id("first-name")).sendKeys("abcd");
		Thread.sleep(2000);
		driver.findElement(By.id("last-name")).sendKeys("efgh");
		Thread.sleep(2000);
		driver.findElement(By.id("postal-code")).sendKeys("1234");
		Thread.sleep(2000);
		driver.findElement(By.id("continue")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("cancel")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("finish")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("back-to-products")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("generate-pdf-order")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("react-burger-menu-btn")).click();
		//driver.findElement(By.id("inventory_sidebar_link")).click();
		//driver.findElement(By.xpath("//a[@id='inventory_sidebar_link']")).click();
	}

}
