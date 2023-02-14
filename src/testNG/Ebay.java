package testNG;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ebay{
ChromeDriver driver;
@Before
public void setup()
{
driver=new ChromeDriver();
driver.get("https://www.ebay.com");
}
@Test
public void test()
{
	WebElement ele = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/a"));
	Actions act = new Actions(driver);
	act.moveToElement(ele);
	driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/div[2]/div[1]/nav[2]/ul/li[2]/a"));
	act.perform();
}
}