package jdbc_Demo;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

@Listeners(ListnersImplementation1.class)

public class ExtensrRepo {

	WebDriver driver;
	static WebDriver sdriver;

	@Test
	public void getTitle1() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		sdriver = driver;
		driver.get("https://facebook.com");
		Assert.assertEquals(true, false);
	}

	@Test
	public void bbsimple1() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		sdriver = driver;

		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		Assert.assertEquals(true, true);
		Thread.sleep(1000);
		driver.close();

	}

	@Test(enabled = false)
	public void ccsimple2() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		sdriver = driver;
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		Assert.assertEquals(false, true);
		Thread.sleep(1000);
		driver.close();

	}

	@Test(enabled = false)
	public void ddsimple3() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		sdriver = driver;
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		throw new SkipException("im skipping");

	}

	public static String Screenshort(String name) throws IOException {
		File scrfile = ((TakesScreenshot) sdriver).getScreenshotAs(OutputType.FILE);
		String destfile = System.getProperty("user.dir") + "Screenshots1/" + name + ".png";

		File Finaldest = new File(destfile);
		FileUtils.copyFile(scrfile, Finaldest);
		return destfile;

	}

}
