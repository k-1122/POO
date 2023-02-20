public class Modulo {
    private String nom;

    public Modulo(){

    }
    public Modulo(String nom){
        this.nom=nom;
    }
    public String getnom() {
        return nom;
    }
    public void setNom(String nom){
        this.nom=nom;
    }

    @Override
    public String toString() {
        return "Modulo{" +
                "nom='" + nom + '\'' +
                '}';
    }
}
