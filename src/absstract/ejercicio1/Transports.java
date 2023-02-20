package absstract.ejercicio1;

public abstract class Transports {
    protected String identificador;
    protected double velocidadActual;

    public Transports(String identificador, double velocidadActual) {
        this.identificador = identificador;
        this.velocidadActual = velocidadActual;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public double getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(double velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    public abstract int calculaTempsDistancia(int velocidadActual, int distancia);
}
