package asociacionEntreClases.ejercici2;

public class Vehicles {
    protected String matricula;
    protected int numPlazas;
    protected int diasAlquiler;
    protected static final int COMPONENT_BASE=10;

    public Vehicles(String matricula, int numPlazas, int diasAlquiler) {
        this.matricula = matricula;
        this.numPlazas = numPlazas;
        this.diasAlquiler = diasAlquiler;
    }
    public String getMatricula(){
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "Matricula='" + matricula + '\'' +
                ", Precio Base=" + COMPONENT_BASE +
                '}';
    }
}
