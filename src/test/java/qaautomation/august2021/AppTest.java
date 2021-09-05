package qaautomation.august2021;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.AssertJUnit.assertTrue;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertEquals;

import qaautomation.august2021.pages.LoginPage;
import qaautomation.august2021.pages.ProfilPage;

/**
 * Unit test for simple App.
 */

public class AppTest extends BaseWebTest
{
    /**
     * Rigorous Test :-)
     */
	LoginPage loginPage = new LoginPage(driver, explicitWait);
	ProfilPage profilePage = new ProfilPage(driver, explicitWait);
	/*@Test(testName = "verify login Failed", description = "login will be not found")
	public void test() {
		String username = "fullstackdemo";
		String password = "fullstackdemo";
		driver.get().findElement(By.xpath("//a[normalize-space()='Log In/Register As Student']")).click();
		driver.get().findElement(By.id("username")).sendKeys(username);
		driver.get().findElement(By.id("password")).sendKeys(password);
		driver.get().findElement(By.xpath("//button[normalize-space()='Login']")).click();
		String actualText = driver
				.get().findElement(By.xpath(String.format("//strong[normalize-space()='fullstackdemo']", username)))
				.getText();
		String failedText = actualText + "failed";
		System.out.println(failedText);
		assertEquals(failedText, username);
	}*/
	@Test(testName = "verify login Sukses", description = "login will be fine")
	public void test1() {
		String username = "fullstackdemo";
		String password = "fullstackdemo";
		loginPage.login(username, password);
		String actualUser = profilePage.getProfileText(username);
		System.out.println(actualUser);
		AssertJUnit.assertEquals(actualUser, username);
	}
}
