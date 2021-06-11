package StockTestCases;

import java.util.HashMap;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.UBQGenericLib.BaseClassLoader;
import com.UBQGenericLib.ExcelLib;

/**
 * @author Basanagouda
 *
 */
@Listeners(com.UBQGenericLib.SampleListner.class)
public class Tc_Stock_001_StockBrowserDescriteBookStockVerificationtestCase extends BaseClassLoader {
	
HashMap<String, String> input = new HashMap<String, String>();
	
@Test
public void StockBrowser() throws Exception {
	
	
	stb.ClickonNew();
	
	
	
}
}

