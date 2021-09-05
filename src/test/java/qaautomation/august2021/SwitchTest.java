package qaautomation.august2021;

import org.testng.annotations.Test;

import qaautomation.august2021.pages.CommonPage;
import qaautomation.august2021.utils.JavascriptSnippets;
import qaautomation.august2021.utils.TestUtility;

public class SwitchTest extends BaseWebTest{
	CommonPage commonPage = new CommonPage(driver, explicitWait);
	
	
	 @Test public void testSwitchingTab() { 
		 commonPage.newTab();
		 commonPage.switchWindow(1); 
		 commonPage.openUrl("https://facebook.com");
		 
		 String script = JavascriptSnippets.alertScript;
		 
		 commonPage.runJSCommand(script);
		 TestUtility.hardWait(2);
		 commonPage.acceptAlert();
		 TestUtility.hardWait(2);
	}
	 
	public void testFordwardBackRefresh() {
		commonPage.openUrl("https://facebook.com");
		commonPage.navigateBrowser("back");
		TestUtility.hardWait(2);
		commonPage.navigateBrowser("forward");
		TestUtility.hardWait(2);
		commonPage.navigateBrowser("refresh");
	}
	
	/*
	 * @Test public void testSwitchingWindow() { commonPage.newWindow();
	 * commonPage.switchWindow(1); commonPage.openUrl("https://twitter.com"); }
	 */
	 
	
}
