package com.VtigerGenric;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.Vtiger_PomClass.HomePage;
import com.Vtiger_PomClass.Loginpage;

public class BaseClass {

	public WebDriver driver;
	public static NotePadFile11 aa = new NotePadFile11();
	public static excelfileutile bb = new excelfileutile();
	public static WebDriver sdriver;

	@BeforeSuite(alwaysRun = true)
	public void setUp() {
		System.out.println("connect DB");
	}

//	@Parameters("BROWSER")
	@BeforeClass(alwaysRun = true)
	public void lunchBrowser() throws IOException {
//public void lunchBrowser(String Browser) throws IOException {
		String browser = System.getProperty("BROWSER");
		System.out.println(browser);
		if (browser.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else {
			driver = new ChromeDriver();
		}

		// driver = new ChromeDriver();
		WebDriverUtil allActions = new WebDriverUtil(driver);
		driver.get(aa.notePadfetch("url"));
		allActions.maxwindow();
		allActions.pageLoadTime();
		sdriver = driver;
	}

	@BeforeMethod(alwaysRun = true)
	public void loginIntoApp() throws IOException {
		Loginpage logingtoapp = new Loginpage(driver);
		logingtoapp.Logintoapp();

	}

	@AfterMethod(alwaysRun = true)
	public void logoutFromApp() {
		HomePage singout1 = new HomePage(driver);
		singout1.singout();

	}

	@AfterClass(alwaysRun = true)
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(3000);
		driver.close();

	}

	public static void takeScreenShort(String name) throws IOException {
		File Scrfile = ((TakesScreenshot) sdriver).getScreenshotAs(OutputType.FILE);
		String destfile = System.getProperty("user.dir") + "/Screenshots/" + name + ".png";
		File finadest = new File(destfile);
		FileUtils.copyFile(Scrfile, finadest);

	}

}
