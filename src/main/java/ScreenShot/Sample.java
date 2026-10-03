package ScreenShot;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/");

        Thread.sleep(4000);

        File srcFile = ((TakesScreenshot) driver)
                .getScreenshotAs(OutputType.FILE);

        File dest = new File("image.png");

        FileUtils.copyFile(srcFile, dest);

        System.out.println("Screenshot Captured");

        driver.quit();
    }
}