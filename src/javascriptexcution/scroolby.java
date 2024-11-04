package javascriptexcution;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class scroolby {
public static void main(String[]Args) throws InterruptedException {
	WebDriver driver =new FirefoxDriver ();
	driver.manage().window().maximize();
	driver.get("https://www.icc-cricket.com/rankings");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
	JavascriptExecutor js=(JavascriptExecutor)driver;
	
	js.executeAsyncScript("window.scroolby", (0.2000));
	Thread.sleep(1000);
	driver.close();
	
}
}
