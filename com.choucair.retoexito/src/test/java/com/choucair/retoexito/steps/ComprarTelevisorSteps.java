package com.choucair.retoexito.steps;

import java.util.List;

import com.choucair.retoexito.pageobjects.CarritoDeComprasPage;
import com.choucair.retoexito.pageobjects.ComprarTelevisorPage;
import com.choucair.retoexito.pageobjects.HomeExitoPage;

import net.thucydides.core.annotations.Step;

public class ComprarTelevisorSteps {
	
	HomeExitoPage homeExitoPage;
	ComprarTelevisorPage comprarTelevisorPage;
	CarritoDeComprasPage carritoDeComprasPage;
	
	String producto;
	
	@Step
	public void buscarTelevisor(List<List<String>> data, int i) {
		homeExitoPage.open();
		homeExitoPage.buscarTelevisor();
		homeExitoPage.verificarBusqueda();
		comprarTelevisorPage.filtrar(data.get(i).get(0).trim());
		try {Thread.sleep(10000);}catch (InterruptedException e) {}
		comprarTelevisorPage.filtrar(data.get(i).get(1).trim());
		try {Thread.sleep(20000);}catch (InterruptedException e) {}
		comprarTelevisorPage.filtrar(data.get(i).get(2).trim());
		try {Thread.sleep(3000);}catch (InterruptedException e) {}
		comprarTelevisorPage.imprimirResultados();
	}

	@Step
	public void seleccionarTelevisor() {
		comprarTelevisorPage.seleccionarPrimerTelevisor();
		try {Thread.sleep(5000);}catch (InterruptedException e) {}
	}

	@Step
	public void agregarAlCarrito() {
		producto = comprarTelevisorPage.agregarAlcarrito();
		try {Thread.sleep(5000);}catch (InterruptedException e) {}
		System.out.println("producto agregado al carrito: "+producto);
	}

	@Step
	public void verificarCarrito() {
		comprarTelevisorPage.abrirrCarrito();
		carritoDeComprasPage.verificarCarrito(producto);
	}

}
