package stock;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.UBQGenericLib.BaseClassLoader;
import com.UBQGenericLib.ExcelLib;

/**
 * @author Deepak
 *
 */
@Listeners(com.UBQGenericLib.SampleListner.class)
public class stocktypetransfer extends BaseClassLoader {
	HashMap<String, String> input = new HashMap<String, String>();
	
	@Test
	public void printStockPositionview() throws Exception {
		
		input.put("ProductName", "CANOE FAB PWD 1KG X10 JB");
		input.put("PackDate", "2020-02-01");
		input.put("Transferqty", "1");
		
		if (country.equalsIgnoreCase("Nigeria")) {
			Thread.sleep(2000);
			home.ClickonMenutype();
			Thread.sleep(2000);
		}
		Thread.sleep(500);
		home.ClickOnMenu();
		Thread.sleep(500);
		home.ClickOnSubMenuItem("Stock Type Transfer");
		logger.info("Clicked on sub menu item Stock Type Transfer");
		Thread.sleep(1000);
		
		stt.enterProduct("100009751");
		Thread.sleep(1500);
		stt.Clickokbtn();
		Thread.sleep(500);
		stt.Clickpackdatebtn();
		Thread.sleep(1500);
//		Select s = new Select (driver.findElement(By.cssSelector("#prod_pkd")));
//		s.selectByIndex(1);
//		
		driver.findElement(By.xpath("//input[@id='qty']")).sendKeys("1");
		Thread.sleep(500);
		stt.Clickpopclearbtn();
		
		
	
}
	
		
		
		
		
}
	