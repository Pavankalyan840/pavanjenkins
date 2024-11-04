package framsandwindow;



import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class takescreenshot {
	public static void main(String[] args) throws IOException {
		WebDriver driver=new FirefoxDriver ();
		driver.manage().window().maximize();
		driver.get("https://www.swiggy.com/");
		TakesScreenshot ts =(TakesScreenshot)driver;
		File f1=ts.getScreenshotAs(OutputType.FILE);
		File f2=new File("./window/swiggy.png");
		FileUtils.copyFile(f1, f2);driver.close();
	}
}
