package co.com.MAKAIA;

import java.util.ArrayList;

public class Clima {
    private double temperatura;
    private double humedad;
    private ArrayList<Observador> observadores;

    public Clima(){
        observadores = new ArrayList<>();
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public void setHumedad(double humedad) {
        this.humedad = humedad;
    }

    public void registrarObservador(Observador observador){
        if(observadores.add(observador)){
            System.out.println("Observador " + observador + " agregado.");
        } else{
            System.out.println("El observador " + observador + " no pudo ser " +
                    "agregado.");
        }
    }

    public void retirarObservador(Observador observador){
        if(observadores.remove(observador)){
            System.out.println("Observador " + observador + " removido.");
        } else{
            System.out.println("El observador " + observador + " no pudo ser " +
                    "removido.");
        }

    }

    public void actualizarClima(double temperatura, double humedad){
        this.setTemperatura(temperatura);
        this.setHumedad(humedad);
        notificar();
    }

    public void notificar(){
        for (Observador observador: observadores){
            observador.actualizar(this.temperatura, this.humedad);
        }
    }
}
