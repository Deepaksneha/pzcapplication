/**
 * 
 */
package com.UBQPageObjectLib;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.UBQGenericLib.WebDriverCommonLib;

/**
 * @author Basanagouda
 *
 */
public class HoldOrReleaseStock extends WebDriverCommonLib {

	public WebDriver driver;

	// ----------------------Constructor----------------------//
	public HoldOrReleaseStock(WebDriver driver) {
		this.driver = driver;
	}

	// ----------------------UI Elements----------------------//

	// ---For Store---//
	@FindBy(how = How.XPATH, using = "//select[@id='source_store']")
	private WebElement Store;

	

	// ---For ProductName ---//
	@FindBy(how = How.XPATH, using = "//input[@id='productName']")
	private WebElement ProductCode;



	// ---For Savebtn---//
	@FindBy(how = How.XPATH, using = "//input[@id='ok']")
	private WebElement Popokbtn;

	// ---For Savebtn---//
		@FindBy(how = How.XPATH, using = "//option[text()=' 2020-10-01  ']")
		private WebElement Packdate;
	
		// ---------For Transferqty-----------//
		@FindBy(how = How.XPATH, using = "//input[@id='qty']")
		private WebElement TransferQty;
	
	
	
	
	// ---For Clearbtn---//
	@FindBy(how = How.XPATH, using = "//input[@id='cancel4']")
	private WebElement Clearbtn;

	// ----------------------Functions----------------------//

	

	

	
	
	
	
	// -------------For getDate--------//
		public void enterProductCode(String entercode) {
			entervalue(entercode,ProductCode);
			ProductCode.sendKeys(Keys.SPACE,Keys.TAB);
		}
		
		
		public void ClickPopupokbtn() {
			buttonClick(Popokbtn);
			
		}
					
		
					
					
					
					// ---okbtn---//
					public void Clickclearbtn() {
						buttonClick(Clearbtn);
					}


					public void Clickpackdatebtn() {
						buttonClick(Packdate);
						
					}

					
					


					public void ClickTransferqtybtn() {
						buttonClick(TransferQty);
						
					}
					

				

					
}