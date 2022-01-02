package vTiger_CompineTestCase;

import java.io.IOException;

import org.testng.annotations.Test;

import com.VtigerGenric.BaseClass;
import com.Vtiger_PomClass.HomePage;

public class Tc001_CreateCampaignTest extends BaseClass {

	HomePage hom=new HomePage(driver);

	@Test(groups = { "regration" }, retryAnalyzer = com.VtigerGenric.RetryAnalyzer.class,enabled = false)
	public void createCampaign() throws InterruptedException, IOException {
		
		// movetoCompine
		hom.getMovetomore();
		hom.clickOnCompaine();
		

	}

}
