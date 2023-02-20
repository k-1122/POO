package absstract.ejercicio1;

public class Metros extends Transports {
    protected double preuBitllet;

    public Metros(String identificador, double velocidadActual, Double preuBitllet) {
        super(identificador, velocidadActual);
        this.preuBitllet=preuBitllet;
    }

    public double getPreuBitllet() {
        return preuBitllet;
    }

    public void setPreuBitllet() {
        preuBitllet*=(velocidadActual/5);
    }


    public float calculaPreuBitllet(float velocidadActual) {

        return (float) (preuBitllet*=(velocidadActual/5));
    }

    @Override
    public int calculaTempsDistancia(int velocidadActual, int distancia) {

        return distancia/velocidadActual;
    }
}
