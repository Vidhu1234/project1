package webdrive;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class redif {
	ChromeDriver driver;
	
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https//mail.rediff.com");
	}
	    @Test
	    public void test()
	    {
	    	
	    }

}
