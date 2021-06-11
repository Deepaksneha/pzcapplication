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

	// ---For PrintStockPosition---//
	@FindBy(how = How.XPATH, using = "//div[@id='container_tt']")
	private WebElement New;



	// ----------------------Functions----------------------//

	// For ClickonPrintStockBook
	public void ClickonNew() {
		buttonClick(New);
	}
}

	// For ClickonPrintStockPosition
	

	/*public void selectSBU(String sbu) {
		selectvalue(sbu, SBU);
	}

	public String getSBU() {
		return getselectDrpdwnValue(SBU);
	}*/

