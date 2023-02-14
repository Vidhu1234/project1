package testNG;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AutoIT {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		
		driver=new ChromeDriver();
		driver.get("https://www.ilovepdf.com/word_to_pdf");
	}
	@Test
	public void test() throws IOException
	{
		String title=driver.getTitle();
		System.out.println(title);
		driver.findElement(By.xpath("//*[@id=\"pickfiles\"]/span")).click();
		Runtime.getRuntime().exec("C:\\Users\\DELL\\Documents\\S2.exe");
	}

	}


