package webdrive;

import org.openqa.selenium.chrome.ChromeDriver;

public class programsrs {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		String src=driver.getPageSource();
		if(src.contains("Gmail"))
		{
			
		}

	}

}
