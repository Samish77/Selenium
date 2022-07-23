import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class drag_drop {
	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");  
		 WebDriver driver=new ChromeDriver();  
		 driver.get("https://jqueryui.com/");
		 driver.manage().window().maximize();
		 Thread.sleep(1000);
		 
		 Actions act = new Actions(driver);
          //WebElement dragclick = driver.findElement(By.xpath("//*[text()='Draggable']"));
          //dragclick.click();
          WebElement dropclik = driver.findElement(By.xpath("//*[text()='Droppable']"));
  	    
  		act.click(dropclik).perform();
  		Thread.sleep(5000);
         // WebElement iframedrag= driver.findElement(By.xpath("//*[@class='demo-frame']"));
          //driver.switchTo().frame(iframedrag);		  
  		//act.click(dragclick).perform();
          //WebElement drag = driver.findElement(By.xpath("//*[@class='ui-widget-content ui-draggable ui-draggable-handle']"));
         // act.dragAndDropBy(drag,100,150).perform();
          
          
        //Drag and drop perform
  		
  		
 		 WebElement iframe2 = driver.findElement(By.xpath("//*[@class='demo-frame']"));
 		 
 		 driver.switchTo().frame(iframe2);
 		 
 		 WebElement drag = driver.findElement(By.xpath("//*[@class='ui-widget-content ui-draggable ui-draggable-handle']"));
 		 WebElement drop = driver.findElement(By.xpath("//*[@class='ui-widget-header ui-droppable']"));
 		 
 		 act.dragAndDrop(drag,drop).perform();

          
        //*[@id='draggable']
  	//*[@class='demo-frame']
        //*[@class='ui-widget-content ui-draggable ui-draggable-handle']

}
} 