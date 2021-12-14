package vtiger_Testcase;

import java.io.IOException;

import org.testng.annotations.Test;

import com.VtigerGenric.BaseClass;
import com.Vtiger_PomClass.OrganizationPage;
import com.Vtiger_PomClass.OrgnizationInfoPages;

public class Tc002_CreateOrganizationTest extends BaseClass {

	@Test(groups = { "regration","smoketest"})
	public void test2() throws InterruptedException, IOException {
		// Organization creating case
		OrganizationPage orgpag = new OrganizationPage(driver);
		OrgnizationInfoPages orginfpage = new OrgnizationInfoPages(driver);
		orgpag.OrganizationCreateclck();
		orgpag.OrganizationCreate();
		String orgname = orgpag.accountnamecreating();

		// Industry DropDown
		orgpag.industrydropdown();

		// Type DropDown
		orgpag.typedropdown();

		// Rating DropDown
		orgpag.ratingdropdown();

		// Save Button
		Thread.sleep(2000);
		orgpag.Orgsavebutton();

		// Refresh Go Back To Organization
		driver.navigate().refresh();
		orgpag.OrganizationCreateclck();

		// Search Box
		orginfpage.searchtext(orgname);

		// DropDown Beside Search Box
		orginfpage.searchfielddrop();

		// Search for Details Organization
		orginfpage.submitsearch();

		// Checking Validation
		Thread.sleep(5000);
		try {
			orgpag.orgvalidation();
			System.out.println("Organizaion validtion is verified");

		} finally {
			// Logout
			Thread.sleep(3000);

		}

		System.out.println("Organization Module Test Case is Verified Tc002");

	}

	@Test(groups = { "regration" })
	public void test2_1() throws InterruptedException, IOException {

		// Organization module case
		OrganizationPage orgpag = new OrganizationPage(driver);
		OrgnizationInfoPages orginfpage = new OrgnizationInfoPages(driver);
		orgpag.OrganizationCreateclck();
		orgpag.OrganizationCreate();
		String orgname = orgpag.accountnamecreating();

		// Industry DropDown
		orgpag.industrydropdown();
		// Type DropDown
		orgpag.typedropdown();
		// create PhoneNumber
		orgpag.orgphonenum();
		// Rating DropDown
		orgpag.ratingdropdown();

		// Save button
		orgpag.Orgsavebutton();

		// Go Back to Organization
		driver.navigate().refresh();
		orgpag.OrganizationCreateclck();
		// Go Back to Organization
		driver.navigate().refresh();
		orgpag.OrganizationCreateclck();
		// SearchText
		orginfpage.searchtext(orgname);

		// DropDown
		orginfpage.searchfielddrop();

		// Search for details Organization
		orginfpage.submitsearch();

		// Checking Validation
		Thread.sleep(5000);

		orgpag.orgvalidation();
		System.out.println("Organizaion validtion is verified");

	}
}
