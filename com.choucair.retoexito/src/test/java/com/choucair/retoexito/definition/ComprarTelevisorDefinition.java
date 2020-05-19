package com.choucair.retoexito.definition;

import java.util.List;

import com.choucair.retoexito.steps.ComprarTelevisorSteps;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class ComprarTelevisorDefinition {
	@Steps
	ComprarTelevisorSteps comprarTelevisorSteps;
	
	@Given("^Realizo busqueda de televisores$")
	public void realizoBusquedaDeTelevisores(DataTable datos) {
		List<List<String>> data = datos.raw();
    	
    	for (int i = 1; i < data.size(); i++) {
    		comprarTelevisorSteps.buscarTelevisor(data, i);
		}
	}

	@Given("^Selecciono el televisor a comprar$")
	public void seleccionoElTelevisorAComprar() {
		comprarTelevisorSteps.seleccionarTelevisor();
	}

	@When("^Agrego al carrito de compras$")
	public void agregoAlCarritoDeCompras() {
		comprarTelevisorSteps.agregarAlCarrito();
	}

	@Then("^Verifico el carrito de compras$")
	public void verificoElCarritoDeCompras() {
		comprarTelevisorSteps.verificarCarrito();
	}


}
