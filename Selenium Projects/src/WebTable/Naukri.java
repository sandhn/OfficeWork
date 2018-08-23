package WebTable;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Naukri {

	public static void main(String[] args) throws InterruptedException 
    
	{
        System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://my.naukri.com/account/register/basicdetails");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[.='A']")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("email")).sendKeys("Testabc@gmail.com");
        driver.findElement(By.name("password")).sendKeys("abcTest123");
        driver.findElement(By.xpath("//input[@name='number']")).sendKeys("0123456789");
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//input[@name='city'])[1]")).click();
        List<WebElement> ddlist = driver.findElements(By.xpath("(//div[@class='dd_dwn ng-hide'])[1]"));
        Thread.sleep(3000);
        for(WebElement d:ddlist)
        {
        	System.out.println(d);
        	Thread.sleep(3000);
        }
        
        
	}
}
