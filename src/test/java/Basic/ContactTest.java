package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContactTest {
	
	
	public void createcontactTest()
	{
		WebDriver d = new ChromeDriver();
		d.get("https://www.pantaloons.com/");
	}

}
