package webdrive;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class testpass {
	WebDriver driver;
	
	@Before
	public void setup()
	{
	driver=new EdgeDriver();
	driver.get("https://www.google.com");
	}
	@Test
	public void test()
	{
	driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("kochi",Keys.ENTER);
	}
		
	}


