package vtiger_Testcase;

import java.io.IOException;

import org.testng.annotations.Test;

import com.VtigerGenric.BaseClass;
import com.Vtiger_PomClass.OrganizationPage;
import com.Vtiger_PomClass.OrgnizationInfoPages;

public class Tc001_CreateOrganizationTest extends BaseClass {

	@Test(groups = { "regration" },retryAnalyzer = com.VtigerGenric.RetryAnalyzer.class)
	public void test1() throws InterruptedException, IOException {

		// Organization module case
		OrganizationPage orgpag = new OrganizationPage(driver);
		OrgnizationInfoPages orginfpage = new OrgnizationInfoPages(driver);
		orgpag.OrganizationCreateclck();
		orgpag.OrganizationCreate();
		String orgname = orgpag.accountnamecreating();
		orgpag.orgphonenum();
		orgpag.Orgsavebutton();

		// Go Back to Organization
		driver.navigate().refresh();
		
		orgpag.OrganizationCreateclck();
		// SearchText
		orginfpage.searchtext(orgname);
		Thread.sleep(5000);

		// DropDown
		orginfpage.searchfielddrop();

		// Search for details Organization
		orginfpage.submitsearch();

		// Checking Validation
		Thread.sleep(5000);

		orgpag.orgvalidation();
		System.out.println("Organizaion validtion is verified");

	}

	@Test(groups = { "smoketest" },retryAnalyzer = com.VtigerGenric.RetryAnalyzer.class)
	public void test2() throws InterruptedException, IOException {

		// Organization module case
		OrganizationPage orgpag = new OrganizationPage(driver);
		OrgnizationInfoPages orginfpage = new OrgnizationInfoPages(driver);
		orgpag.OrganizationCreateclck();
		orgpag.OrganizationCreate();
		String orgname = orgpag.accountnamecreating();
		orgpag.orgphonenum();
		orgpag.Orgsavebutton();

		// Go Back to Organization
		driver.navigate().refresh();
		orgpag.OrganizationCreateclck();
		// Go Back to Organization
		driver.navigate().refresh();
		orgpag.OrganizationCreateclck();
		// SearchText
		orginfpage.searchtext(orgname);
		Thread.sleep(5000);


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
