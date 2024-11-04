package popus;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class alert1 {
public static void main(String[]Agrs) {
	WebDriver driver =new FirefoxDriver ();
	driver.manage().window().maximize();
	driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
driver.findElement(By.xpath("//button[text()=\"Click for JS Alert\"]")).click();

Alert a=driver.switchTo().alert();
try {
	Thread.sleep(200);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}System.out.print(a.getText());

a.accept();
driver.close()
;

}
}


