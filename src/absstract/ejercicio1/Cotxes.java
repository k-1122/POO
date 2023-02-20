package absstract.ejercicio1;

public class Cotxes extends Transports{
    public String tipoCombustible;
    public double precioLitreCombustible;
    public double litrosGastPorKm;

    public Cotxes(String identificador, int velocidadActual, String tipoCombustible, double precioLitreCombustible, double litrosGastPorKm) {
        super(identificador, velocidadActual);
        this.tipoCombustible=tipoCombustible;
        this.precioLitreCombustible=precioLitreCombustible;
        this.litrosGastPorKm=litrosGastPorKm;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public double getPrecioLitreCombustible() {
        return precioLitreCombustible;
    }

    public void setPrecioLitreCombustible(double precioLitreCombustible) {
        this.precioLitreCombustible = precioLitreCombustible;
    }

    public double getLitrosGastPorKm() {
        return litrosGastPorKm;
    }

    public void setLitrosGastPorKm(double litrosGastPorKm) {
        this.litrosGastPorKm = litrosGastPorKm;
    }

    @Override
    public int calculaTempsDistancia(int velocidadActual, int distancia) {
        return distancia/velocidadActual;
    }

    @Override
    public String toString() {
        return "Cotxes{" +
                "tipoCombustible='" + tipoCombustible + '\'' +
                ", precioLitreCombustible=" + precioLitreCombustible +
                ", litrosGastPorKm=" + litrosGastPorKm +
                ", identificador='" + identificador + '\'' +
                ", velocidadActual=" + velocidadActual +
                '}';
    }
}
