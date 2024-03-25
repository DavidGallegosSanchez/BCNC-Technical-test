# Project Title
BCNC Technical test

## Description

Documentation provided for the performance of the test:

En la base de datos de comercio electrónico de la compañía disponemos de la tabla PRICES que refleja el precio final (pvp) y la tarifa que aplica a un producto de una cadena entre unas fechas determinadas. A continuación se muestra un ejemplo de la tabla con los campos relevantes:

PRICES
| BRAND_ID | START_DATE            | END_DATE              | PRICE_LIST | PRODUCT_ID | PRIORITY | PRICE | CURR |
|----------|-----------------------|-----------------------|------------|------------|----------|-------|------|
| 1        | 2020-06-14-00.00.00  | 2020-12-31-23.59.59  | 1          | 35455      | 0        | 35.50 | EUR  |
| 1        | 2020-06-14-15.00.00  | 2020-06-14-18.30.00  | 2          | 35455      | 1        | 25.45 | EUR  |
| 1        | 2020-06-15-00.00.00  | 2020-06-15-11.00.00  | 3          | 35455      | 1        | 30.50 | EUR  |
| 1        | 2020-06-15-16.00.00  | 2020-12-31-23.59.59  | 4          | 35455      | 1        | 38.95 | EUR  |

 
Campos: 
 
BRAND_ID: foreign key de la cadena del grupo (1 = ZARA).
START_DATE , END_DATE: rango de fechas en el que aplica el precio tarifa indicado.
PRICE_LIST: Identificador de la tarifa de precios aplicable.
PRODUCT_ID: Identificador código de producto.
PRIORITY: Desambiguador de aplicación de precios. Si dos tarifas coinciden en un rago de fechas se aplica la de mayor prioridad (mayor valor numérico).
PRICE: precio final de venta.
CURR: iso de la moneda.
 
Se pide:
 
Construir una aplicación/servicio en SpringBoot que provea una end point rest de consulta  tal que:
 
Acepte como parámetros de entrada: fecha de aplicación, identificador de producto, identificador de cadena.
Devuelva como datos de salida: identificador de producto, identificador de cadena, tarifa a aplicar, fechas de aplicación y precio final a aplicar.
 
Se debe utilizar una base de datos en memoria (tipo h2) e inicializar con los datos del ejemplo, (se pueden cambiar el nombre de los campos y añadir otros nuevos si se quiere, elegir el tipo de dato que se considere adecuado para los mismos).
              
Desarrollar unos test al endpoint rest que  validen las siguientes peticiones al servicio con los datos del ejemplo:
                                                                                       
Test 1: petición a las 10:00 del día 14 del producto 35455   para la brand 1 (ZARA)

Test 2: petición a las 16:00 del día 14 del producto 35455   para la brand 1 (ZARA)

Test 3: petición a las 21:00 del día 14 del producto 35455   para la brand 1 (ZARA)

Test 4: petición a las 10:00 del día 15 del producto 35455   para la brand 1 (ZARA)

Test 5: petición a las 21:00 del día 16 del producto 35455   para la brand 1 (ZARA)
 
 
Se valorará:
 
Diseño y construcción del servicio.
Calidad de Código.
Resultados correctos en los test.

## Getting Started

### Notes
I implemeted two methods to do the same, one of them as GET to send the conditions by url and the other one as a POST to send the condition as a @RequestBody.
Please, see the email to the recuitment because I added images about the coverage, test and hexagonal Architecture project diagram.

### Dependencies

* h2database - H2 is a relational database management system programmed in Java. It can be embedded in Java applications or run in client-server mode.
* projectlombok - Project Lombok is a java library that automatically plugs into your editor and build tools, spicing up your java.
* log4j - Log4j is an open source library developed in Java by the Apache Software Foundation that allows software developers to write log messages, the purpose of which is to record a particular transaction at runtime.
* junit - JUnit is a set of libraries created by Erich Gamma and Kent Beck that are used in programming for unit testing Java applications.

### Installing

* Download the repository
```
git clone 
```

### Executing program

* Execute the next maven command in the path project to generate a executable file
```
mvn package
```
The executable will be created in ...\target\Vodafone-0.0.1-SNAPSHOT.jar.original. 

You will be able to double click on the icon Vodafone-0.0.1-SNAPSHOT.jar to run the application.

You will also be able to run the application from IntelliJ or any other IDE and lifting the application.

Once the application is up you can run the urls mentioned above to see the results or from a development IDE launching the tests.


http://localhost:8080/api/get_product_by_condionts?applicationDate=2020-06-14T10:00:00.000&productIdentifier=35455&brandIdentifier=1

http://localhost:8080/api/get_product_by_condionts?applicationDate=2020-06-14T16:00:00.000&productIdentifier=35455&brandIdentifier=1

http://localhost:8080/api/get_product_by_condionts?applicationDate=2020-06-14T21:00:00.000&productIdentifier=35455&brandIdentifier=1

http://localhost:8080/api/get_product_by_condionts?applicationDate=2020-06-15T20:00:00.000&productIdentifier=35455&brandIdentifier=1

http://localhost:8080/api/get_product_by_condionts?applicationDate=2020-06-16T21:00:00.000&productIdentifier=35455&brandIdentifier=1


## Authors

Contributors names and contact info

David Gallegos Sánchez 
[dgallegos1985@gmail.com]

## Version History

* 0.1
    * Initial Release
