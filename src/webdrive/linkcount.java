package webdrive;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkcount {
ChromeDriver driver;

@Before
public void setup()
{
	driver=new ChromeDriver();
	driver.get("https://www.pinterest.com");
}
@Test
public void  linkcount()
{
	List<WebElement> li=driver.findElements(By.tagName("a"));
	System.out.println("TOTAL LINK COUNT : "+li.size());
	
	
	for(WebElement element:li)
	{
		String sti=element.getAttribute("href");
		System.out.println(sti);
		String st1=element.getText();
	}
}
}
