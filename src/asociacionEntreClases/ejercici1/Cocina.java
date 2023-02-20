public class Cocina {
    public boolean esIndependent;
    public int nombreDeFogons;

    public Cocina() {
        esIndependent = false;
        nombreDeFogons = 0;
    }

    public boolean isIndependent() {
        return esIndependent;
    }

    public void setisIndependent(boolean esIndependent) {
        this.esIndependent = esIndependent;
    }

    public int getNombreDeFogons() {
        return nombreDeFogons;
    }

    public void setNombreDeFogons(int nombreDeFogons) {
        this.nombreDeFogons = nombreDeFogons;
    }

    @Override
    public String toString() {
        return "Cocina{" +
                "esIndependent=" + esIndependent +
                ", nombreDeFogons=" + nombreDeFogons +
                '}';
    }
}
