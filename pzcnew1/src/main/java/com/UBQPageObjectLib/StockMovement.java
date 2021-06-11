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
public class StockMovement extends WebDriverCommonLib {

	public WebDriver driver;

	// ----------------------Constructor----------------------//
	public StockMovement(WebDriver driver) {
		this.driver = driver;
	}

	// ----------------------UI Elements----------------------//

	// ---------For tostore-----------//
	@FindBy(how = How.XPATH, using = "//select[@id='dest_store']")
	private WebElement Tostore;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	// ---select channel--//
			public void selectTostore(String tostore) {
				selectvalue(tostore, Tostore);

			}
			
}