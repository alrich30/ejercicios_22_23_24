package entities;

import entities.Coche;
import entities.CocheAutomatico;
import entities.CocheManual;

public class Main {
    public static void main(String[] args) {

        CocheAutomatico cocheAutomatico = new CocheAutomatico();
        cocheAutomatico.setModelo("Toyota Camry");
        System.out.println(cocheAutomatico.getModelo());

        cocheAutomatico.cambiarMarchaAutomatica(5);

        Coche cocheManual = new CocheManual();
        cocheManual.setPuertaAbiertas(true);
        cocheManual.abrirPuertas(cocheManual);

        cocheManual.acelerar(50);
        cocheManual.acelerar(50);
        System.out.println(cocheManual.getVelocidadActual());

        Coche cocheAutomatico2 = new CocheAutomatico();
        cocheAutomatico2.setVelocidad(100);
        cocheAutomatico2.acelerar(50);
        cocheAutomatico2.acelerar(50);
        System.out.println(cocheAutomatico2.getVelocidadActual());

    }
}