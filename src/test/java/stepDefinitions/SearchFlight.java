package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.SearchFilghtPage;

public class SearchFlight {
	WebDriver driver= null;
	SearchFilghtPage flightpage; //defining globally

	@Given("Browser is open")
	public void browser_is_open() {
		// Write code here that turns the phrase above into concrete actions

		System.out.println("Disabling location pop up");
		FirefoxProfile geoDisabled = new FirefoxProfile();
		geoDisabled.setPreference("geo.enabled", false);
		geoDisabled.setPreference("geo.provider.use_corelocation", false);
		geoDisabled.setPreference("geo.prompt.testing", false);
		geoDisabled.setPreference("geo.prompt.testing.allow", false);
		System.out.println("Disabling Notifications pop up");
		geoDisabled.setPreference("dom.webnotifications.enabled", false);
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability(FirefoxDriver.PROFILE, geoDisabled);

		System.out.println("Open Browser");
		System.setProperty("webdriver.gecko.driver","C:\\Users\\002EB4744\\Downloads\\geckodriver-v0.29.1-win64\\geckodriver.exe");

		driver = new FirefoxDriver(capabilities);

	}

	@When("User Navigate to SpiceJet Website")
	public void user_Navigate_to_SpiceJet_Website() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println("Go to the given website");
		driver.get("http://www.spicejet.com/");
		// Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);//for observing the action
	}

	@And("User selects round trip radio button")
	public void user_selects_round_trip_radio_button() throws Exception{
		SearchFilghtPage flightpage= new SearchFilghtPage(driver);
		flightpage.explicitWaitRadiobutton();
		Thread.sleep(2000);//for observing the action
		// Write code here that turns the phrase above into concrete actions

	}

	/*public static void explicitWait(String element) throws Exception
	{
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(element))).click();

	}*/


	@And("User click on From button")
	public void user_click_on_From_button() throws InterruptedException {
		SearchFilghtPage flightpage= new SearchFilghtPage(driver);
		flightpage.clickfromaction();
		Thread.sleep(2000);//for observing the action
		// Write code here that turns the phrase above into concrete actions

	}

	@And("User selects From location")
	public void user_selects_From_location() throws InterruptedException {
		SearchFilghtPage flightpage= new SearchFilghtPage(driver);
		flightpage.selectfromloc();
		Thread.sleep(2000);//for observing the action
		// Write code here that turns the phrase above into concrete actions

	}

	@And("User clicks on destination button")
	public void user_clicks_on_destination_button() throws InterruptedException {
		SearchFilghtPage flightpage= new SearchFilghtPage(driver);
		flightpage.clickdestto();
		Thread.sleep(2000);//for observing the action
		// Write code here that turns the phrase above into concrete actions

	}

	@And("User selects destination location")
	public void user_selects_destination_location() throws InterruptedException {
		SearchFilghtPage flightpage= new SearchFilghtPage(driver);
		flightpage.destitoloc();
		Thread.sleep(2000);//for observing the action
		// Write code here that turns the phrase above into concrete actions

	}

	@And("user selects departure date")
	public void user_selects_departure_date() throws InterruptedException {
		SearchFilghtPage flightpage= new SearchFilghtPage(driver);
		flightpage.departdt();
		Thread.sleep(2000);//for observing the action
		// Write code here that turns the phrase above into concrete actions

	}

	@And("user selects return date")
	public void user_selects_return_date() throws InterruptedException {
		SearchFilghtPage flightpage= new SearchFilghtPage(driver);
		flightpage.returndt();
		Thread.sleep(2000);//for observing the action
		// Write code here that turns the phrase above into concrete actions

	}
	@And("user clicks on Currency button")
	public void user_clicks_on_Currency_button() throws InterruptedException {
		SearchFilghtPage flightpage= new SearchFilghtPage(driver);
		flightpage.clickcurrencybtn();
		Thread.sleep(2000);//for observing the action
		// Write code here that turns the phrase above into concrete actions
	}


	@And("user selects GBP currency")
	public void user_selects_GBP_currency() throws InterruptedException {
		SearchFilghtPage flightpage= new SearchFilghtPage(driver);
		flightpage.gbpcurrencysel();
		Thread.sleep(2000);//for observing the action
		// Write code here that turns the phrase above into concrete actions

	}

	@And("user selects student radio button")
	public void user_selects_student_radio_button() throws InterruptedException {
		SearchFilghtPage flightpage= new SearchFilghtPage(driver);
		flightpage.studbtn();
		Thread.sleep(2000);//for observing the action
		// Write code here that turns the phrase above into concrete actions

	}

	@And("user clicks on search flight button")
	public void user_clicks_on_search_flight_button() throws InterruptedException {
		SearchFilghtPage flightpage= new SearchFilghtPage(driver);
		flightpage.searchflightbtn();
		Thread.sleep(2000);//for observing the action
		// Write code here that turns the phrase above into concrete actions

	}

	@Then("Pop up message appears on screen")
	public void pop_up_message_appears_on_screen() {
		System.out.println("Terms and conditions pop up comes up");
		// Write code here that turns the phrase above into concrete actions

	}




}
