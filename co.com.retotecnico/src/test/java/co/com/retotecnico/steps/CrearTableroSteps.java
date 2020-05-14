package co.com.retotecnico.steps;

import co.com.retotecnico.pages.CrearTableroPage;
import co.com.retotecnico.pages.LoginTrelloPage;
import net.thucydides.core.annotations.Step;

public class CrearTableroSteps {
	
	LoginTrelloPage loginTrelloPage;
	CrearTableroPage crearTableroPage;

	@Step
	public void inicioSesionEnTrello(String correo, String password) {
		loginTrelloPage.open();
		loginTrelloPage.correo(correo);
		try {
			Thread.sleep(2000);
		}catch (InterruptedException e) {}
		if (loginTrelloPage.campoPassVisible()) {
			loginTrelloPage.password(password);
			loginTrelloPage.iniciarSesion();
			loginTrelloPage.verificarInicioSesion();
		}else {
			loginTrelloPage.iniciarSesion();
			loginTrelloPage.password(password);
			loginTrelloPage.iniciarSesion2();
			loginTrelloPage.verificarInicioSesion();
		}
	}

	@Step
	public void seleccionarCrearTableroNuevo() {
		crearTableroPage.crearTablero();
	}

	@Step
	public void crearTablero(String nombre) {
		crearTableroPage.ingresarNombreTablero(nombre);
	}

	@Step
	public void verificarCreacionTablero(String nombre) {
		crearTableroPage.verificarCreacionTablero(nombre);
	}

}
