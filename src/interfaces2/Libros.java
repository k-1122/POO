package interfaces2;

public class Libros extends Articulo implements Prestable{

    protected boolean prestados;

    public Libros(int codi, String titul, int anyPublicacion) {
        super(codi, titul, anyPublicacion);
        this.prestados=false;
    }


    public boolean isPrestados() {
        return prestados;
    }

    public void setPrestados(boolean prestados) {
        this.prestados = prestados;
    }

    @Override
    public void prestar() {
        prestados=true;
    }

    @Override
    public void volver() {
        prestados=false;
    }

    @Override
    public boolean prestado() {
        System.out.println("Prestado :"+isPrestados());
        return prestados;
    }

    @Override
    public String toString() {
        return "Libro :" +
                "\ncodi=" + codi +
                "\ntitul='" + titul + '\'' +
                "\nanyPublicacion=" + anyPublicacion;
    }
}
