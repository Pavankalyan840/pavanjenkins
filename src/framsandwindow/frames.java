package framsandwindow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class frames {
public static void main(String[] args) {
	WebDriver driver=new FirefoxDriver ();
	
	driver.manage().window().maximize();
	driver.get("https://www.youtube.com/");
	
	WebElement singin=driver.findElement(By.className("yt-spec-touch-feedback-shape__fill"));
	
	driver.switchTo().frame(0);
	Actions a=new Actions(driver);
	a.contextClick(singin).perform();
	
	driver.switchTo().defaultContent();
}

}
