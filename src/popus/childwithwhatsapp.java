package popus;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class childwithwhatsapp {
public static void main(String[]Args) throws InterruptedException {
	WebDriver driver = new FirefoxDriver();
driver.manage().window().maximize();
driver.get("https://www.amazon.com/");
WebElement serachp=driver.findElement(By.xpath("//input[@aria-label=\"Search Amazon\"]"));
serachp.sendKeys("moto g34");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200));
driver.findElement(By.xpath("//input[@id=\"nav-search-submit-button\"]")).click();

driver.findElement(By.xpath("//span[@id=\"productTitle\"]")).click();
String string=driver.getWindowHandle();
Set<String> id2=driver.getWindowHandles();
for(String id: id2) {
	driver.switchTo().window(id);
   }
String rating =driver.findElement(By.xpath("")).getText();

driver.findElement(By.xpath("//input[@id=\"nav-search-submit-button\"]")).click();
System.out.printf(rating);
driver.close();
driver.switchTo().window(string);
serachp.clear()
;
serachp.sendKeys("mens inner wear");
Thread.sleep(200);
driver.close()
;}
}
