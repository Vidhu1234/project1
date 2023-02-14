package webdrive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DragAndDrop {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	@Test
	public void dragemedrop()
	{
		driver.get("https://demoqa.com/droppable/");
		driver.manage().window().maximize();
		Actions act1=new Actions(driver);
		WebElement drag=driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		WebElement drophere=driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		act1.dragAndDrop(drag, drophere);
		act1.perform();
		String text=drophere.getText();
		if(text.equalsIgnoreCase("Dropped!"))
		{
			System.out.println("TEXT IS PRESENT");
		}
		else
		{
			System.out.println("TEXT IS NOT PRESENT");
		}
	}

}
