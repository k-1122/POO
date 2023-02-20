package absstract.ejercicio1;

public class Bicicletes extends Transports{
protected String marxes;

    public Bicicletes(String identificador, double velocidadActual, String marxes) {
        super(identificador, velocidadActual);
        this.marxes = marxes;
    }

    public String getMarxes() {
        return marxes;
    }

    public void setMarxes(String marxes) {
        this.marxes = marxes;
    }

    public int calculaTempsDistancia(int velocidadActual, int distancia) {

        return distancia/velocidadActual;
    }
}
