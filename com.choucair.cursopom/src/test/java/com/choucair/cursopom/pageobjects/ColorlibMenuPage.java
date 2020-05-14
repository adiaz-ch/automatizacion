package com.choucair.cursopom.pageobjects;

import static org.junit.Assert.assertEquals;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ColorlibMenuPage extends PageObject{
	
	@FindBy(xpath = "//*[@id='menu']/li[6]/a")
	public WebElementFacade menuForms;
	
	@FindBy(xpath = "//*[@id='menu']/li[6]/ul/li[2]/a")
	public WebElementFacade submenuFormsValidation;
	
	@FindBy(xpath = "//*[@id='menu']/li[6]/ul/li[1]/a")
	public WebElementFacade submenuFormsGeneral;
	
	@FindBy(xpath = "//*[@id='content']/div/div/div[1]/div/div/header/h5")
	public WebElementFacade tituloFormsValidation;
	
	public void menuFormsValidation() {
		menuForms.click();
		submenuFormsValidation.click();
		String tituloEsperado = "Popup Validation";
		String tituloFormulario = tituloFormsValidation.getText();
		assertEquals(tituloEsperado, tituloFormulario);
	}

}
