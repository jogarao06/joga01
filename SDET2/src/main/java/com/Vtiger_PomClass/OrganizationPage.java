package com.Vtiger_PomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.VtigerGenric.WebDriverUtil;
import com.VtigerGenric.javafaker;

public class OrganizationPage {
	WebDriver driver;
	WebDriverUtil abcd = new WebDriverUtil(driver);
	public String orgname = javafaker.objForJavautil().getFistName() + javafaker.objForJavautil().genrateRandomNubmer();

	@FindBy(xpath = ("//a[text()='Organizations']")) // Rule no 1
	private WebElement Organizationmodule; // Rule no 2

	@FindBy(xpath = ("//img[@src='themes/softed/images/btnL3Add.gif']")) // Rule no 1
	private WebElement Organizationcreateslink; // Rule no 2

	@FindBy(name = ("accountname")) // Rule no 1
	private WebElement accountnamecreating;

	@FindBy(xpath = ("//input[@class='crmbutton small save']")) // Rule no 1
	private WebElement orgsavebutton; // Rule no 2

	@FindBy(xpath = ("//a[@title='Organizations']")) // Rule no 1
	private WebElement orgvalidation; // Rule no 2
	////
     
	@FindBy(name=("phone"))
	private WebElement orgphonenum;
	
	
	public WebElement getOrgphonenum() {
		return orgphonenum;
	}
	
	public void orgphonenum() {
		getOrgphonenum().sendKeys(javafaker.objForJavautil().getphonenumber());
	}
	
	

	@FindBy(name = ("industry"))
	public WebElement industrydropdown;

	@FindBy(name = ("accounttype"))
	public WebElement typedropdown;

	@FindBy(name = ("rating"))
	public WebElement ratingdropdown;

	public WebElement getOrganizationmodule() { // Rule no 3
		return Organizationmodule;
	}

	public WebElement getOrganizationcreateslink() { // Rule no 3
		return Organizationcreateslink;
	}

	public WebElement getAccountnamecreating() { // Rule no 3
		return accountnamecreating;
	}

	public WebElement getOrgsavebutton() { // Rule no 3
		return orgsavebutton;
	}

	public WebElement getOrgvalidation() {
		return orgvalidation;
	}

	public WebElement getIndustrydropdown() {
		return industrydropdown;
	}

	public WebElement getTypedropdown() {
		return typedropdown;
	}

	public WebElement getRatingdropdown() {
		return ratingdropdown;
	}

	public OrganizationPage(WebDriver driver) { // Rule no 3
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void OrganizationCreateclck() { // business logic
		Organizationmodule.click();
	}

	public void OrganizationCreate() { // business logic
		Organizationcreateslink.click();

	}

	public void Orgsavebutton() { // business logic
		orgsavebutton.click();

	}

	public String accountnamecreating() {// business logic
		WebElement abc = accountnamecreating;
		abcd.sendkeydu(abc, orgname);
		return orgname;
		
	}

	public void orgvalidation() {
		WebElement abc = orgvalidation;
		abc.isDisplayed();
		String str=abc.getText();
		Assert.assertEquals(orgname, str);
		
		

//		if (abc.getText().equalsIgnoreCase(orgname)) {
//			System.out.println("pass");
//
//		} else
//			System.out.println("fail");

	}

	public void industrydropdown() {
		WebElement abc = industrydropdown;
		abcd.sendkeydu(abc, "Consulting");
	}

	public void typedropdown() {
		WebElement abc = typedropdown;
		abcd.sendkeydu(abc, "Customer");
	}

	public void ratingdropdown() {
		WebElement abc = ratingdropdown;
		abcd.sendkeydu(abc, "Active");
	}

}



