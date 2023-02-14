package testNG;

import java.util.Set;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GetWinHandlesGetWinHandler {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
	driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/popup.php");
	}
	@Test
	public void test()
	{
		String parent=driver.getWindowHandle();
		driver.findElement(By.xpath("/html/body/p/a")).click();
		Set<String> alwindow=driver.getWindowHandles();
		for(String handle:alwindow)
		{
			if(!handle.equalsIgnoreCase(parent))
			{
				driver.switchTo().window(handle);
				
			}
		}
	}
}
