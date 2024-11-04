package popus;

import java.awt.AWTException;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class autoitscript {
	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
		WebDriver driver =new FirefoxDriver ();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand&gad=1&gclid=Cj0KCQjw6cKiBhD5ARIsAKXUdyYql5iNe8vu4prmyNL6xQp8MM2SEltXRFCH-wrnSaeSZhg6nJ9rPRcaAhpYEALw_wcB&gclsrc=aw.ds");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	driver.findElement(By.xpath("//button[text()='Upload Resume']")).click();
	Runtime.getRuntime().exec("C:\\Users\\Asus\\OneDrive\\Desktop\\autoit\\autoit.exe");
	
	Thread.sleep(3000);
	driver.close();
}
}
