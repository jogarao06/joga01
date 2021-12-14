package com.Vtiger_PomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.VtigerGenric.WebDriverUtil;
import com.VtigerGenric.javafaker;

public class ContactCreatPage {
	WebDriver driver;
	WebDriverUtil allactionsuse = new WebDriverUtil(driver);
	String fisrtName = javafaker.objForJavautil().getFistName();
	String lastName = javafaker.objForJavautil().getLastName();

	@FindBy(xpath = ("//a[text()='Contacts']")) // rule no1
	private WebElement createcontantmodule; // rule no 2

	@FindBy(xpath = ("//img[@title='Create Contact...']")) // rule no1
	private WebElement createcontantpuls;// rule no2

	@FindBy(name = ("salutationtype")) // rule no1
	private WebElement firstnamedrpdn;// rule no 2

	@FindBy(name = ("firstname")) // rule no1
	private WebElement firstnamesnd;// rule no2

	@FindBy(name = ("lastname")) // rule no1
	private WebElement lastnamesnd;// rule no2

	@FindBy(xpath = ("//img[@src='themes/softed/images/select.gif']")) // rule no1
	private WebElement orgnameaddpuls;// rule no2

	@FindBy(name = ("button")) // rule no1
	private WebElement cntctsavebt;// rule no 2

	public WebElement getCreatecontantmodule() { // rule no3
		return createcontantmodule;
	}

	public WebElement getCreatecontantpuls() { // rule no3
		return createcontantpuls;
	}

	public WebElement getFirstnamedrpdn() { // rule no3
		return firstnamedrpdn;
	}

	public WebElement getFirstnamesnd() {// rule no3
		return firstnamesnd;
	}

	public WebElement getLastnamesnd() {// rule no3
		return lastnamesnd;
	}

	public WebElement getOrgnameaddpuls() {// rule no3
		return orgnameaddpuls;
	}

	public WebElement getCntctsavebt() {
		return cntctsavebt;
	}

	public ContactCreatPage(WebDriver driver) {// rule no 4
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void createcontantmodule() { // ruleno5
		createcontantmodule.click();

	}

	public void createcontantpuls() { // ruleno5
		createcontantpuls.click();
	}

	public void firstnamedrpdn() {
		WebElement webelement = firstnamedrpdn;
		allactionsuse.movetoDropdownvisibletext(webelement, "Mr.");
	}

	public String firstnamesnd() {
		WebElement abc = firstnamesnd;
		allactionsuse.sendkeydu(abc, fisrtName);
		return fisrtName;

	}

	public String lastnamesnd() {
		WebElement abc = lastnamesnd;
		allactionsuse.sendkeydu(abc, lastName);
		return lastName;
	}

	public void orgnameaddpuls() {
		orgnameaddpuls.click();

	}

	public void cntctsavebt() {
		cntctsavebt.click();
	}

}
