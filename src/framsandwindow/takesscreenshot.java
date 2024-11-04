package framsandwindow;



import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class takesscreenshot {
	public static void main(String[] args) throws IOException {
		WebDriver driver=new FirefoxDriver ();
		driver.manage().window().maximize();
		driver.get("https://www.swiggy.com/");
		TakesScreenshot ts =(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./window/swiggy.png");
		FileUtils.copyFile(src, dest);
		driver.close()
;	}
}

