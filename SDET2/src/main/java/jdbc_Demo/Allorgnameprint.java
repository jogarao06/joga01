package jdbc_Demo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Allorgnameprint {
	
	@Test

	public void allorgprint() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8888/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");

		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admin");

		driver.findElement(By.id("submitButton")).click();

		driver.findElement(By.xpath("//a[text()='Organizations']")).click();

		List<WebElement> orgnames = driver.findElements(By.xpath("//table[@class='lvt small']//tr[*]/td[3]"));

		for (int i = 1; i < orgnames.size(); i++) 
		{
		
			
			System.out.println((orgnames.get(i).getText()));
//			{
//				
//				driver.findElement(By.xpath("//a[text()='Malik587']/parent::td/parent::tr/td/input")).click();
//				Thread.sleep(3000);
//				driver.findElement(By.xpath("//input[@class='crmbutton small delete']")).click();
//				Thread.sleep(3000);
//				driver.switchTo().alert().accept();
//				
//				
//				
//				break;
//				
//				
//			}
			
		}
		

	}

}
