package com.choucair.retoexito.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ComprarTelevisorPage extends PageObject{
	
	@FindBy(xpath = "")
	public WebElementFacade boton;

	public void filtrar(String filtro) {
		String id = "z"+filtro.replaceAll("\\s+", "-").toLowerCase();
		WebDriver driver = getDriver();
		WebElement element = driver.findElement(By.id(id));
		element.click();
	}
	
	public void imprimirResultados() {
		WebDriver driver = getDriver();
		List<WebElement> elements = driver.findElements(By.className("search-result-exito-product-summary-name-product"));
		for (WebElement element : elements) {
			System.out.println(element.getText());
		}
	}

	public void seleccionarPrimerTelevisor() {
		WebDriver driver = getDriver();
		List<WebElement> elements = driver.findElements(By.className("vtex-product-summary-2-x-clearLink"));
		elements.get(0).click();
	}

	public void agregarAlcarrito() {
		
	}

	public void verificarCarrito() {
		
	}

}
