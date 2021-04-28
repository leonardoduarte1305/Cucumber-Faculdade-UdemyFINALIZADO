package aulasangelica.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions( //
		features = "src/test/resources/features/TestarNavegador.feature", //
		glue = "aulasangelica.steps", //
		monochrome = true, //
		plugin = "pretty", //
		snippets = SnippetType.CAMELCASE //
) //
public class TestarNavegadorRunner {

}