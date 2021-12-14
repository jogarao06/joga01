package com.Vtiger_PomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.VtigerGenric.WebDriverUtil;

public class HomePage {

	WebDriver driver;
	WebDriverUtil abcd = new WebDriverUtil(driver);

	@FindBy(xpath = ("//img[@src='themes/softed/images/user.PNG']")) // r 1
	private WebElement movetosngouimg;// r2

	@FindBy(xpath = ("//a[text()='Sign Out']")) // r1
	private WebElement singout; // 2

	public WebElement getMovetosngouimg() {
		return movetosngouimg;
	}

	public WebElement getSingout() {
		return singout;
	}

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void singout() {
		WebDriverUtil wutil = new WebDriverUtil(driver);
		wutil.movetoelement(movetosngouimg);
		singout.click();

	}
	

}
