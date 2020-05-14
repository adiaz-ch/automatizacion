package co.com.retotecnico.pages;

import static org.junit.Assert.assertEquals;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://trello.com/es/signup")
public class RegistroTrelloPage extends PageObject{
	
	@FindBy(id = "email")
	public WebElementFacade txtCorreo;
	
	@FindBy(id = "signup-submit")
	public WebElementFacade btnContinuar;
	
	@FindBy(id ="displayName")
	public WebElementFacade txtNombre;

	@FindBy(id = "password")
	public WebElementFacade txtPassword;
	
	@FindBy(id = "signup-submit")
	public WebElementFacade btnRegistrarse;
	
	@FindBy(xpath = "//*[@id='5031b081-0ce6-4f24-af1a-ffcb369df916']/section/h1/span")
	public WebElementFacade mnsBienvenida;
	
	public void correo(String correo) {
		txtCorreo.click();
		txtCorreo.clear();
		txtCorreo.sendKeys(correo);
	}
	
	public void continuar() {
		btnContinuar.click();
	}
	
	public void nombre(String nombre) {
		txtNombre.click();
		txtNombre.clear();
		txtNombre.sendKeys(nombre);
	}
	
	public void password(String password) {
		txtPassword.click();
		txtPassword.clear();
		txtPassword.sendKeys(password);
	}
	
	public void registrarse() {
		btnRegistrarse.click();
	}
	
	public void verificarRegistro() {
		try {
			Thread.sleep(3000);
		}catch (InterruptedException e) {}
		String tituloEsperado = "¡Bienvenido a Trello!";
		assertEquals(tituloEsperado, mnsBienvenida.getText());
	}
}
