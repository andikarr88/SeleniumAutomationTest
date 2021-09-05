package qaautomation.august2021.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProfilPage extends BasePage {

	String profileText = "//strong[normalize-space()='fullstackdemo']";
	
	public ProfilPage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
		// TODO Auto-generated constructor stub
	}
	
	public String getProfileText(String username) {
		By finalXpath = By.xpath(String.format(profileText, username));
		String actualText = getText(finalXpath);
		return actualText;
		
	}
}
