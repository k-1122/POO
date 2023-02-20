package asociacionEntreClases.ejercici2;

public class Microbusos extends Vehicles{

    protected float incComponenBase;

    public Microbusos(String matricula, int numPlazas, int diasAlquiler) {
        super(matricula, numPlazas, diasAlquiler);
        this.incComponenBase=Vehicles.COMPONENT_BASE + 2;

    }

    public float getIncComponenBase() {
        return incComponenBase;
    }

    @Override
    public String toString() {
        return "Microbusos{" +super.toString()+
                "Precio alquiler=" + incComponenBase +
                '}';
    }
}
