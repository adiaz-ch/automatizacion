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
	
	public void required(String required) {
		txtRequired.click();
		txtRequired.clear();
		txtRequired.sendKeys(required);
	}
	
	@FindBy(id = "sport")
	public WebElementFacade cmbSelect;
	
	public void select(String select) {
		cmbSelect.click();
		if (select.equals("")) {
			System.out.println("prueba donde no se selecciona el select");
			cmbMultipleSelect.sendKeys(Keys.ENTER);
		}else {
			cmbSelect.selectByVisibleText(select);
		}
	}
	
	@FindBy(id = "sport2")
	public WebElementFacade cmbMultipleSelect;
	
	public void multipleSelect (String select) {
		if (select.equals("")) {
			System.out.println("prueba donde no se selecciona el Multiple select");
			cmbMultipleSelect.selectByVisibleText("Choose a sport");
		}else {
			cmbMultipleSelect.selectByVisibleText(select);
		}
	}
	
	@FindBy(id = "url1")
	public WebElementFacade txtUrl;
	
	public void url(String url) {
		txtUrl.click();
		txtUrl.clear();
		txtUrl.sendKeys(url);
	}
	
	@FindBy(id = "email1")
	public WebElementFacade txtEmail;
	
	public void email(String email) {
		txtEmail.click();
		txtEmail.clear();
		txtEmail.sendKeys(email);
	}
	
	@FindBy(id = "pass1")
	public WebElementFacade txtPassword;
	
	public void password(String password) {
		txtPassword.click();
		txtPassword.clear();
		txtPassword.sendKeys(password);
	}
	
	@FindBy(id = "pass2")
	public WebElementFacade txtConfirmPassword;
	
	public void confirmPassword(String password) {
		txtConfirmPassword.click();
		txtConfirmPassword.clear();
		txtConfirmPassword.sendKeys(password);
	}
	
	@FindBy(id = "minsize1")
	public WebElementFacade txtMinimum;
	
	public void minimun(String minimun) {
		txtMinimum.click();
		txtMinimum.clear();
		txtMinimum.sendKeys(minimun);
	}
	
	@FindBy(id = "maxsize1")
	public WebElementFacade txtMaximum;
	
	public void maximun(String maximun) {
		txtMaximum.click();
		txtMaximum.clear();
		txtMaximum.sendKeys(maximun);
	}
	
	@FindBy(id = "number2")
	public WebElementFacade txtNumber;
	
	public void number(String number) {
		txtNumber.click();
		txtNumber.clear();
		txtNumber.sendKeys(number);
	}
	
	@FindBy(id = "ip")
	public WebElementFacade txtIP;
	
	public void ip(String ip) {
		txtIP.click();
		txtIP.clear();
		txtIP.sendKeys(ip);
	}
	
	@FindBy(id = "date3")
	public WebElementFacade txtDate;
	
	public void date(String date) {
		txtDate.click();
		txtDate.clear();
		txtDate.sendKeys(date);
	}
	
	@FindBy(id = "past")
	public WebElementFacade txtDateEarlier;
	
	public void dateEarlier(String dateEarlier) {
		txtDateEarlier.click();
		txtDateEarlier.clear();
		txtDateEarlier.sendKeys(dateEarlier);
	}

	@FindBy(id = "//*[@id='popup-validation']/div[14]/input")
	public WebElementFacade btnValidate;
	
	public void validar() {
		System.out.println("Click en Validar");
		txtUrl.click();
	}
	
	//@FindBy(xpath = "(//DIV[@class='formErrorContent'])[1]")
	@FindBy(className = "formErrorContent")
	public WebElementFacade globoInformativo;
	
	public void formSinErrores() {
		assertThat(globoInformativo.isCurrentlyVisible(), is(false));
	}
	
	public void formConErrores() {
		assertThat(globoInformativo.isCurrentlyVisible(), is(true));
	}
	
}
