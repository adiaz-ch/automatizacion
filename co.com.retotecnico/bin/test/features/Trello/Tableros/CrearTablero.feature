#Author: adiaz@choucaiartesting.com
@Regresion
Feature: Crear trablero de trabajo en Trello
  El usuario debe poder realizar la creacion de tableros en Trello.

  @CasoExitoso
  Scenario Outline: Crear tablero
    Given Inicio sesion en Trello con el correo <Correo> y el password <Password>
    And Selecciono crear un tablero nuevo
    When Diligencio el nombre <Nombre> del nuevo tablero
    Then Verifico la creacion del tablero <Nombre>

    Examples: 
      |	Correo											|	Password			| Nombre		|
      |	pruebatrello1@yopmail.com		|	123456789			|	prueba1		|
      |	pruebatrello2@yopmail.com		|	PSWCHTRELLO+1	|	prueba2		|
      |	alixjohanadiaz@hotmail.com	|	PSWCHTRELLO		|	Prueba3		|
      #|	pruebatrello1@yopmail.com		|	PSWCHTRELLO+1	| Tablero1	|
      #|	pruebatrello1@yopmail.com		| PSWCHTRELLO+1	|	Tablero2	|
      #|	pruebatrello1@yopmail.com		| PSWCHTRELLO+1	|	Tablero3	|