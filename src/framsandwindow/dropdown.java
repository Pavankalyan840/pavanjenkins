package framsandwindow;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver =new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
WebElement dropdwon=	driver.findElement(By.id("searchDropdownBox"));
	
	Select s=new Select(dropdwon);
	
	
	if(s.isMultiple())
		System.out.println("mulit select dropdwon");
	else 
		System.out.println("not mulit selct dropdown");
	s.selectByIndex(7);
	Thread.sleep(1000);
	s.selectByValue("search-alias=digital-music");
	Thread.sleep(1000);
	s.selectByVisibleText("Men's Fashion");
	driver.close();
	

	}

}
