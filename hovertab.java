import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class hovertab {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");   // set chrome driver
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		 Thread.sleep(3000);
		 Actions act = new Actions(driver);
		 //Login manu
		 WebElement username = driver.findElement(By.xpath("//*[@name='txtUsername']"));
		 WebElement password = driver.findElement(By.xpath("//*[@name='txtPassword']"));
		 WebElement submit = driver.findElement(By.xpath("//input[@name='Submit']"));
		 act.click(username).sendKeys("Admin").perform(); 
		 act.sendKeys(Keys.TAB).perform();
     	 
		 act.sendKeys("admin123").perform();
		 act.sendKeys(Keys.TAB).perform();
		 
		 act.click(submit).perform();
		 WebElement admin = driver.findElement(By.xpath("//*[@id='menu_admin_viewAdminModule']"));
		 WebElement usermanage = driver.findElement(By.xpath("//a[@id='menu_admin_UserManagement']"));
		 WebElement users = driver.findElement(By.xpath("//a[@id='menu_admin_viewSystemUsers']"));
		 
		 Thread.sleep(3000);
		 act.moveToElement(admin).perform();
		 Thread.sleep(3000);
		 act.moveToElement(usermanage).perform();
		 Thread.sleep(3000);
		 act.click(users).perform();



}
}
