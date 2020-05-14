package co.com.retotecnico.definitions;

import co.com.retotecnico.steps.DemoSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class DemoDefinition {
	@Steps
	DemoSteps Demosteps;
	
	@Given("^I want to write a step with precondition$")
	public void iWantToWriteAStepWithPrecondition() {
		Demosteps.AbrirUrl();

	}


	@When("^I complete action$")
	public void iCompleteAction() {

	}

	@Then("^I validate the outcome$")
	public void iValidateTheOutcome() {

	}

}
