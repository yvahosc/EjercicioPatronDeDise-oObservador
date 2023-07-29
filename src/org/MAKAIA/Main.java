package org.MAKAIA;

public class Main {

    public static void main(String[] args) {
	    Clima clima = new Clima();
        DispositivoMovil movil1 = new DispositivoMovil("Movil 1");
        DispositivoMovil movil2 = new DispositivoMovil("Movil 2");
        DispositivoMovil movil3 = new DispositivoMovil("Movil 3");

        System.out.println("Actualizando clima sin observadores.");
        clima.actualizarClima(20, 50);
        System.out.println();

        System.out.println("Agregando observadores.");
        clima.registrarObservador(movil1);
        clima.registrarObservador(movil2);
        System.out.println();

        System.out.println("Actualizando clima con dos observadores.");
        clima.actualizarClima(20, 50);
        System.out.println();

        System.out.println("Eliminando observador que no está agregado.");
        clima.retirarObservador(movil3);
        System.out.println();

        System.out.println("Eliminando observador.");
        clima.retirarObservador(movil2);
        System.out.println();

        System.out.println("Actualizando clima con un observador.");
        clima.actualizarClima(22, 20);
        System.out.println();
    }
}
