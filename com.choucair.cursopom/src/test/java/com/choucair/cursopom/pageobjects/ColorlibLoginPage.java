package com.choucair.cursopom.pageobjects;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

import org.openqa.selenium.WebDriver;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://colorlib.com/polygon/metis/login.html")
public class ColorlibLoginPage extends PageObject {
	
	@FindBy(xpath = "//*[@id='login']/form/input[1]")
	public WebElementFacade InputUsername;
	
	@FindBy(xpath = "//*[@id='login']/form/input[2]")
	public WebElementFacade InputPassword;
	
	@FindBy(xpath = "//*[@id='login']/form/button")
	public WebElementFacade btnSingIn;
	
	@FindBy(id = "bootstrap-admin-template")
	public WebElementFacade tituloHome;

	public void ingresarDatos(String usuario, String clave) {
		WebDriver driver= getDriver();
		driver.manage().window().maximize();
		InputUsername.sendKeys(usuario);
		InputPassword.sendKeys(clave);
		btnSingIn.click();
	}

	public void verificarAutenticacion() {
		String tituloEsperado = "Bootstrap-Admin-Template";
		String tituloColorlib = tituloHome.getText();
		assertThat(tituloColorlib, containsString(tituloEsperado));
	}	

}
