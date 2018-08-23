package WebTable;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearTrip {

	
		public static void main(String[] args) throws InterruptedException 
	       
		{
	        System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        driver.manage().window().maximize();
	        driver.get("https://www.cleartrip.com/flights");
	        Thread.sleep(3000);
	        
	       
	        Date date=new Date();
	        SimpleDateFormat s1=new SimpleDateFormat("d");
	        SimpleDateFormat s2= new SimpleDateFormat("MMMM");
	        String day=s1.format(date);
	        String month=s2.format(date);
	        
	        driver.findElement(By.xpath("(//i[.='Cal'])[1]")).click();
	        driver.findElement(By.xpath("//span[.='"+month+"']/../../..//a[.="+day+"]")).click();
	}

}