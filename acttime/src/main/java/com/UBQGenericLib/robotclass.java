package com.UBQGenericLib;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;

/**
 * @author
 *
 */
public class robotclass extends WebDriverCommonLib {
	WebDriver driver;

	// ----------------------Constructor----------------------//

	public robotclass(WebDriver driver) throws AWTException, InterruptedException {
		this.driver = driver;
		
		
		
		// ----------------------Constructor----------------------//

	Robot robot= new Robot();

		// ----------------------UI Elements----------------------//
		
		// ---space---//
		robot.keyPress(KeyEvent.VK_SPACE);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_SPACE);
		robot.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		


}
}
