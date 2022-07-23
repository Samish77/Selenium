import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrolljs {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");   // set chrome driver
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		 Thread.sleep(2000);
		 WebElement username= driver.findElement(By.xpath("//input[@name='txtUsername']"));
			username.sendKeys("Admin");
			Thread.sleep(2000);
			driver.findElement(By.name("txtPassword")).sendKeys("admin123");
			//Thread.sleep(4000);
			 WebElement loginbutton = driver.findElement(By.xpath("//input[@name='Submit']"));
			 loginbutton.click();
			 driver.findElement(By.id("menu_admin_viewAdminModule")).click();
			 JavascriptExecutor js=(JavascriptExecutor)driver;
			 js.executeScript("window.scrollBy(0,400)");
			 Thread.sleep(2000);
			 js.executeScript("window.scrollBy(0,-400)");
WebElement checkboxSingle= driver.findElement(By.xpath("//*[@id='ohrmList_chkSelectRecord_5']"));
			 js.executeScript("arguments[0].scrollIntoView();",checkboxSingle);
			// je.executeScript("arguments[0].scrollIntoView(true);",element)
			// js.executeScript("arguments[0].click();");
			 Thread.sleep(3000);
			 checkboxSingle.click();
			 //input[@id='ohrmList_chkSelectRecord_5']
}
}