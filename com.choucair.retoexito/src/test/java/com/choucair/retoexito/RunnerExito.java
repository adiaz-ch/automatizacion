package com.choucair.retoexito;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions (features = "src/test/resources/features/Exito/Compras/ComprarTelevisor.feature", 
				tags = "@CasoExitoso", snippets=SnippetType.CAMELCASE)
public class RunnerExito {

}
