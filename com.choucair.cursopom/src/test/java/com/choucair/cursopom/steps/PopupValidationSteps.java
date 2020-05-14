package com.choucair.cursopom.steps;

import com.choucair.cursopom.pageobjects.ColorlibLoginPage;
import com.choucair.cursopom.pageobjects.ColorlibMenuPage;

import net.thucydides.core.annotations.Step;

public class PopupValidationSteps {
	ColorlibLoginPage colorlibLoginPage;
	ColorlibMenuPage colorlibMenuPage;
	
	@Step
	public void loginColorlib (String usuario, String clave) {
		colorlibLoginPage.open();
		colorlibLoginPage.ingresarDatos(usuario, clave);
		colorlibLoginPage.verificarAutenticacion();
	}
	
	@Step
	public void ingresarMenuFormsValidation() {
		colorlibMenuPage.menuFormsValidation();
	}

}
