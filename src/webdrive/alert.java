package webdrive;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert {
ChromeDriver driver;
@Before
public void setup()
{
	driver=new ChromeDriver();
	driver.get("file:///C:/Users/DELL/Documents/alert.html");
}
@Test
public void test()
{
	driver.findElement(By.xpath("/html/body/input[1]")).click();
	Alert a=driver.switchTo().alert();
	String alerttext2=a.getText();
	a.accept();
	driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("abc");
	driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("d");
}
}
