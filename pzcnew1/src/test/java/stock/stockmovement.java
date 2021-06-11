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
public class stockmovement extends BaseClassLoader {
	HashMap<String, String> input = new HashMap<String, String>();
	
	@Test
	public void printStockPositionview() throws Exception {
		
		input.put("SBU", "AJEDIRAN OLATUNJI(1003379)");
	//	input.put("Packdate1", " 2020-02-01  ");
		
		
		if (country.equalsIgnoreCase("Nigeria")) {
			Thread.sleep(2000);
			home.ClickonMenutype();
			Thread.sleep(2000);
		}
		Thread.sleep(500);
		home.ClickOnMenu();
		Thread.sleep(500);
		home.ClickOnSubMenuItem("Stk Movement");
		logger.info("Clicked on sub menu item View Stock");
		Thread.sleep(1000);
		
      stm.selectTostore(input.get("SBU"));
      
      
      if(stm.getAlertmsg().equalsIgnoreCase("Would you like to load last closing stock for the same store ? ")){
    	  stm.dismissAlert();
      }
		
	java.util.List<WebElement> Details = driver.findElements(By.xpath("//thead[@class='sectionHeader']"));
for(WebElement Details1:Details){
	System.out.println(Details1.getText());
}
	
		
		
		
		
}
	}