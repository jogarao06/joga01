package jdbc_Demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Vtiger_attribute {
	@Test
	
	public void titleattribut() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8888/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@href='index.php?module=Accounts&action=index']")).click();
		// printing of web object title  
		String title = driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).getAttribute("title");
		System.out.println(title);
		
	}

}
