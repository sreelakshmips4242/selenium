package snippet;

public class Snippet {
	WebElement date2 = driver.findElement(By.id("txtDate"));
	
	date2.click();
	
	driver.findElement(By.xpath("//a[text()='20']")).click();
	
	String selected = date2.getAttribute("value");
	
	System.out.println(selected);
}

