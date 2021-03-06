package aprendendocucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions( //
		dryRun = false, //
		monochrome = true, //
		plugin = { "pretty", "html:target/report-html", "json:target/report.json" }, //
		snippets = SnippetType.CAMELCASE, //
		features = "src\\test\\resources\\features\\Locadora.feature" //
)
public class RunnerLocadora {

}
