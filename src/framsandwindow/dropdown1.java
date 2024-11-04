package framsandwindow;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown1 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver =new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://demoapp.skillrary.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
WebElement dropdown=	driver.findElement(By.name("cars"));
Select s =new Select(dropdown);

s.selectByIndex(0);
s.selectByIndex(5);
s.selectByIndex(2);
Thread.sleep(20000);

System.out.println("fristoption"+s.getFirstSelectedOption());
System.out.println("/inall selectedoptions:");
List <WebElement>selectedlist=s.getAllSelectedOptions();
for(WebElement opt1:selectedlist) {
	System.out.println(opt1.getText());
	
}{
	

s.deselectAll();
}
driver.close();



}
}
