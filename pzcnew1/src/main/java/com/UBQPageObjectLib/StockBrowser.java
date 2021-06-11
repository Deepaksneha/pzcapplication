/**
 * 
 */
package com.UBQPageObjectLib;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.UBQGenericLib.WebDriverCommonLib;

/**
 * @author Basanagouda
 *
 */
public class StockBrowser extends WebDriverCommonLib {

	public WebDriver driver;

	// ----------------------Constructor----------------------//
	public StockBrowser(WebDriver driver) {
		this.driver = driver;
	}
	
	
	
	
	
	
	

	// ----------------------UI Elements----------------------//

	// ---For Store---//
	@FindBy(how = How.XPATH, using = "//select[@id='locationRID']")
	private WebElement Store;
	
	// ---For viewbtn---//
		@FindBy(how = How.XPATH, using = "//input[@id='viewBtn']")
		private WebElement viewbtn;
	

	

	// ----------------------Functions----------------------//

	public void selectstore(String store) {
		selectvalue(store, Store);

	}

	// ---Savebtn---//
		public void Clickviewbtn() {
			buttonClick(viewbtn);
		}


	
	
	
	
	
	
	
	
	

	
}