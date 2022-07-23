import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class copypaste {
	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");  
		 WebDriver driver=new ChromeDriver();  
		 driver.get("https://www.facebook.com/");
		 driver.manage().window().maximize();
		 Thread.sleep(1000);
		 Actions action= new Actions(driver);
         WebElement name = driver.findElement(By.xpath("//*[@class='inputtext _55r1 _6luy']"));
		//*[@class="inputtext _55r1 _6luy"]
         ////input[@name='email']
         //action.click(name).sendKeys("samish707@gmail.com").perform();
         
         //action.click(name).sendKeys("KartikNikam").keyDown(Keys.CONTROL).sendKeys("a").sendKeys("c").sendKeys("v").sendKeys("v").keyUp(Keys.CONTROL).build().perform();
         WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
	action.click(name).sendKeys("sam").keyDown(Keys.CONTROL).sendKeys("a").sendKeys("c").keyUp(Keys.CONTROL).build().perform();
	Thread.sleep(5000);
	action.click(pass).keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
	Thread.sleep(7000);
	driver.close();
	
	}
}
