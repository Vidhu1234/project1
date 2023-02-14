package webdrive;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ActionClass {
WebDriver driver;
@BeforeTest
public void setup()
{
	driver=new ChromeDriver();
}
	@Test
	public void test()
	{

	driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	WebElement firstname=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input"));
	firstname.sendKeys("adithya");
	WebElement rediffid=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[1]"));
	Actions act=new Actions(driver);
	act.keyDown(firstname,Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL);
	act.keyDown(firstname,Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL);
	act.keyDown(rediffid,Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL);
	act.perform();
}
}
