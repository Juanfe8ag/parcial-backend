# ECICredit Parcial CVDS 2025-01 #

## Arquitectura ##

El proyecto esta conformado por  2 repositorios, 2 servicios (usuario y factura) y 2 controladores.

Las tecnologías que se usaron fueron Spring Initializr para el scaffolding del proyecto, MongoDB para la base de datos conectada al proyecto y
Azure para el despliegue del proyecto.

## ¿Como funciona el proyecto? ##
Los endpoints iniciados en los controladores:

Para Factura se tiene un metodo POST para crear las facturas con el email, la lista de productos, el monto ingresado para validarlo y la fecha.
Un metodo GET para obtener todas las facturas que esten relacionadas a un usuario (email).
Y por ultimo, un PUT para actualizar la lista de productos por si hubo un error al momento de escogerlos.

Para User se tiene un metodo POST de creacion del usuario y un metodo GET para obtener al usuario y sus atributos, como el email, quien es con el que esta ligado todo.


Para el despliegue, Azure dio esta URL como domain:


ecicredit-parcial-axajg3ayhab9dxf7.canadacentral-01.azurewebsites.net

## Modelo de arquitectura en Astah ##
![Astah Model.png](util%2FAstah%20Model.png)
![Modelo arquitectura.png](util%2FModelo%20arquitectura.png)