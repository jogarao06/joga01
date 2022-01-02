package jdbc_Demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Iccteam_lastCountry {
   
	@Test
	public void lastcountry() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.icc-cricket.com/rankings/mens/team-rankings/test");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		Thread.sleep(2000);

		// table lastName using xpath 
		String ele = driver.findElement(By.xpath("(//span[@class='u-hide-phablet'])[last()]")).getText();

		System.out.println(ele);

	}

}
