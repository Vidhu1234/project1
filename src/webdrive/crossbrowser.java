package webdrive;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class crossbrowser {
WebDriver driver;
@Parameters("browser")
@BeforeMethod
public void setup(String b)
{
	if(b.equalsIgnoreCase("chrome"))
	{
		driver=new ChromeDriver();
	}
	else
	{
		driver=new FirefoxDriver();
	}
    }
@Test
public void test1(String s)
{
	driver.get("https://www.google.com");
	driver.findElement(By.name("s")).sendKeys("car",Keys.ENTER);
}
}
