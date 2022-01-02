package com.Vtiger_PomClass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class IccTeam {

	
	@Test
	
	public void Iccteam() {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.icc-cricket.com/rankings/mens/team-rankings/test");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String teamName = "Australia";
		List<WebElement> table = driver.findElements(By.xpath("//tr[*]/td[2]/span[@class='u-hide-phablet']"));

		for (int i = 1; i < table.size(); i++) {

			if (table.get(i).getText().equalsIgnoreCase(teamName)) 
			{
              System.out.println(driver.findElement(By.xpath("//span[text()='"+teamName+"']/../../td[3]")).getText());
			}

		}

	}
}
