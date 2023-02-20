package asociacionEntreClases.ejercici2;

public class Cotxes extends Vehicles{

    public float componenPrecioBase;

    public Cotxes(String matricula, int numPlazas, int diasAlquiler) {
        super(matricula, numPlazas, diasAlquiler);
        this.componenPrecioBase=Vehicles.COMPONENT_BASE;
    }


    public float getComponenPrecioBase() {
        return componenPrecioBase;
    }

    public void setComponenPrecioBase(float componenPrecioBase) {
        this.componenPrecioBase = componenPrecioBase + (1.5f * numPlazas * diasAlquiler);
    }

    @Override
    public String toString() {
        return "clases.Cotxe :" + super.toString()+
                "Precio Alquiler=" + componenPrecioBase +
                '}';
    }
}
