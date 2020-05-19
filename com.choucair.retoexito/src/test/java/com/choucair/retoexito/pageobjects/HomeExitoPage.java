package com.choucair.retoexito.pageobjects;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.Keys;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.exito.com/")
public class HomeExitoPage extends PageObject{

	String palabraBusqueda = "Televisor";
	
	@FindBy(id = "downshift-0-input")
	public WebElementFacade campoBusqueda;
	
	@FindBy(xpath = "/html/body/div[2]/div/div[1]/div/div[2]/div/div[5]/section/div[2]/div/div[1]/div/div/div")
	public WebElementFacade migaPan;
	
	public void buscarTelevisor() {
		campoBusqueda.click();
		campoBusqueda.clear();
		campoBusqueda.sendKeys(palabraBusqueda);
		campoBusqueda.sendKeys(Keys.ENTER);
	}
	
	public void verificarBusqueda() {
		//System.out.println("Miga de pan: "+migaPan.getText());
		try {
			Thread.sleep(3000);
		}catch (InterruptedException e) {}
		assertEquals(palabraBusqueda, migaPan.getText());
	}
}
