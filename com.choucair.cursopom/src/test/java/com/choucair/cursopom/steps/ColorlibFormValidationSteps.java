package com.choucair.cursopom.steps;

import java.util.List;

import com.choucair.cursopom.pageobjects.ColorlibFormValidationPage;

import net.thucydides.core.annotations.Step;

public class ColorlibFormValidationSteps {
	ColorlibFormValidationPage colorlibFormValidationPage;

	@Step
	public void diligenciarFormulario(List<List<String>> data, int i) {
		colorlibFormValidationPage.required(data.get(i).get(0).trim());
		colorlibFormValidationPage.select(data.get(i).get(1).trim());
		colorlibFormValidationPage.multipleSelect(data.get(i).get(2).trim());
		colorlibFormValidationPage.multipleSelect(data.get(i).get(3).trim());
		colorlibFormValidationPage.url(data.get(i).get(4).trim());
		colorlibFormValidationPage.email(data.get(i).get(5).trim());
		colorlibFormValidationPage.password(data.get(i).get(6).trim());
		colorlibFormValidationPage.confirmPassword(data.get(i).get(7).trim());
		colorlibFormValidationPage.minimun(data.get(i).get(8).trim());
		colorlibFormValidationPage.maximun(data.get(i).get(9).trim());
		colorlibFormValidationPage.number(data.get(i).get(10).trim());
		colorlibFormValidationPage.ip(data.get(i).get(11).trim());
		colorlibFormValidationPage.date(data.get(i).get(12).trim());
		colorlibFormValidationPage.dateEarlier(data.get(i).get(13).trim());
		colorlibFormValidationPage.validar();
	}
	
	@Step
	public void verificarFormSinErrores() {
		colorlibFormValidationPage.formSinErrores();
	}
	
	@Step
	public void verificarFormConnErrores() {
		colorlibFormValidationPage.formConErrores();
	}

}
