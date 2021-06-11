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
public class holdstock extends BaseClassLoader {
	HashMap<String, String> input = new HashMap<String, String>();
	
	@Test
	public void printStockPositionview() throws Exception {
		
		input.put("ProductName", "CANOE FAB SOAP 230G WRAP WITH GLY X24");
	//	input.put("Packdate", "2020-10-01");
		input.put("Transferqty", "1");
		
		if (country.equalsIgnoreCase("Nigeria")) {
			Thread.sleep(2000);
			home.ClickonMenutype();
			Thread.sleep(2000);
		}
		Thread.sleep(500);
		home.ClickOnMenu();
	//	Thread.sleep(500);
	//	home.ClickOnSubMenuItem("Hold/ Release Stock");
	//	logger.info("Clicked on sub menu item Stock Type Transfer");
	//	Thread.sleep(1000);
		
		driver.findElement(By.xpath("/html/body/div[10]/div[2]/div/div/div/div[3]/div/div[4]")).click();
		
		hrs.enterProductCode("100100908");
		Thread.sleep(1500);
		hrs.ClickPopupokbtn();
		
		Thread.sleep(2000);
		
	//	driver.findElement(By.xpath("//option[text()=' 2020-10-01  ']")).click();
		
		hrs.Clickpackdatebtn();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='qty']")).sendKeys("1");
		hrs.Clickclearbtn();
		
	
	
		
		
		
		
}
	}