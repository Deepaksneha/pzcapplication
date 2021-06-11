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
public class StockTypeTransfer extends WebDriverCommonLib {

	public WebDriver driver;

	// ----------------------Constructor----------------------//
	public StockTypeTransfer(WebDriver driver) {
		this.driver = driver;
	}

	// ----------------------UI Elements----------------------//

	// ---------For selectproduct-----------//
	@FindBy(how = How.XPATH, using = "//input[@id='productName']")
	private WebElement Selectproduct;
	
	// ---------For Transferqty-----------//
	@FindBy(how = How.XPATH, using = "//input[@id='ok']")
	private WebElement okbtn;
	
	// ---------For Transferqty-----------//
		@FindBy(how = How.XPATH, using = "//input[@id='cancel4']")
		private WebElement clearbtn;

	
		
		// ---For SBU---//
				@FindBy(how = How.XPATH, using = "//option[text()=' 2020-02-01  ']")
				private WebElement Packdate;
		
		
		
		// ---------For Transferqty-----------//
				@FindBy(how = How.XPATH, using = "//input[@id='qty']")
				private WebElement TransferQty;
	
	
	

	// ----------------------Functions----------------------//

	

	// -------------For getDate--------//
	public void enterProduct(String entercode) {
		entervalue(entercode,Selectproduct);
		Selectproduct.sendKeys(Keys.SPACE,Keys.TAB);
	}
	
	
	
	// ---Savebtn---//
			public void Clickokbtn() {
				buttonClick(okbtn);
			}
			
			// ---packdatebtn---//
						public void Clickpackdatebtn() {
							buttonClick(Packdate);
						}
						
	
		
			
			
		
		
		
		// ---select transferqty--//
				public void selectTransferqty(String Transferqty) {
					selectvalue(Transferqty, TransferQty);

				}



				public void Clickpopclearbtn() {
					buttonClick(clearbtn);
					
				}



				



			
					
				}


			



	