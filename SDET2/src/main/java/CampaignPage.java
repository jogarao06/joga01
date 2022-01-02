import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.VtigerGenric.WebDriverUtil;
import com.VtigerGenric.javafaker;

public class CampaignPage {

	WebDriver driver;
	WebDriverUtil webutli= new WebDriverUtil(driver);
	public String orgname = javafaker.objForJavautil().getFistName() + javafaker.objForJavautil().genrateRandomNubmer();
	
	@FindBy(xpath = ("//img[@src='themes/softed/images/btnL3Add.gif']")) // Rule no 1
	private WebElement ClkonPlustoCreteCompinelik; // Rule no 2
	
	@FindBy(name = ("campaignname")) // Rule no 1
	private WebElement compinenamesend; // Rule no 2
	
	@FindBy(name=("campaigntype"))
	private WebElement campaigntypedrp;
	
	@FindBy(name=("campaignstatus"))
	private WebElement campainistatusdrpdn;
	
	@FindBy(name=("expectedresponse"))
	private WebElement exptedrpdn;
	
	@FindBy(xpath = ("//input[@class='crmbutton small save']")) // Rule no 1
	private WebElement campaignsavebutton;

	public WebElement getClkonPlustoCreteCompinelik() {
		return ClkonPlustoCreteCompinelik;
	}

	public WebElement getCompinenamesend() {
		return compinenamesend;
	}

	public WebElement getCampaigntypedrp() {
		return campaigntypedrp;
	}

	public WebElement getCampainistatusdrpdn() {
		return campainistatusdrpdn;
	}

	public WebElement getCampaignsavebutton() {
		return campaignsavebutton;
	}
	
	
	public CampaignPage(WebDriver driver) { // Rule no 3
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	// business logic 
	public void ClkonPlustoCreteCompinelik() {
		ClkonPlustoCreteCompinelik.click();
	}
	
	public void compinenamesend() {
		compinenamesend.sendKeys(" ");	
//		Actions act=new Actions(driver);
//		Select s=new Select(ClkonPlustoCreteCompinelik);
//		WebElement webelent=compinenamesend;
	}
	
	public void campaigntypedrp() {
		
      
	}
	
	
	
	
	
	
	
	
	

	
	
}
