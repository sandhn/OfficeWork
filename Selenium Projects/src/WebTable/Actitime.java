package WebTable;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime
{

	       public static void main(String[] args) throws InterruptedException 
	       {
	              System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        driver.manage().window().maximize();
	              driver.get("https://demo.actitime.com/login.do");
	              Thread.sleep(3000);
	             driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
	             driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
	            driver.findElement(By.id("loginButton")).click();
	            driver.findElement(By.xpath("//div[.='TASKS']")).click();
	            Thread.sleep(3000);
	            driver.findElement(By.xpath("//div[@title='Accounting']/../../..//div[@class='img']")).click();
	            Thread.sleep(3000);
	            driver.findElement(By.xpath("//span[.='Delete']")).click();
	            Thread.sleep(3000);
	            driver.findElement(By.xpath("//div[@id='deleteTaskPopup_deleteConfirm_cancelBtn']")).click();

	       }

	}


