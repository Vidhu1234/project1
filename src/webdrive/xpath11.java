package webdrive;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath11 {
		ChromeDriver driver;
		@Before
		public void setup()
		{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		}
        @Test
        public void test()
        {

        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Mobiles",Keys.ENTER);
        driver.findElement(By.xpath("//div[@id='nav-xshop'/a[4]]")).click();
        driver.findElement(By.xpath("//*[@id=\"nav-cart-count-container\"]/span[2]")).click();
        driver.findElement(By.xpath("//div[@class='nav-cart-count-container' ]/span[@id='nav-cart-count-container']")).click();
        driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("def@gmail.com",Keys.ENTER);
        driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
        driver.navigate().back();
        driver.navigate().back();
        driver.findElement(By.xpath("//*[@id=\"nav-hamburger-menu\"]/i")).click();
        }
}
