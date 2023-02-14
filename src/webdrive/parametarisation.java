package webdrive;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parametarisation {
ChromeDriver driver;
@BeforeMethod
	public void setup()
	{

driver=new ChromeDriver();		
	}
	@Parameters
@Test
public void test(String s)
{
driver.get("https//www.google.com");
driver.findElement(By.name("q")).sendKeys(s,Keys.ENTER);

}
}
