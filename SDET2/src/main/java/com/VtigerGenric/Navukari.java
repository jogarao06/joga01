package com.VtigerGenric;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navukari {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		// open URL
		driver.get("https://www.naukri.com/");
		// maximum window
		driver.manage().window().maximize();
		// Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		Set<String> allId = driver.getWindowHandles();

		for (String id : allId) {

			String value = driver.switchTo().window(id).getTitle();
			System.out.println(value);

			if (value.equalsIgnoreCase("Tech Mahindra")) {
				driver.switchTo().window(id);
				driver.manage().window().maximize();

			}

		}
	}
	
}
