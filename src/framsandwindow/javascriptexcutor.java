package framsandwindow;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class javascriptexcutor {
public static void main(String[] args) throws InterruptedException, IOException {
	WebDriver driver =new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.youtube.com/");
	
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	WebElement sports=driver.findElement(By.xpath("//span[text()='Breaking news']"));
	Point po=sports.getLocation();
	int x=po.getX();
	int y=po.getY();
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy["+x+","+y+"]");
	File f2=sports.getScreenshotAs(OutputType.FILE);
	File f1=new File ("./windowpss/sports.png");
	FileUtils.copyFile(f2, f1);
	Screenshot shot=new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
ImageIO.write(shot.getImage(), "PNG", f2);
	
	
	driver.close();
}
}
