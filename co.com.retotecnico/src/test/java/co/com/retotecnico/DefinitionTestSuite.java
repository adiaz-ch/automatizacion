package co.com.retotecnico;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features/demo.feature",
				  tags="@tag1",
				  glue="co.com.retotecnico.definitions",
				  snippets=SnippetType.CAMELCASE)
public class DefinitionTestSuite {}
