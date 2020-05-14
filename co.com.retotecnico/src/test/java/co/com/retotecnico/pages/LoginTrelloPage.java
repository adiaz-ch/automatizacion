package co.com.retotecnico.pages;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.openqa.selenium.WebDriver;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://trello.com/login")
public class LoginTrelloPage extends PageObject{
	
	@FindBy(id = "user")
	public WebElementFacade txtCorreo;
	
	@FindBy(id = "password")
	public WebElementFacade txtPassword;
	
	@FindBy(id = "login")
	public WebElementFacade btnLogin;
	
	@FindBy(id = "login-submit")
	public WebElementFacade btnLogin2;
	
	@FindBy(xpath = "//*[@id='header']/div[2]/button[4]/div")
	public WebElementFacade logoUsuario;
	
	public void correo(String correo) {
		WebDriver driver= getDriver();
        driver.manage().window().maximize();
		txtCorreo.click();
		txtCorreo.clear();
		txtCorreo.sendKeys(correo);
	}
	
	public void password(String password) {
		txtPassword.click();
		txtPassword.clear();
		txtPassword.sendKeys(password);
	}
	
	public void iniciarSesion() {
		btnLogin.click();
	}
	
	public void iniciarSesion2() {
		btnLogin2.click();
	}
	
	public void verificarInicioSesion() {
		try {
			Thread.sleep(5000);
		}catch (InterruptedException e) {}
		assertThat(logoUsuario.isCurrentlyVisible(), is(true));
	}

	public boolean campoPassVisible() {
		return txtPassword.isCurrentlyVisible();
	}
	
}
