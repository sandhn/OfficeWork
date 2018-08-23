package WebTable;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.chrome.ChromeDriver;



public class Scroll 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumhq.org/download/");
		driver.manage().window().maximize();
		WebElement xpath = driver.findElement(By.xpath("//a[.='SQLite']"));
		Point p = xpath.getLocation();
		int X=p.getX();
		int Y=p.getY();
		
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy("+X+","+Y+")");
	
	}
	
}
