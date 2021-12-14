package com.Vtiger_PomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.VtigerGenric.WebDriverUtil;
import com.VtigerGenric.javafaker;

public class OrgnizationInfoPages {
	WebDriver driver;
	WebDriverUtil abcd = new WebDriverUtil(driver);

	@FindBy(name = ("search_text")) // Rule no 1
	private WebElement searchtext; // Rule no 2
	
	@FindBy(name = ("search_text")) // Rule no 1
	private WebElement searchtext1; // Rule no 2

	@FindBy(name = ("search_field")) // Rule no 1
	private WebElement searchfielddrop; // Rule no 2

	@FindBy(name = ("submit")) // Rule no 1
	private WebElement submitsearch; // Rule no 2

	public WebElement getSearchtext() { // Rule no 3
		return searchtext;
	}
	public WebElement getsearchtextphonenum() { // Rule no 3
		return searchtext1;
	}
	

	public WebElement getSearchfielddrop() {
		return searchfielddrop;
	}

	public WebElement getSubmitsearch() {
		return submitsearch;
	}

	public OrgnizationInfoPages(WebDriver driver) {// Rule no 4
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void searchtext(String orgname)   // Rule no 5
	{

		WebElement abc = searchtext;
		abcd.sendkeydu(abc,orgname );

	}
	
	public void searchtextphonenum()   // Rule no 5
	{
		WebElement abc = searchtext;
		abcd.sendkeydu(abc,javafaker.objForJavautil().getphonenumber());
	}
	
	

	public void searchfielddrop() {
		WebElement abc = searchfielddrop;
		abcd.sendkeydu(abc, "Organization Name");

	}

	public void submitsearch() {
		submitsearch.click();

	}
	

}
