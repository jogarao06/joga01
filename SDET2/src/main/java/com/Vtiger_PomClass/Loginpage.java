package com.Vtiger_PomClass;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.VtigerGenric.NotePadFile11;

public class Loginpage                            // Rule no 1
{

	WebDriver driver;

	@FindBy(name = "user_name")                 // Rule no 2 WebElement
	private WebElement username;                // Rule no 3 MakePrivate

	public WebElement getusername()             // Rule no 4 GeterMethod
	{          
		return username;
	}

	public Loginpage(WebDriver driver)           // Rule no 5 constructor 
	{       
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void Logintoapp() throws IOException    // rule no 6 business library
	{ 
		NotePadFile11 aa = new NotePadFile11();
		username.sendKeys(aa.notePadfetch("username"), Keys.TAB, aa.notePadfetch("password"), Keys.ENTER);

	}
	
	

}
