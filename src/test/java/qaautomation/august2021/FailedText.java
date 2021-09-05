package qaautomation.august2021;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import qaautomation.august2021.pages.LoginPage;
import qaautomation.august2021.pages.ProfilPage;

public class FailedText extends BaseWebTest {
	LoginPage loginPage = new LoginPage(driver, explicitWait);
	ProfilPage profilePage = new ProfilPage(driver, explicitWait);
	
	@Test(testName = "verify login Failed", description = "login will be not found")
	public void testFailed() {
		String username = "fullstackdemo";
		String password = "fullstackdemo";
		loginPage.login(username, password);
		String actualUser = profilePage.getProfileText(username);
		String failedText = actualUser + "salah";
		System.out.println(failedText);
		assertEquals(failedText, username);
	}
}
