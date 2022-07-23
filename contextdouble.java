import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class contextdouble {
	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");  
		 WebDriver driver=new ChromeDriver();  
		 driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		 driver.manage().window().maximize();
		 Thread.sleep(1000);
		 
		// WebElement prompt= driver.findElement(By.xpath("//*[@name='prompt']"));
		// Actions action = new Actions(driver);
		 //action.click(prompt).perform();
		 //driver.switchTo().alert().accept();
		 //String text1= driver.switchTo().alert().getText();
		 //Thread.sleep(2000);
		 //System.out.println(text1);
		//*[@value='Double Click Me']
		 WebElement doubles = driver.findElement(By.xpath("//*[@value='Double Click Me']"));
		 Actions action = new Actions(driver);
		 action.doubleClick(doubles).perform();
		 Thread.sleep(5000);
		 driver.switchTo().alert().accept();
	
	}
}
//*[@name='prompt']