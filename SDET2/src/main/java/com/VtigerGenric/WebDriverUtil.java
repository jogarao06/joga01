package com.VtigerGenric;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

/**
 * 
 * @author Joga Description: create all the actions
 *
 */
public class WebDriverUtil {
	WebDriver driver;

	public WebDriverUtil(WebDriver driver) {
		this.driver = driver;
	}

	public void maxwindow() {
		driver.manage().window().maximize();
	}

	public void pageLoadTime() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	// DropDown actions
	public void selectValuefromDropdownvalue(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByValue(value);
	}

	public void selectValuefromDropdownindex(WebElement element, int index) {
		Select select = new Select(element);
		select.selectByIndex(index);
	}

	public void movetoDropdownvisibletext(WebElement element, String text) {
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}

	// Mouse Over Actions
	public void movetoelement(WebElement element) {
		Actions act = new Actions(driver);
		act.moveToElement(element).build().perform();
	}

	public void movetoElementRightClick(WebElement element) {
		Actions act = new Actions(driver);
		act.moveToElement(element).contextClick().build().perform();
	}

	public void movetoElementClick(WebElement element) {
		Actions act = new Actions(driver);
		act.moveToElement(element).contextClick().build().perform();
	}

	// AlartPopUps
	public void acceptAlerts() {
		driver.switchTo().alert().accept();
	}

	public void dissmisAlert() {
		driver.switchTo().alert().dismiss();
	}

	public void sendkeydu(WebElement element, String keystosend) {
		element.sendKeys(keystosend);
	}
	
	

	public void scrollbyposition(int x, int y) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy,(" + x + "," + y + ")");

	}

	// window handles
	public void switchtowindows(String title) {
		Set<String> allId = driver.getWindowHandles();
		for (String id : allId) {
			String value = driver.switchTo().window(id).getTitle();
			System.out.println(value);
			if (value.equalsIgnoreCase(title)) {
				break;
			}

		}

	}

}
