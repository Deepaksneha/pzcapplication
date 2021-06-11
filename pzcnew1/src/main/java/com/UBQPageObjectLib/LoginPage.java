package com.UBQPageObjectLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.UBQGenericLib.Constants;
import com.UBQGenericLib.WebDriverCommonLib;

/**
 * @author Basanagouda
 *
 */
public class LoginPage extends WebDriverCommonLib {

	WebDriver driver;
	WebDriverCommonLib wcl = new WebDriverCommonLib();

	// ----------------------Constructor----------------------//
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	// ----------------------UI Elements----------------------//

	// ---For Entity Code---//
		@FindBy(how = How.ID, using = "entCode")
		@CacheLookup
		private WebElement entityCode;

		// ---For Entity Name---//
		@FindBy(how = How.ID, using = "entName")
		@CacheLookup
		private WebElement entityname;

		// ---For User Name---//
		@FindBy(how = How.ID, using = "userName")
		@CacheLookup
		private WebElement username;

		// ---For Password---//
		@FindBy(how = How.ID, using = "password")
		@CacheLookup
		private WebElement Password;

		// ---For Login Button---//
		@FindBy(how = How.ID, using = "loginbtn")
		private WebElement login;


	// ----------------------Basic functions----------------------//

	// ---For EnterEntityCode---//
	public void enterEntityCode(String Distributorcode) {
		entervalue(Distributorcode, entityCode);
	}

	// ---For getEntityName---//
	public String getDistributorName() {
		return getText(entityname);
	}

	// ---For EnterUserName---//
	public void enterUserName(String uname) {
		entervalue(uname, username);

	}

	// ---For EnterPassword---//
	public void enterPassword(String pass) {
		entervalue(pass, Password);
	}

	// ---For ClickLoginBtn---//
	public void clickLoginBtn() {
		buttonClick(login);

	}

	// Login Function
	public void login(String entitycode, String uname, String EntityName,String pass) {
		try {
			wcl.waitforpageload();
			Thread.sleep(500);
			buttonClick(login);
			if (wcl.getAlertmsg().contains("Please enter entity code.")) {
				Thread.sleep(1000);
				wcl.acceptAlert();
			} else {
				ast.assertEquals(wcl.getAlertmsg(), "Please enter entity code.");
			}
			logger.info("Login Started");
			entervalue(entitycode, entityCode);
			//buttonClick(login);
			/*if (wcl.getAlertmsg().contains("User name must have a value")) {
				Thread.sleep(1000);
				wcl.acceptAlert();
			} else {
				Assert.assertEquals(wcl.getAlertmsg(), "User name must have a value");
			}*/
			entervalue(uname, username);
			entervalue(pass, Password);
			buttonClick(login);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			ast.assertTrue(false, "Unable to Login");
			logger.error("Login Failed " + e.getMessage());
		}
	}

	// Login Function
	public void login() {
		try {
			wcl.waitforpageload();
			Thread.sleep(2500);
			buttonClick(login);
			if (wcl.getAlertmsg().contains("Entity code must have a value")) {
				Thread.sleep(1000);
				wcl.acceptAlert();
			} else {
				ast.assertEquals(wcl.getAlertmsg(), "Entity code must have a value");
			}
			logger.info("Login Started");
			entervalue(Constants.Distributorcode, entityCode);
			entervalue(Constants.username, username);
			entervalue(Constants.Password, Password);
			buttonClick(login);
			Thread.sleep(1000);
//			if (getDistributorName().contains(Constants.DistributorName)) {
//				entervalue(Constants.Password, Password);
//				buttonClick(login);
//				logger.info("Logged in Successfully");
//			} else {
//				ast.assertEquals(getDistributorName(), Constants.DistributorName);
//			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			ast.assertTrue(false, "Unable to Login");
			logger.error("Login Failed " + e.getMessage());
		}

	}

}
