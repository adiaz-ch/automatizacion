package co.com.retotecnico;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions (features = "src/test/resources/features/Trello/Tableros/CrearTablero.feature", tags = "@CasoExitoso",
glue="co.com.retotecnico.definitions", snippets=SnippetType.CAMELCASE)

public class RunnerCrearTableros {

}
