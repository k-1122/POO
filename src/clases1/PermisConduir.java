package clases1;

public class PermisConduir {
    public String nom;
    public String tipusPermis;
    public int punts;

    public PermisConduir() {
        this.nom = nom;
        this.tipusPermis = tipusPermis;
        this.punts = punts;
    }

    public PermisConduir(String nom, String tipusPermis, int punts) {
        this.nom = nom;
        this.tipusPermis = tipusPermis;
        this.punts = punts;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getTipusPermis() {
        return tipusPermis;
    }

    public void setTipusPermis(String tipusPermis) {
        this.tipusPermis = tipusPermis;
    }

    public int getPunts() {
        return punts;
    }

    public void setPunts(int punts) {
        this.punts = punts;
    }

    public void imprimirPermis(){
        System.out.println("Nombre del coche: "+ getNom() + "puntos: " + getPunts() + "tipo de permiso: " + getTipusPermis());
    }
    public int restarPunts(int punts){
        punts=getPunts()-punts;
        return punts;
    }

    @Override
    public String toString() {
        return "clases.PermisConduir " +
                "nom='" + nom + '\'' +
                ", tipusPermis='" + tipusPermis + '\'' +
                ", punts=" + punts;
    }
}
