package interfaces2;

public abstract class Articulo {

    protected int codi;
    protected String titul;
    protected int anyPublicacion;

    public Articulo(int codi, String titul, int anyPublicacion) {
        this.codi = codi;
        this.titul = titul;
        this.anyPublicacion = anyPublicacion;
    }

    public int getCodi() {
        return codi;
    }

    public void setCodi(int codi) {
        this.codi = codi;
    }

    public String getTitul() {
        return titul;
    }

    public void setTitul(String titul) {
        this.titul = titul;
    }

    public int getAnyPublicacion() {
        return anyPublicacion;
    }

    public void setAnyPublicacion(int anyPublicacion) {
        this.anyPublicacion = anyPublicacion;
    }
}
