package javascriptexcution;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class scrollbar1 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver =new FirefoxDriver ();
	
	driver.manage().window().maximize();
	driver.get("https://www.youtube.com");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement trading=driver.findElement(By.xpath("//span[text()='Trending']"));
	
	Point loc =trading.getLocation();
	int x=loc.getX();
	int y=loc.getY();
JavascriptExecutor js=(JavascriptExecutor)driver;
js.executeScript("arugments[0]=click()", trading);
js.executeScript("window.scroolBy("+x+","+y+")");
Thread.sleep(2000);
driver.close();



}
}
