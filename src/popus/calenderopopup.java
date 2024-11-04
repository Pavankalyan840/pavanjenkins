package popus;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class calenderopopup {
public static void main(String[] args) {
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.yatra.com/");
driver.findElement(By.id("BE_flight_origin_date")).click();
WebElement date=driver.findElement(By.id("03/06/2023"));
date.click();
System.out.println(date.getText());
driver.close();







}
}
