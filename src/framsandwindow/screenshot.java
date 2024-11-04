package framsandwindow;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class screenshot {
	public static void main(String[] args) throws IOException {
		WebDriver driver=new FirefoxDriver ();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		
		
		
		Screenshot shot=new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
		File f1=new File("./webpagess/image.png");
		ImageIO.write(shot.getImage(), "png", f1);
		driver.close();
;	
	
	
	
	
	
	
	
	
	
	
	
	}
}
