package popus;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class fileuplodefile {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new FirefoxDriver ();
	driver.manage().window().maximize();
	driver.get("https://www.foundit.in/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.xpath("//div[@class=\"heroSection-buttonContainer_secondaryBtn__text\"]")).click();
	WebElement sumbit=driver.findElement(By.xpath("//input[@type=\"file\"]"));
sumbit.sendKeys("C:\\Users\\Asus\\Downloads\\pavan kalyan (1).docx");
System.out.println(driver.getCurrentUrl());
	Thread.sleep(3000);
	driver.close();Thread.sleep(3000);
	
	}

}