package HandlingAlerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleAlerts {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/alerts");
        Thread.sleep(4000);
      //SIMPLE ALERTS (ONLY 'OK')
        /*driver.findElement(By.id("alertButton")).click();
        Alert a=driver.switchTo().alert();
        Thread.sleep(4000);
        a.accept();*/
     //CONFIRMATION ALTERS(OK AND CANCEL OPTION THERE)
        /*driver.findElement(By.id("confirmButton")).click();
        Thread.sleep(2000);
        Alert b=driver.switchTo().alert();
        //b.accept();
        Thread.sleep(2000);
        b.dismiss();*/
     //PROMPT ALTERTS (SOMETHING TEXT)
        driver.findElement(By.id("promtButton")).click();
        Thread.sleep(2000);
        Alert c=driver.switchTo().alert();
        System.out.println(c.getText());
        c.sendKeys("sree");
        Thread.sleep(2000);
        c.accept();
        
        


    }
}
	
	


