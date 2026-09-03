package Tests;

import org.testng.SkipException;
import org.testng.annotations.Test;

import Base.BaseTest;
import Pages.HomePage;
import Pages.LoginPage;

public class LoginWithPom extends BaseTest {
	@Test
	public void login() {
		LoginPage loginpage = new LoginPage(page);
		HomePage homepage = new HomePage(page);

		test.info("Navigating to login page");
		loginpage.navigate();

		test.info("Giving credentials");
		loginpage.login("Admin", "admin123");

		test.info("Clicking Admin");
		homepage.clickAdmin();
	}

	@Test
	public void login2() {

		LoginPage loginpage = new LoginPage(page);
		HomePage homepage = new HomePage(page);

		test.info("Navigating to login page");
		loginpage.navigate();

		test.info("Giving credentials");
		loginpage.login("Admin", "admin123");

	}

	@Test
	public void login3() {

		test.skip("Skipping this test");
		throw new SkipException("Skipping this test");
	}

}
