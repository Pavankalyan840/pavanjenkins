package framsandwindow;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.firefox.FirefoxDriver;

public class window {
public static void main(String[] args) throws InterruptedException {

	WebDriver driver=new FirefoxDriver ();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.switchTo().newWindow(WindowType.TAB);
driver.get("https://www.swiggy.com/");
driver.switchTo().newWindow(WindowType.WINDOW); 
driver.get("https://www.swiggy.com/");
Thread.sleep(2000);
driver.close();
driver.quit();
}
}
