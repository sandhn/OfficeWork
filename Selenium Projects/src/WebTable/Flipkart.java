package WebTable;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart 
{

       public static void main(String[] args) throws InterruptedException, AWTException {
              System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
              WebDriver driver = new ChromeDriver();
              driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
              driver.manage().window().maximize();
             /* driver.get("https://www.google.com/");
              driver.findElement(By.id("lst-ib")).sendKeys("Flipkart");
              Robot r= new Robot();
              r.keyPress(KeyEvent.VK_ENTER);
              r.keyRelease(KeyEvent.VK_ENTER);
              Thread.sleep(2000);
              driver.findElement(By.xpath("(//a[.='Flipkart'])[1]")).click();*/
              
              driver.get("https://www.flipkart.com/");
              driver.findElement(By.xpath("//button[.='✕']")).click();
              Thread.sleep(2000);
              driver.findElement(By.xpath("//input[@name='q']")).sendKeys("iPhone");
              Thread.sleep(2000);
              List<WebElement> allsug = driver.findElements(By.xpath("//ul[@class='col-11-12 _1PBbw8']"));
              System.out.println(allsug.size());
              Thread.sleep(2000);
              for(WebElement a:allsug)
              {
            	  System.out.println(a.getText());
              }
              driver.close();
              
       }
}
