#Author: adiaz@choucaiartesting.com
@Regresion
Feature: Registro en Trello
  El usuario debe poder realizar el registro de una cuenta nueva
  en la aplicacion Trello.

	@CasoExitoso
  Scenario: Registro exitoso en Trello
    Given Ingreso a la opcion crea tu cuenta con el correo "pruebatrello2@yopmail.com"
    When Diligencio el formulario de registro
    | Nombre										|	Password			|
    |	Alix Johana Diaz Grisales	|	PSWCHTRELLO+1	|
    Then Verifico la creacion de la cuenta