import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class hoveron {
	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");  
		 WebDriver driver=new ChromeDriver();  
		 driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		 driver.manage().window().maximize();
		 Thread.sleep(1000);
		 
		 WebElement hover= driver.findElement(By.xpath("//*[@id='sub-menu']"));
		//*[@id='sub-menu']
		 Actions action = new Actions(driver);
		   action.moveToElement(hover).perform();
		   Thread.sleep(2000);
		 //*[@id='link1']
		   WebElement hover1= driver.findElement(By.xpath("//*[@id='link1']"));
		   action.click(hover1).perform();
}
}
