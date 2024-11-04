package javascriptexcution;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public interface flipkart {
public static void main (String []Args) throws InterruptedException {
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
	WebElement searchft=driver.findElement(By.xpath("//input[@class=\"Pke_EE\"]"));
	WebElement searchbutton=driver.findElement(By.xpath("//button[@title=\"Search for Products, Brands and More\"]"));
JavascriptExecutor js=(JavascriptExecutor)driver;
js.executeScript("arguments[0].values=arguments[1]",searchft,"shoes");
Thread.sleep(4000);
js.executeScript("arguments[0].click()",searchbutton );
Thread.sleep(2000);
driver.close();

}
}
