package test.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class GoogleTest {
	 WebDriver driver;
	 @BeforeMethod
	 public void setUp() {
	 System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32/chromedriver.exe");  
	 driver=new ChromeDriver();  
	 driver.get("http://www.google.com");
	 driver.manage().window().maximize();
	 //Thread.sleep(4000);
	 }
	 @Test
	 public void googleTitleTest() {
		 String title=driver.getTitle();
		 System.out.println(title);
	 }
	 //@Test
	 //public void googlelogoTest() {
	 //boolean b = driver.findElement(By.xpath("//*[@id='logo')")).isDisplayed();
	 //}
	//@AfterMethod
	//public void tearDown() {
		//driver.quit();
	//}
}
	 

