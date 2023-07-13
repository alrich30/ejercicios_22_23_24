package entities;

abstract class Coche {

    //Atributos

    private String modelo;
    public Boolean puertaAbiertas;
    public int velocidad;
    private String color;




    //Getter y Setter
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public Boolean getPuertaAbiertas() {
        return puertaAbiertas;
    }
    public void setPuertaAbiertas(Boolean puertaAbiertas) {
        this.puertaAbiertas = puertaAbiertas;
    }
    public int getVelocidad() {
        return velocidad;
    }
    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }


    protected abstract void acelerar(int kmXHora);
    protected abstract String prenderAireAcondicionado();
    protected abstract int getVelocidadActual();
    public abstract void abrirPuertas(Coche coche);
}
