package jdbc_Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SampleTestonRuntimeBrowser {
	WebDriver driver;
	@Test(enabled = false)
	
	public void cmdLineParamiter() {
		//WebDriver driver;
		String browser=System.getProperty("browser");
		String url=System.getProperty("url");
		System.out.println(browser);
		System.out.println(url);
		
		if (browser.equalsIgnoreCase("browser")) 
		{
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("browser"))
		{
			driver = new FirefoxDriver();
		} else {
			driver = new ChromeDriver();
		}
		driver.get("url");
	}
	

}
