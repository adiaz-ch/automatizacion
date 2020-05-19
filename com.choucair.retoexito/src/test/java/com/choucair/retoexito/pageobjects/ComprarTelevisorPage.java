package com.choucair.retoexito.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ComprarTelevisorPage extends PageObject{
	
	@FindBy(xpath = "/html/body/div[2]/div/div[1]/div/div/div/div[2]/div/div[4]/div/section/div/div[2]/div/div/div/div/div[2]/div/div/div[1]/div/div/div[3]/div/div/div/div/div/button")
	public WebElementFacade btnLoQuiero;
	
	@FindBy(className = "exito-header-3-x-minicartButtonMobile")
	public WebElementFacade btnCarritoCompras;

	public void filtrar(String filtro) {
		String id = "z"+filtro.replaceAll("\\s+", "-").toLowerCase();
		WebDriver driver = getDriver();
		WebElement element = driver.findElement(By.id(id));
		element.click();
	}
	
	public void imprimirResultados() {
		WebDriver driver = getDriver();
		List<WebElement> elements = driver.findElements(By.className("search-result-exito-product-summary-name-product"));
		System.out.println("Resultados de la busqueda de televisores: ");
		for (WebElement element : elements) {
			System.out.println(element.getText());
		}
	}

	public void seleccionarPrimerTelevisor() {
		WebDriver driver = getDriver();
		List<WebElement> elements = driver.findElements(By.className("vtex-product-summary-2-x-clearLink"));
		elements.get(0).click();
	}

	public String agregarAlcarrito() {
		WebDriver driver = getDriver();
		String producto = driver.findElement(By.className("vtex-breadcrumb-1-x-term")).getText();
		btnLoQuiero.click();
		return producto;
	}

	public void abrirrCarrito() {
		btnCarritoCompras.click();
	}

}
