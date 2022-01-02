package jdbc_Demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SvgTage {
	
	@Test
	
	public void noon() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.learnatnoon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(2000);
		// Scalable Vector Graphics.SVG
		driver.findElement(By.xpath("(//*[local-name()='svg' and @class='icon icon-noon ' ])[last()]")).click();
	}

}
