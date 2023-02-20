public class Casa {
    public double superficie;
    public String direccion;
    Sala salaCasa;
    Cocina cocinaCasa;

    public Casa() {
        superficie = 0;
        direccion = "22 reit";
        salaCasa = new Sala();
        cocinaCasa = new Cocina();
    }

    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Sala getSalaCasa() {
        return salaCasa;
    }

    public void setSalaCasa(Sala salaCasa) {
        this.salaCasa = salaCasa;
    }

    public Cocina getCocinaCasa() {
        return cocinaCasa;
    }

    public void setCocinaCasa(Cocina cocinaCasa) {
        this.cocinaCasa = cocinaCasa;
    }

    @Override
    public String toString() {
        return "Casa{" +
                "superficie=" + superficie +
                ", direccion='" + direccion + '\'' +
                ", salaCasa=" + salaCasa +
                ", cocinaCasa=" + cocinaCasa +
                '}';
    }
}
