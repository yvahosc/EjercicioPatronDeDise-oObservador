# Ejercicio patrón de diseño observador
## Desarrollo ejercicio de patrón de diseño observador dentro del desarrollo del BootCamp de desarrollo web BackEnd de MAKAIA.

### Repositorio respuesta al taller planteado:
#### En una estación meteorológica, se desea implementar un sistema de monitoreo de clima que permita a diferentes dispositivos móviles registrarse como observadores y recibir actualizaciones en tiempo real sobre los cambios en las condiciones climáticas. Cada dispositivo móvil debe mostrar la temperatura y la humedad actuales cuando se produzcan cambios en el clima.

#### Implementa el patrón de diseño Observador en Java para resolver este problema. Debes crear las siguientes clases:

* La clase Clima que actuará como el sujeto observable y contendrá los métodos set Temperatura() y set Humedad() para establecer los valores actuales del clima. Esta clase deberá también tener los métodos agregar Observador() y eliminar Observador() para permitir que los dispositivos móviles se registren o se des registren como observadores, respectivamente.
* La interfaz Observador Clima que definirá el método actualizar().
* Una clase Dispositivo Móvil que implemente la interfaz Observador Clima. Esta clase deberá tener un constructor que reciba el nombre del dispositivo móvil y deberá mostrar la temperatura y la humedad actuales en el método actualizar().

#### En el programa principal, crea instancias de diferentes dispositivos móviles y del objeto Clima. Registra los dispositivos móviles como observadores del clima y realiza cambios en la temperatura y la humedad para verificar que los observadores reciban las actualizaciones adecuadas.

#### Recuerda utilizar el patrón de diseño Observador para establecer la relación entre el sujeto observable y los observadores de manera adecuada.
