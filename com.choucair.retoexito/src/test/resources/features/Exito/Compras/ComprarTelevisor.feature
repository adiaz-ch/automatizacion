#Author: adiaz@choucairtesting.com
@Regresion
Feature: Realizar la compra de un televisor
  El usuario debe poder realizar la compra de un televisor
  de entre 44 a 49 pulgadas, marca LG y Resolución UHD-4K

  @CasoExitoso
  Scenario: Comprar televisor
    Given Realizo busqueda de televisores
    |	Pulgadas						|	Marca	|	Resolucion	|
    |	50 pulgadas					|	LG		|	UHD-4K			|
    And Selecciono el televisor a comprar
    When Agrego al carrito de compras
    Then Verifico el carrito de compras