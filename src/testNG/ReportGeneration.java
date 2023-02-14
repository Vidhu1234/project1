package testNG;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;



public class ReportGeneration {
	WebDriver driver;
	String baseur1="https://www.facebook.com";
	ExtentHtmlReporter reporter;
	ExtentReports extent;
	ExtentTest test;
	
	@BeforeTest
	public void setup()
	{
		reporter=new ExtentHtmlReporter("./report/myrreport1.html");
		reporter.config().setDocumentTitle("Automationreport");
		reporter.config().setReportName("Functionreport");
		reporter.config().setTheme( Theme.DARK);
		extent=new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("hostname", "localhost");
		extent.setSystemInfo("OS", "Windows 10");
		extent.setSystemInfo("Testname", "abc");
		extent.setSystemInfo("Browser", "Chrome");
		driver=new ChromeDriver();
	}
    @BeforeMethod
    public void urlloading()
    {
    	driver.get(baseur1);
    }
    @Test
    public void fbtitleverification()
    {
    	test=extent.createTest("FB Title Verification");
    	String Expt="facebook";
    	String Act=driver.getTitle();
    	Assert.assertEquals(Expt, Act);
    }
    @Test
    public void fbbutton()
    {
    	test=extent.createTest("FB Login button");
    	Boolean button=driver.findElement(By.name("//*[@id=\"u_0_5_3h\"]")).isDisplayed();
    	Assert.assertTrue(button);
    }
    @AfterTest
    public void teardown()
    {
    	extent.flush();
    }
    @AfterMethod
    public void browserclose(ITestResult result) throws IOException
    {
    	if(result.getStatus()==ITestResult.FAILURE)
    	{
    		test.log(Status.FAIL,"test case faild is"+result.getName());
    	}
    	test.log(Status.SKIP,"test case passed is "+result.getName());
    }
}
