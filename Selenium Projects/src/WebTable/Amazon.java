package WebTable;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Watch");
        Thread.sleep(2000);
        List<WebElement> allsug = driver.findElements((By.xpath("//div[@id='suggestions-template']/div")));
        int count=allsug.size();
       // System.out.println("Size is:"+count);
        for(WebElement a:allsug)
        {
            System.out.println(a.getText());
            String s=a.getText();
            if(s.contains("kids girls"))
            {
          	  a.click();
            }
           
        }
       
        driver.close();
	}

}