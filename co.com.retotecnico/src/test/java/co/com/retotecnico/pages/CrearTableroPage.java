package co.com.retotecnico.pages;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertEquals;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class CrearTableroPage extends PageObject{
	
//	@FindBy(name = "add")
	@FindBy(xpath = "//*[@id='header']/div[1]/button")
	public WebElementFacade btnCrear;
	
	@FindBy(xpath = "//*[@id='chrome-container']/div[1]/div[1]/div/div[2]/div/div[2]/button[1]")
	public WebElementFacade opcCrearTablero;
	
	@FindBy(xpath = "//*[@id='layer-manager-overlay']/div/div/div[1]/div/input")
	public WebElementFacade txtTituloTablero;
	
	@FindBy(xpath = "//*[@id='layer-manager-overlay']/div/div/div[2]/div[2]/button")
	public WebElementFacade btnCrearTablero;
	
	@FindBy(xpath = "//*[@id='content']/div/div[1]/div[1]/div[1]")
	public WebElementFacade tituloTablero;

	public void crearTablero() {
		btnCrear.click();
		opcCrearTablero.click();
	}

	public void ingresarNombreTablero(String nombre) {
		txtTituloTablero.click();
		txtTituloTablero.clear();
		txtTituloTablero.sendKeys(nombre);
		btnCrearTablero.click();
	}

	public void verificarCreacionTablero(String nombre) {
		try {
			Thread.sleep(3000);
		}catch (InterruptedException e) {}
		assertThat(tituloTablero.isCurrentlyVisible(), is(true));
		assertEquals(nombre, tituloTablero.getText());
	}

}
