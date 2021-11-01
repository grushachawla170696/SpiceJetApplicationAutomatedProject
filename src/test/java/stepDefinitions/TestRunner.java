package stepDefinitions;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/Flight-search.feature",
		glue = "stepDefinitions",
		tags = "@SearchFlightFeature"
		)

public class TestRunner {

}
