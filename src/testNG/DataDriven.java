package testNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DataDriven {
WebDriver driver;
@BeforeTest
public void setup()
{
	
	driver=new ChromeDriver();
}
@Test
public void test() throws IOException
{
	FileInputStream f=new FileInputStream("C:\\Users\\DELL\\Downloads\\Book1.xlsx");
	 XSSFWorkbook wb = new XSSFWorkbook(f);
		XSSFSheet sh=wb.getSheet("Book1");
		int rowcount=sh.getLastRowNum();
		for(int i=1;i<=rowcount;i++)
		{
			String username=sh.getRow(i).getCell(0).getStringCellValue();
			System.out.println("username="+username);
			String pswd=sh.getRow(i).getCell(1).getStringCellValue();
			System.out.println("pswd="+pswd);
			driver.get("https://www.instagram.com");
			driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[1]/div/label/input")).sendKeys(username);
			driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[2]/div/label/input")).sendKeys(pswd);
			driver.findElement(By.name("//*[@id=\"loginForm\"]/div/div[3]")).click();
		}
	}
}

