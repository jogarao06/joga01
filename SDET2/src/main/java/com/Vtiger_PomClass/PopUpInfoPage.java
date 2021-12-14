package com.Vtiger_PomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.VtigerGenric.WebDriverUtil;

public class PopUpInfoPage {
	WebDriver driver;
	WebDriverUtil allactions = new WebDriverUtil(driver);
	@FindBy(name = ("search_text"))
	private WebElement searchtext;

	@FindBy(name = ("search"))
	private WebElement searchbtnclk;

	@FindBy(xpath = ("//a[@href='javascript:window.close();']"))
	private WebElement clckonorgname;

	public WebElement getSearchtext() {
		return searchtext;
	}

	public WebElement getSearchbtnclk() {
		return searchbtnclk;
	}

	public WebElement getClckonorgname() {
		return clckonorgname;
	}

	public PopUpInfoPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void searchtext() {
		WebElement webemt = searchtext;
		allactions.sendkeydu(webemt, "jogarao");
	}

	public void searchbtnclk() {
		searchbtnclk.click();
	}

	public void clckonorgname() {
		clckonorgname.click();
	}

}
