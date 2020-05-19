package com.choucair.retoexito.pageobjects;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.pages.PageObject;

public class CarritoDeComprasPage extends PageObject{
	
	public void verificarCarrito(String producto) {
		WebDriver driver = getDriver();
		List<WebElement> elements = driver.findElements(By.className("exito-checkout-product-name"));
		System.out.println("producto en al carrito: "+elements.get(0).getText());
		assertEquals(producto, elements.get(0).getText());
	}

}
