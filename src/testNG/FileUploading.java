package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FileUploading {
WebDriver driver;
@BeforeTest
public void setup()
{
	
	driver=new ChromeDriver();
	driver.get("https://www.ilovepdf.com/word_to_pdf");
}
@Test
public void test()
{
	driver.findElement(By.xpath("//*[@id=\"uploadfile_0\"]"));
	driver.findElement(By.xpath(""));
}

}
