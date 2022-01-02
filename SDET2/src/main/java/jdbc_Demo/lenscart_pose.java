package jdbc_Demo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class lenscart_pose {
	
	@Test

	private void Lens() throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.lenskart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@placeholder='What are you looking for ']")).click();
        // how to pose webpage 
		List<WebElement> webemt = driver.findElements(By.xpath("//ul[@class='trending_list menu-link']/li"));
        System.out.println(webemt.size());
		for (int j = 0; j < webemt.size()-1; j++) {
			System.out.println(webemt.get(j).getText());

		}

	}
}
