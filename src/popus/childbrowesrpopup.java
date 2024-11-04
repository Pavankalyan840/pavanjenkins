package popus;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class childbrowesrpopup {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	
WebElement searchft=driver.findElement(By.className("_3704LK"));
driver.findElement(By.xpath("//button[contains(@class,\"_2KpZ6l _2doB4z\")]")).click();

searchft.sendKeys("iphone");
driver.findElement(By.className("L0Z3Pu")).click();
driver.findElement(By.xpath("//div[text()='APPLE iPhone 13 (Blue, 128 GB)']")).click();
String praent=driver.getWindowHandle();
Set<String> ids =driver.getWindowHandles();
for(String id: ids) {
	driver.switchTo().window(id);
   }
String rating=driver.findElement(By.xpath("//span[text()='APPLE iPhone 13 (Blue, 128 GB)']/ancestor::div/descendant::div[@class='_3LWZlK']")).getText();
System.out.println(rating);
driver.close();
driver.switchTo().window(praent);
searchft.clear();
searchft.sendKeys("teddy");
driver.findElement(By.className("L0Z3Pu")).click();
Thread.sleep(3000);
driver.close();

}}