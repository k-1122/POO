package asociacionEntreClases.ejercici2;

public class FurgonetesCarga extends Vehicles{

    protected int precioBase;
    protected int pesaMaxAutorizado;

    public FurgonetesCarga(String matricula, int numPlazas, int diasAlquiler, int pesaMaxAutorizado) {
        super(matricula, numPlazas, diasAlquiler);
        this.precioBase= Vehicles.COMPONENT_BASE;
        this.pesaMaxAutorizado=pesaMaxAutorizado;
    }

    public int getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(int precioBase) {
        this.precioBase = Vehicles.COMPONENT_BASE+ 20 * pesaMaxAutorizado;
    }

    public int getPesaMaxAutorizado() {
        return pesaMaxAutorizado;
    }

    public void setPesaMaxAutorizado(int pesaMaxAutorizado) {
        this.pesaMaxAutorizado = pesaMaxAutorizado;
    }

    @Override
    public String toString() {
        return "FurgonetesCarga{" +
                "precioBase=" + precioBase +
                ", pesaMaxAutorizado=" + pesaMaxAutorizado +
                '}';
    }
}
