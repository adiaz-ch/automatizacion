package com.choucair.cursopom.definition;

import java.util.List;

import com.choucair.cursopom.steps.ColorlibFormValidationSteps;
import com.choucair.cursopom.steps.PopupValidationSteps;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class PopupValidationDefinition {
	
	@Steps
	PopupValidationSteps popupValidationSteps;
	@Steps
	ColorlibFormValidationSteps colorlibFormValidationSteps;
	
	@Given("^Autentico en Colorlib con el usuario \"([^\"]*)\" y la clave \"([^\"]*)\"$")
    public void autenticoEnColorlibConElUsuarioYLaClave(String usuario, String clave) {
		popupValidationSteps.loginColorlib(usuario, clave);
    }
	
	@Given("^Ingreso a la funcionalidad Forms Validation$")
    public void ingresoALaFuncionalidadFormsValidation() {
       popupValidationSteps.ingresarMenuFormsValidation();
    }

    @When("^Diligencio formulario Popup Validation$")
    public void diligencioFormularioPopupValidation(DataTable datos) {
    	List<List<String>> data = datos.raw();
    	
    	for (int i = 1; i < data.size(); i++) {
    		colorlibFormValidationSteps.diligenciarFormulario(data, i);
		}
    }

    @Then("^Verifico ingreso exitoso$")
    public void verificoIngresoExitoso() {
    	colorlibFormValidationSteps.verificarFormSinErrores();
    }

    @Then("^Verificar que se presente globo informativo de validacion$")
    public void verificarQueSePresenteGloboInformativoDeValidacion() {
    	colorlibFormValidationSteps.verificarFormConnErrores();
    }


}
