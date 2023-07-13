package entities;

import entities.Coche;

public class CocheAutomatico extends Coche{

    //Atributos
    public int marchaActual;


    //métodos abstractos heredados de Clase padre Coche
    @Override
    public void abrirPuertas(Coche coche) {
        if (!coche.getPuertaAbiertas())
            puertaAbiertas = true;
        else {
            System.out.println("Las puertas ya estaban abiertas");
        }
        System.out.println("Se han abierto las puertas");
    }
    @Override
    public void acelerar(int kmXHora) {
        velocidad += kmXHora;
    }
    @Override
    public int getVelocidadActual() {
        return velocidad;
    }
    @Override
    public String prenderAireAcondicionado() {
        return "Aire acondicionado prendido";
    }


    //Metodo propio de la clase
    public void cambiarMarchaAutomatica(int nuevaMarcha){
        if (nuevaMarcha >= 1 && nuevaMarcha <= 5){
            marchaActual = nuevaMarcha;
            System.out.println("Cambiando a la marcha " + nuevaMarcha + " en el coche automatico");
        } else {
            System.out.println("La marcha seleccionada no es valida para el coche automatico");
        }
    }
}
