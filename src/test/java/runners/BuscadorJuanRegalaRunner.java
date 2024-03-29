package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/BuscadorJuanRegala.feature",
        glue = "stepsDefinitions",
        snippets = SnippetType.CAMELCASE)
public class BuscadorJuanRegalaRunner {
}
