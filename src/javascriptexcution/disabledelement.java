package javascriptexcution;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class disabledelement {
	public static void main(String[] args) throws InterruptedException {
		
	
WebDriver driver =new FirefoxDriver();
driver.manage().window().maximize();
driver.get("file:///D:/input%20text=text%20id=user%20disabled.html");
WebElement Element=driver.findElement(By.id("user"));
WebElement element1=driver.findElement(By.xpath("//input[text()='text']"));
JavascriptExecutor js =(JavascriptExecutor)driver;
js.executeScript("arguments[0].values=arguments[1]",Element,"abc");
	js.executeScript("arguments[0].clcik();", element1);
	Thread.sleep(2000);
	
	driver.close();
	
	}
}
