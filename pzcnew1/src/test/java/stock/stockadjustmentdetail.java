package stock;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.UBQGenericLib.BaseClassLoader;
import com.UBQGenericLib.ExcelLib;

/**
 * @author Deepak
 *
 */
@Listeners(com.UBQGenericLib.SampleListner.class)
public class stockadjustmentdetail extends BaseClassLoader {
	HashMap<String, String> input = new HashMap<String, String>();
	
	@Test
	public void printStockPositionview() throws Exception {
		
		
		
		if (country.equalsIgnoreCase("Nigeria")) {
			Thread.sleep(2000);
			home.ClickonMenutype();
			Thread.sleep(2000);
		}
		Thread.sleep(500);
		home.ClickOnMenu();
		Thread.sleep(500);
		home.ClickOnSubMenuItem("Stock Adjustment Details Report");
		logger.info("Clicked on sub menu item View Stock ");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='viewBtn']")).click();
		
		
		
		
	java.util.List<WebElement> Details = driver.findElements(By.xpath("//table[@name='stockAdjTable']"));
    for(WebElement Details1:Details){
	
	System.out.println(Details1.getText());
}
	
		
		
		
		
}
	}