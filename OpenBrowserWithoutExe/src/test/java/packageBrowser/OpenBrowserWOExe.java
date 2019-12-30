package packageBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenBrowserWOExe {
	
	@Test
	public void openBrowser() 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		System.out.println("Browser open");
		driver.get("http://google.co.in");
		System.out.println("Title: "+driver.getTitle());
		driver.close();
		System.out.println("Browser close");
	}

}
