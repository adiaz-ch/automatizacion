package co.com.retotecnico.steps;

import java.util.List;

import co.com.retotecnico.pages.RegistroTrelloPage;
import net.thucydides.core.annotations.Step;

public class RegistroTrelloSteps {
	
	RegistroTrelloPage registroTrelloPage;

	@Step
	public void crearCuenta(String correo) {
		registroTrelloPage.open();
		registroTrelloPage.correo(correo);
		registroTrelloPage.continuar();
	}
	
	@Step
	public void diligenciarFormulario(List<List<String>> data, int i) {
		registroTrelloPage.nombre(data.get(i).get(0).trim());
		registroTrelloPage.password(data.get(i).get(1).trim());
		registroTrelloPage.registrarse();
	}

	public void verificarCreacionCuenta() {
		registroTrelloPage.verificarRegistro();
	}

}
