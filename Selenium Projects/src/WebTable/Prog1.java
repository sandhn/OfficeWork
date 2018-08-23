package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog1 {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		List<WebElement> alldata = driver.findElements(By.xpath("//table[@id='customers']//td"));
		int count = alldata.size();
		System.out.println("Total Data in webtable : "+count);
		String str= "Island Trading";
		for(int i=0;i<count;i++)
		{
			String s=alldata.get(i).getText();
			System.out.println(i);
			if(s.equals(str))
			{
				
				String SC=alldata.get(i+1).getText();
				String TC=alldata.get(i+2).getText();
				
				System.out.println("Contact : "+SC+"  Country : "+TC);
			}
		}
	}

}
