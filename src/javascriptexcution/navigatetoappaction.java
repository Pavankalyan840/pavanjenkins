package javascriptexcution;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class navigatetoappaction {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.youtube.com/");
	JavascriptExecutor js=(JavascriptExecutor)driver;
	
	js.executeScript("window.location=arguments[0]","https://www.flipkart.com/");
	

System.out.println(js.executeScript("return document.tittle"));	
	System.out.println(js.executeScript("return document.URl"));
	Thread.sleep(3000);
	js.executeScript("history.go[0]");
	Thread.sleep(3000);
	
	driver.close();
}
}
