package framework_Selenium;
import org.testng.annotations.*;

public class Testng_1 {
	@BeforeMethod //works for every test
	public void launchbrowser() {
		System.out.println("Browser is launched");
	}
	@AfterMethod
	public void closebrowser() {
		System.out.println("Browser is closed");
	}
	@Test
	public void login() {
		System.out.println("logged in");
	}
	@Test
	public void logout() {
		System.out.println("logged out");
	}

}
