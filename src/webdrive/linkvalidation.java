package webdrive;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkvalidation {
	WebDriver driver;
	@Before
public void setup()
{
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	
}
	@Test
public void linkvalidation()
{
List<WebElement> i=driver.findElements(By.tagName("a"));
System.out.println("total links"+i.size());
for(WebElement link:i)
{
	String linkdetails=link.getAttribute("herf");
	verify(linkdetails);
	
}

}
	private void verify(String linkdetails) 
	{
	try
	{
		URL u=new URL(linkdetails);
		HttpURLConnection con=(HttpURLConnection)u.openConnection();
		con.connect();
		if(con.getResponseCode()==200)
		{
			System.out.println("status of link 200...."+linkdetails);
		}
		else
		{
			System.out.println("other ststus code ...."+linkdetails);
		}
		}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
	}

}
}