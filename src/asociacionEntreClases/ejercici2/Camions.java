package asociacionEntreClases.ejercici2;

public class Camions extends Vehicles{
    protected float precioBase;
    protected int pesoMaximo;
    public Camions(String matricula, int numPlazas, int diasAlquiler, int pesoMaximo) {
        super(matricula, numPlazas, diasAlquiler);
        this.precioBase = Vehicles.COMPONENT_BASE + 40;
        this.pesoMaximo = pesoMaximo;
    }

    public float getPrecioBase() {
        return precioBase;
    }
    @Override
    public String toString() {
        return "Camions{" +
                "Precio Alquiler=" + precioBase +
                ", Matricula='" + matricula + '\'' +
                ", Numero de Plazas=" + numPlazas +
                ", Dias Alquiler=" + diasAlquiler +
                '}';
    }
}
