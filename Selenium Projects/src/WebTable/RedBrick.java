package WebTable;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RedBrick 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
		driver.get("https://home.redbrickhealth.com/");
		
		//To count the number of options in dropdown
		Actions a=new Actions(driver);
		WebElement xpathSolu = driver.findElement(By.xpath("(//a[.='Solutions'])[1]"));
		a.moveToElement(xpathSolu).perform();
		List<WebElement> list = driver.findElements(By.xpath("//ul[@class=' dropdown-menu']"));
		int count = list.size();
		System.out.println("Number of options under Solutions are :"+count);
		
		//To print the options
		Thread.sleep(3000);
		for(WebElement l:list)
		{
			System.out.println(l.getText());
		}
		
		//to click on specific option
		WebElement xpath = driver.findElement(By.xpath("//li[@id='menu-item-8428']"));
		a.moveToElement(xpath).click().perform();
		
		driver.close();
	}
	
}
