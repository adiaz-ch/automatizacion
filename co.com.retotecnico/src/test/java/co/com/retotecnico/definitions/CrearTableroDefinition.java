package co.com.retotecnico.definitions;

import co.com.retotecnico.steps.CrearTableroSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class CrearTableroDefinition {
	
	@Steps
	CrearTableroSteps crearTableroSteps;
	
	@Given("^Inicio sesion en Trello con el correo (.+) y el password (.+)$")
    public void inicioSesionEnTrelloConElCorreoYElPassword(String correo, String password) {
		crearTableroSteps.inicioSesionEnTrello(correo, password);
    }

	@Given("^Selecciono crear un tablero nuevo$")
	public void selecciono_crear_un_tablero_nuevo() {
		crearTableroSteps.seleccionarCrearTableroNuevo();
	}

    @When("^Diligencio el nombre (.+) del nuevo tablero$")
    public void diligencioElNombreDelNuevoTablero(String nombre) {
    	crearTableroSteps.crearTablero(nombre);
    }

    @Then("^Verifico la creacion del tablero (.+)$")
    public void verificoLaCreacionDelTablero(String nombre) {
    	crearTableroSteps.verificarCreacionTablero(nombre);
    }

}
