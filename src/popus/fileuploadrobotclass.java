package popus;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class fileuploadrobotclass {
public static void main(String[] args) throws AWTException, InterruptedException {
	WebDriver driver =new FirefoxDriver ();
	driver.manage().window().maximize();
	driver.get("https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand&gad=1&gclid=Cj0KCQjw6cKiBhD5ARIsAKXUdyYql5iNe8vu4prmyNL6xQp8MM2SEltXRFCH-wrnSaeSZhg6nJ9rPRcaAhpYEALw_wcB&gclsrc=aw.ds");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

driver.findElement(By.xpath("//button[text()='Upload Resume']")).click();
StringSelection str=new StringSelection("C:\\Users\\Asus\\Downloads\\Screenshot 2024-07-31 101141");
Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str,null);
Robot r =new Robot();

r.keyPress(KeyEvent.VK_CONTROL);
r.keyPress(KeyEvent.VK_V);

r.keyRelease(KeyEvent.VK_CONTROL);
r.keyRelease(KeyEvent.VK_V);

r.keyPress(KeyEvent.VK_ENTER);
r.keyRelease(KeyEvent.VK_ENTER);
Thread.sleep(5000);
driver.close();




}
}
