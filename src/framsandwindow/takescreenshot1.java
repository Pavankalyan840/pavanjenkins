package framsandwindow;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class takescreenshot1 {
public static void main(String[] args) throws IOException {
	WebDriver driver =new FirefoxDriver();
	
	
driver.manage().window().maximize();
driver.get("https://www.youtube.com/");


TakesScreenshot ts=(TakesScreenshot)driver;
File f2=ts.getScreenshotAs(OutputType.FILE);
 File f1=new File("./webpages/youtube.png");
 FileUtils.copyFile(f2, f1);
	
 driver.close();
	
	
	
	
	
	
	
	
	
	
	

}
}
