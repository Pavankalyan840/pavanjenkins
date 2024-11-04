package javascriptexcution;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class passthedateandclickelemt {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver =new FirefoxDriver ();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
	WebElement shoes=driver.findElement(By.xpath("//input[@placeholder=\"Search for products, brands and more\"]"));
	WebElement search=driver.findElement(By.xpath("//button[@type=\"submit\"]"));
JavascriptExecutor js=(JavascriptExecutor)driver;

js.executeScript("argumenat[0].value=agrument[1]",shoes,"shoes");
Thread.sleep(2000);
js.executeScript("argument[0].click();",search);
Thread.sleep(2000);
js.executeScript("history.go[0]");
Thread.sleep(2000);
driver.close();


}
}
