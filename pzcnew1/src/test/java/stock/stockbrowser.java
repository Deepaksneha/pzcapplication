package stock;

import java.util.HashMap;

import org.openqa.selenium.By;
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
public class stockbrowser extends BaseClassLoader {
	HashMap<String, String> input = new HashMap<String, String>();
	
	@Test
	public void printStockPositionview() throws Exception {
		
		input.put("Store", "MAIN");
		
		if (country.equalsIgnoreCase("Nigeria")) {
			Thread.sleep(2000);
			home.ClickonMenutype();
			Thread.sleep(2000);
		}
		Thread.sleep(500);
		home.ClickOnMenu();
		Thread.sleep(500);
		home.ClickOnSubMenuItem("Stock Browser");
		logger.info("Clicked on sub menu item Stock Browser");
		Thread.sleep(1000);
		
		stb.selectstore(input.get("Store"));
		stb.Clickviewbtn();
		
	java.util.List<WebElement> Details = driver.findElements(By.xpath("//div[@class='responsivetable']"));
for(WebElement Details1:Details){
	System.out.println(Details1.getText());
}
	
		
		
		
		
}
	}