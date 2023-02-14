package webdrive;
import org.openqa.selenium.chrome.ChromeDriver;
public class google {

	public static void main(String[] args) {
		ChromeDriver drive=new ChromeDriver();
		drive.get("https://www.instagram.com"); //to open application

		String tital=drive.getTitle(); //to check title
		String exp="instagram";
		if(tital.equalsIgnoreCase(exp))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}

}

