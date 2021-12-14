package com.Vtiger_PomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.VtigerGenric.WebDriverUtil;

public class ContactInfoPaqe {

	WebDriver driver;
	WebDriverUtil allactions = new WebDriverUtil(driver);
	ContactCreatPage contactcrtpag = new ContactCreatPage(driver);

	@FindBy(name = ("search_text"))
	private WebElement searchtextctc;

	@FindBy(name = ("search_field"))
	private WebElement drpdwnorg;

	@FindBy(name = ("submit"))
	private WebElement cntctserchbtn;

	@FindBy(xpath = ("(//a[@title='Contacts'])[1]"))
	private WebElement Validationfstname;

	public WebElement getSearchtextctc() {
		return searchtextctc;
	}

	public WebElement getDrpdwnorg() {
		return drpdwnorg;
	}

	public WebElement getCntctserchbtn() {
		return cntctserchbtn;
	}

	public WebElement getValidationfstname() {
		return Validationfstname;
	}

	public ContactInfoPaqe(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public String searchtextctc(String firstname) {
		WebElement webemt = searchtextctc;
		allactions.sendkeydu(webemt, firstname);
		return firstname;

	}

	public void cntctserchbtn() {
		cntctserchbtn.click();

	}

	public void drpdwnorg() {
		WebElement elemnt = drpdwnorg;
		allactions.movetoDropdownvisibletext(elemnt, "First Name");
	}

	public void Validationfstname() {
		WebElement webemnt = Validationfstname;
		String fname = Validationfstname.getText();
		webemnt.isDisplayed();

		if (webemnt.getText().equalsIgnoreCase(fname)) {
			System.out.println("pass");

		} else
			System.out.println("fail");

	}

	public void drpdwnorg1() {
		WebElement elemnt1 = drpdwnorg;
		allactions.movetoDropdownvisibletext(elemnt1, "Last Name");
	}

	public void Validationfstname1() {
		WebElement webemnt1 = Validationfstname;
		String lname = Validationfstname.getText();
		webemnt1.isDisplayed();
		// using HardAssersion
		String str = webemnt1.getText();
		Assert.assertEquals(lname, str);

	}
}
