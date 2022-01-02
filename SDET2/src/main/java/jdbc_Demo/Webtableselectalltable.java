package jdbc_Demo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Webtableselectalltable {
	@Test
	public void webtablesalltableselect() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8888/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@href='index.php?module=Accounts&action=index']")).click();
		
		List<WebElement> ckbox=driver.findElements(By.xpath("//table[@class='lvt small']//tr[*]/td[1]/input"));
		
		
		for(int i=3;i<ckbox.size()+2;i++) {
			
			
			
			driver.findElement(By.xpath("//table[@class='lvt small']/tbody/tr["+i+"]/td[1]/input")).click();
			break;

		}
		
	}
}
