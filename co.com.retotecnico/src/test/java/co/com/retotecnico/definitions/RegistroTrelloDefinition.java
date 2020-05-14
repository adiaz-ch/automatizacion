package co.com.retotecnico.definitions;

import java.util.List;

import co.com.retotecnico.steps.RegistroTrelloSteps;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class RegistroTrelloDefinition {
	
	@Steps
	RegistroTrelloSteps registroTrelloSteps;
	
//	@CasoExitoso
	@Given("^Ingreso a la opcion crea tu cuenta con el correo \"([^\"]*)\"$")
	public void ingreso_a_la_opcion_crea_tu_cuenta_con_el_correo(String correo) {
		registroTrelloSteps.crearCuenta(correo);
	}

	@When("^Diligencio el formulario de registro$")
	public void diligencio_el_formulario_de_registro(DataTable datos) {
		List<List<String>> data = datos.raw();
    	
    	for (int i = 1; i < data.size(); i++) {
    		registroTrelloSteps.diligenciarFormulario(data, i);
		}
	}

	@Then("^Verifico la creacion de la cuenta$")
	public void verifico_la_creacion_de_la_cuenta() {
		registroTrelloSteps.verificarCreacionCuenta();
	}
}
