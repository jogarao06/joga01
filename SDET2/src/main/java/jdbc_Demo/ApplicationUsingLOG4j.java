package jdbc_Demo;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ApplicationUsingLOG4j {

	Logger log = Logger.getLogger(ApplicationUsingLOG4j.class);
	public WebDriver driver;

	@BeforeSuite
	public void database() {
		log.info("connect dataBase");

	}

	@BeforeClass
	public void openbrowser1() {
		log.info("Open Browser");

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}

	@BeforeMethod
	public void enterurl() {
		log.info("Enter URL");

		driver.get("http://localhost:8888/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Test
	public void openbrowserLogin() {
		log.info("login Application VTiger");

		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();

	}

	@AfterMethod
	public void close11() {

		log.info("close Browser");
		driver.close();

	}

	@AfterSuite
	public void disconnectDB() {
		log.info("disconnect Data Base");
		System.out.println("done");

	}

}
