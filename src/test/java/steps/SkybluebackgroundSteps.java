package steps;

import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.BasePage;
import page.DashboardPage;
import page.SkybluebackgroundPage;
import util.BrowserFactory;

public class SkybluebackgroundSteps {
	WebDriver driver;
	DashboardPage dashboard;
	SkybluebackgroundPage skybluebackgroundpage;

	@Before
	public void startFirst() {
		driver = BrowserFactory.startBrowser();
		dashboard = PageFactory.initElements(driver, DashboardPage.class);
		skybluebackgroundpage = PageFactory.initElements(driver, SkybluebackgroundPage.class);

		// Dashboard validation

		dashboard.dashboardValidation();

	}

	@Given("^\"([^\"]*)\" button exists$")
	public void button_exists(String arg1) {
		skybluebackgroundpage.existsElement();
	}

	@When("^I click on the button$")
	public void i_click_on_the_button() {
		skybluebackgroundpage.clickOnTheSetSkyBlueBackgroundButton();

	}

	@Then("^the background color will change to sky blue$")
	public void the_background_color_will_change_to_sky_blue() {
		skybluebackgroundpage.validateskyBlueBackgroungColor();

	}

	@After
	public void close() throws InterruptedException {
		BasePage.waitForImplicitWaitly();
		driver.close();
		driver.quit();
	}
}
