package com.choucair.cursopom.pageobjects;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.openqa.selenium.Keys;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ColorlibFormValidationPage extends PageObject{

	@FindBy(id = "req")
	public WebElementFacade txtRequired;

	@FindBy(id = "sport")
	public WebElementFacade cmbSelect;

	@FindBy(id = "sport2")
	public WebElementFacade cmbMultipleSelect;

	@FindBy(id = "url1")
	public WebElementFacade txtUrl;

	@FindBy(id = "email1")
	public WebElementFacade txtEmail;

	@FindBy(id = "pass1")
	public WebElementFacade txtPassword;

	@FindBy(id = "pass2")
	public WebElementFacade txtConfirmPassword;

	@FindBy(id = "minsize1")
	public WebElementFacade txtMinimum;

	@FindBy(id = "maxsize1")
	public WebElementFacade txtMaximum;

	@FindBy(id = "number2")
	public WebElementFacade txtNumber;

	@FindBy(id = "ip")
	public WebElementFacade txtIP;

	@FindBy(id = "date3")
	public WebElementFacade txtDate;

	@FindBy(id = "past")
	public WebElementFacade txtDateEarlier;

	@FindBy(id = "//*[@id='popup-validation']/div[14]/input")
	public WebElementFacade btnValidate;

	//@FindBy(xpath = "(//DIV[@class='formErrorContent'])[1]")
	@FindBy(className = "formErrorContent")
	public WebElementFacade globoInformativo;

	public void required(String required) {
		txtRequired.click();
		txtRequired.clear();
		txtRequired.sendKeys(required);
	}

	public void select(String select) {
		cmbSelect.click();
		if (select.equals("")) {
			System.out.println("prueba donde no se selecciona el select");
			cmbMultipleSelect.sendKeys(Keys.ENTER);
		}else {
			cmbSelect.selectByVisibleText(select);
		}
	}

	public void multipleSelect (String select) {
		if (select.equals("")) {
			System.out.println("prueba donde no se selecciona el Multiple select");
			cmbMultipleSelect.selectByVisibleText("Choose a sport");
		}else {
			cmbMultipleSelect.selectByVisibleText(select);
		}
	}

	public void url(String url) {
		txtUrl.click();
		txtUrl.clear();
		txtUrl.sendKeys(url);
	}

	public void email(String email) {
		txtEmail.click();
		txtEmail.clear();
		txtEmail.sendKeys(email);
	}

	public void password(String password) {
		txtPassword.click();
		txtPassword.clear();
		txtPassword.sendKeys(password);
	}

	public void confirmPassword(String password) {
		txtConfirmPassword.click();
		txtConfirmPassword.clear();
		txtConfirmPassword.sendKeys(password);
	}

	public void minimun(String minimun) {
		txtMinimum.click();
		txtMinimum.clear();
		txtMinimum.sendKeys(minimun);
	}

	public void maximun(String maximun) {
		txtMaximum.click();
		txtMaximum.clear();
		txtMaximum.sendKeys(maximun);
	}

	public void number(String number) {
		txtNumber.click();
		txtNumber.clear();
		txtNumber.sendKeys(number);
	}

	public void ip(String ip) {
		txtIP.click();
		txtIP.clear();
		txtIP.sendKeys(ip);
	}

	public void date(String date) {
		txtDate.click();
		txtDate.clear();
		txtDate.sendKeys(date);
	}

	public void dateEarlier(String dateEarlier) {
		txtDateEarlier.click();
		txtDateEarlier.clear();
		txtDateEarlier.sendKeys(dateEarlier);
	}

	public void validar() {
		System.out.println("Click en Validar");
		txtUrl.click();
	}

	public void formSinErrores() {
		assertThat(globoInformativo.isCurrentlyVisible(), is(false));
	}

	public void formConErrores() {
		assertThat(globoInformativo.isCurrentlyVisible(), is(true));
	}

}
