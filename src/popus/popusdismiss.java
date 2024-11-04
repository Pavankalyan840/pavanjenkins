package popus;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class popusdismiss {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
Alert a=driver.switchTo().alert();Thread.sleep(2000);
System.out.println(a.getText());
a.sendKeys("abcd");
Thread.sleep(2000);
a.accept();





driver.close();
}
}
