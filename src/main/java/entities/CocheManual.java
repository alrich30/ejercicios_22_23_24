package entities;

public class CocheManual extends Coche {

    //Atributos
    public int marchaActual;
    

    //metodos heredados de Coche
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
    @Override
    public void abrirPuertas(Coche coche) {
        if (!coche.getPuertaAbiertas())
            System.out.println("Se han abierto las puertas");
        else {
            System.out.println("Las puertas ya estaban abiertas");
        }
    }


    //Método particular de la clase
    public void cambiarMarchaManual(int nuevaMarcha){
        if (nuevaMarcha >= 1 && nuevaMarcha <= 6){
            marchaActual = nuevaMarcha;
            System.out.println("Cambiando a la marcha " + nuevaMarcha + " en el coche manual");
        } else {
            System.out.println("La marcha seleccionada no es valida para el coche manual");
        }
    }
}
