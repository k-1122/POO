package Clases.clases1;

public class Cotxe {
    private String model;
    private int matricula;

    public String getModel() {
        return model;
    }

    public Cotxe() {
        this.model = model;
        this.matricula = matricula;
    }

    public Cotxe(String model, int matricula) {
        this.model = model;
        this.matricula = matricula;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "clases.Cotxe " +
                "model=" + model +
                ", matricula=" + matricula
                ;
    }
}
