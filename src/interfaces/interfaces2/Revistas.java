package interfaces.interfaces2;

public class Revistas extends Articulo{
    protected String nombre;

    public Revistas(String nombre, int codi, String titul, int anyPublicacion) {
        super(codi, titul, anyPublicacion);
        this.nombre=nombre;
    }

    @Override
    public String toString() {
        return "Revista :" +
                "\ncodi=" + codi +
                "\ntitul='" + titul + '\'' +
                "\nanyPublicacion=" + anyPublicacion;
    }

}
