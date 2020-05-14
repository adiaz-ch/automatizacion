#Author: adiaz@choucaiartesting.com
@Regresion
Feature: Formulario Popup Validation
  El usuario debe poder ingresar al formulario de los datos requeridos.
  cada campo del formulario realiza validaciones de obligatoriedad,
  longitud y formato, el sistema debe presentar las validaciones respectivas
  para cada campo a través de un globo informativo.
  
  Background: Pasos comunes
  Given Autentico en Colorlib con el usuario "demo" y la clave "demo"
  And Ingreso a la funcionalidad Forms Validation

  @CasoExitoso
  Scenario: Diligenciamiento exitoso del formulario Popup Validation,
  					no se presenta ningún mensaje de validación.
    When Diligencio formulario Popup Validation
    |	Required	|	Select	|	MultSelect	|	MultSelect2	|	Url										|	Email							|	Password	|	Password2	|	Min			|	Max			|	Number	|	IP					|	Date				|	DateEarlier	|
	  |	Valor1		|	Golf		|	Tennis			|	Golf				|	http://www.valor1.com	|	valor1@gmail.com	|	valor1		|	valor1		|	123456	|	123456	|	-99.99	|	200.200.5.4	|	2018-01-22	|	2012/09/12	|
    Then Verifico ingreso exitoso

@CasoAlterno
  Scenario Outline: Diligenciamiento con errores del formulario Popup Validation,
  									se presenta globo informativo indicando error en el diligenciamiento de alguno de los campos.
    When Diligencio formulario Popup Validation
    |	Required		|	Select		|	MultSelect		|	MultSelect2		|	Url		|	Email		|	Password		|	Password2		|	Min		|	Max		|	Number		|	IP		|	Date		|	DateEarlier		|
    |	<Required>	|	<Select>	|	<MultSelect>	|	<MultSelect2>	|	<Url>	|	<Email>	|	<Password>	|	<Password2>	|	<Min>	|	<Max>	|	<Number>	|	<IP>	|	<Date>	|	<DateEarlier>	|
    Then Verificar que se presente globo informativo de validacion
    
    Examples: 
			|	Required	|	Select	|	MultSelect	|	MultSelect2	|	Url										|	Email							|	Password	|	Password2	|	Min			|	Max			|	Number	|	IP					|	Date				|	DateEarlier	|
	    |						|	Golf		|	Tennis			|	Golf				|	http://www.valor1.com	|	valor1@gmail.com	|	valor1		|	valor1		|	123456	|	123456	|	-99.99	|	200.200.5.4	|	2018-01-22	|	2012/09/12	|
	    |	Valor1		|					|	Tennis			|	Golf				|	http://www.valor1.com	|	valor1@gmail.com	|	valor1		|	valor1		|	123456	|	123456	|	-99.99	|	200.200.5.4	|	2018-01-22	|	2012/09/12	|
	    |	Valor1		|	Golf		|							|							|	http://www.valor1.com	|	valor1@gmail.com	|	valor1		|	valor1		|	123456	|	123456	|	-99.99	|	200.200.5.4	|	2018-01-22	|	2012/09/12	|
	    |	Valor1		|	Golf		|	Tennis			|	Golf				|												|	valor1@gmail.com	|	valor1		|	valor1		|	123456	|	123456	|	-99.99	|	200.200.5.4	|	2018-01-22	|	2012/09/12	|
	    |	Valor1		|	Golf		|	Tennis			|	Golf				|	http://www.valor1.com	|										|	valor1		|	valor1		|	123456	|	123456	|	-99.99	|	200.200.5.4	|	2018-01-22	|	2012/09/12	|
	    |	Valor1		|	Golf		|	Tennis			|	Golf				|	http://www.valor1.com	|	valor1@gmail.com	|						|	valor1		|	123456	|	123456	|	-99.99	|	200.200.5.4	|	2018-01-22	|	2012/09/12	|
	    |	Valor1		|	Golf		|	Tennis			|	Golf				|	http://www.valor1.com	|	valor1@gmail.com	|	valor1		|						|	123456	|	123456	|	-99.99	|	200.200.5.4	|	2018-01-22	|	2012/09/12	|
	    |	Valor1		|	Golf		|	Tennis			|	Golf				|	http://www.valor1.com	|	valor1@gmail.com	|	valor1		|	valor1		|					|	123456	|	-99.99	|	200.200.5.4	|	2018-01-22	|	2012/09/12	|
	    |	Valor1		|	Golf		|	Tennis			|	Golf				|	http://www.valor1.com	|	valor1@gmail.com	|	valor1		|	valor1		|	123456	|	1234567	|	-99.99	|	200.200.5.4	|	2018-01-22	|	2012/09/12	|
	    |	Valor1		|	Golf		|	Tennis			|	Golf				|	http://www.valor1.com	|	valor1@gmail.com	|	valor1		|	valor1		|	123456	|	123456	|					|	200.200.5.4	|	2018-01-22	|	2012/09/12	|
	    |	Valor1		|	Golf		|	Tennis			|	Golf				|	http://www.valor1.com	|	valor1@gmail.com	|	valor1		|	valor1		|	123456	|	123456	|	-99.99	|							|	2018-01-22	|	2012/09/12	|
	    |	Valor1		|	Golf		|	Tennis			|	Golf				|	http://www.valor1.com	|	valor1@gmail.com	|	valor1		|	valor1		|	123456	|	123456	|	-99.99	|	200.200.5.4	|							|	2012/09/12	|
	    |	Valor1		|	Golf		|	Tennis			|	Golf				|	http://www.valor1.com	|	valor1@gmail.com	|	valor1		|	valor1		|	123456	|	123456	|	-99.99	|	200.200.5.4	|	2018-01-22	|	2012/09/14	|