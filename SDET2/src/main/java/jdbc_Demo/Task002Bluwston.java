package jdbc_Demo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Task002Bluwston {
	
	@Test

	public void deliverydesings() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bluestone.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.name("search_query")).sendKeys("Rings", Keys.ENTER);
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		WebElement ele = driver.findElement(By.xpath("//span[text()='Delivery Time']"));
		act.moveToElement(ele).build().perform();

		driver.findElement(By.xpath("//span[text()='(266)']")).click();

//		WebElement ele1 = driver.findElement(By.xpath("//span[text()='266 Designs']"));
//		String string = ele1.getText();
//		System.out.println("Next Day Delivery " + string);
		
		
		List<WebElement> ele11= driver.findElements(By.className("new-price"));
		System.out.println(ele11.size());
		int totalsize = ele11.size();
		
		int count=0;
		for(int i=0;i<ele11.size();i++)
		{
			
		String str=ele11.get(i).getText();
		System.out.println(str);
		String s1=str.substring(3);
		
		String[] s2=s1.split(",");
		String text =s2[0]+s2[1];
		
		int price=Integer.parseInt(text);
		
		if(price<10000)
		{
			count++;
		}
		
	   }


	//	Assert.assertEquals(string, "266 DESIGNS");

		driver.close();
	
	}

}
