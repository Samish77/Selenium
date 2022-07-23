import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshot {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");   // set chrome driver
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		 Thread.sleep(2000);
		 TakesScreenshot scrShot = ((TakesScreenshot)driver);
		 //TakesScreenshot scrShot =((TakesScreenshot)webdriver);
		 File src=scrShot.getScreenshotAs(OutputType.FILE);
		 File destination=new File ("C:\\Users\\BusinessComputers.in\\Desktop\\snap.png");
		 org.openqa.selenium.io.FileHandler.copy(src, destination);
		 

}
}
