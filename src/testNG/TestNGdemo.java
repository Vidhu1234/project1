package testNG;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGdemo {
ChromeDriver driver;
@BeforeTest
public void setup()
{
	driver=new ChromeDriver();
}
@BeforeTest
public void testurlloading()
{
driver.get("https://www.google.com");
}
@Test (priority=1,invocationCount= 3,dependsOnMethods =("Test2"))
public void test1()
{
System.out.print("this is test");	
}
@Test (priority = 3,enabled = false)
public void test2()
{
	
}
@AfterMethod
public void aftermethod()
{
	
}
@AfterTest
public void end()
{
}
}