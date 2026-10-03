package WebElenetMethod;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getter {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		//GETTERMETHOD
		WebElement email=driver.findElement(By.name("email"));
		System.out.println(email.getTagName());
		//GETLOCATION
        org.openqa.selenium.Point p=email.getLocation();
		System.out.println("X:"+p.getX());
		System.out.println("Y:"+p.getY());
		//GETCSS METHOD
		String e=email.getCssValue("font-family");
		System.out.println(e);
		String b=email.getCssValue("background-color");
		System.out.println(b);
		//GETATTRIBUTE
		String a=email.getAttribute("name");
		System.out.println(a);


	}

}
