package vtiger_Testcase;

import java.io.IOException;

import org.testng.annotations.Test;

import com.VtigerGenric.BaseClass;
import com.VtigerGenric.WebDriverUtil;
import com.Vtiger_PomClass.ContactCreatPage;
import com.Vtiger_PomClass.ContactInfoPaqe;
import com.Vtiger_PomClass.PopUpInfoPage;

public class Tc003_CreateContactTest extends BaseClass {

	@Test(groups = { "regration" })
	public void test3() throws InterruptedException, IOException {

		// Creating WebElement Actions
		WebDriverUtil allActions = new WebDriverUtil(driver);
		ContactCreatPage contactcrtpag = new ContactCreatPage(driver);
		PopUpInfoPage popupinfopage = new PopUpInfoPage(driver);
		ContactInfoPaqe contactinfpage = new ContactInfoPaqe(driver);

		// Contact Module click and enter Details
		contactcrtpag.createcontantmodule();
		contactcrtpag.createcontantpuls();

		// FirstName DropDown
		contactcrtpag.firstnamedrpdn();
		String firstname = contactcrtpag.firstnamesnd();
		contactcrtpag.lastnamesnd();

		// click on add OrgButton
		contactcrtpag.orgnameaddpuls();

		// going to Child page
		allActions.switchtowindows("Account");

		Thread.sleep(5000);
		popupinfopage.searchtext();
		popupinfopage.searchbtnclk();
		Thread.sleep(5000);
		popupinfopage.clckonorgname();
		Thread.sleep(5000);

		// Switch to main window
		allActions.switchtowindows("Contacts");

		// Contact page save button
		contactcrtpag.cntctsavebt();

		// clicking contact
		Thread.sleep(2000);
		driver.navigate().refresh();
		contactcrtpag.createcontantmodule();

		// contact page search enter box
		Thread.sleep(5000);
		contactinfpage.searchtextctc(firstname);

		// DropDown Organization
		contactinfpage.drpdwnorg();

		// Contact page search button
		contactinfpage.cntctserchbtn();

		// Validation
		Thread.sleep(5000);
		try {

			contactinfpage.Validationfstname();
			System.out.println("Contacts validtion is verified");

		}

		finally {

		}
		System.out.println("Contact  Module Test Case is Verified Tc003");
	}

	@Test(groups = { "smoketest" })
	public void test31() throws InterruptedException, IOException {

		// Creating WebElement Actions
		WebDriverUtil allActions = new WebDriverUtil(driver);
		ContactCreatPage contactcrtpag = new ContactCreatPage(driver);
		PopUpInfoPage popupinfopage = new PopUpInfoPage(driver);
		ContactInfoPaqe contactinfpage = new ContactInfoPaqe(driver);

		// Contact Module click and enter Details
		contactcrtpag.createcontantmodule();
		contactcrtpag.createcontantpuls();

		// String firstname = contactcrtpag.firstnamesnd();
		String lastname = contactcrtpag.lastnamesnd();

		// click on add OrgButton
		contactcrtpag.orgnameaddpuls();

		// going to Child page
		allActions.switchtowindows("Account");

		Thread.sleep(5000);
		popupinfopage.searchtext();
		popupinfopage.searchbtnclk();
		Thread.sleep(5000);
		popupinfopage.clckonorgname();
		Thread.sleep(5000);

		// Switch to main window
		allActions.switchtowindows("Contacts");

		// Contact page save button
		contactcrtpag.cntctsavebt();

		// clicking contact
		Thread.sleep(2000);
		driver.navigate().refresh();
		contactcrtpag.createcontantmodule();

		// contact page search enter box
		Thread.sleep(5000);

		// contact page search enter box
		Thread.sleep(5000);
		contactinfpage.searchtextctc(lastname);

		// DropDown Organization
		contactinfpage.drpdwnorg1();

		// Contact page search button
		contactinfpage.cntctserchbtn();

		// Validation
		Thread.sleep(5000);

		contactinfpage.Validationfstname1();

		System.out.println("Contact  Module Test Case is Verified Tc003");

	}
}
