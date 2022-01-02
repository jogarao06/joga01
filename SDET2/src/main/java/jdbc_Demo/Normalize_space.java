package jdbc_Demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Normalize_space {
	
	@Test
	
	public void lastcountry() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.icc-cricket.com/rankings/mens/team-rankings/test");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		

		Thread.sleep(2000);
		
		// how to handle space before element
		driver.findElement(By.xpath("//div[normalize-space()='Rankings']")).click();
		
	}
}
