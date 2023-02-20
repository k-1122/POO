package interfaces;

public class Canario implements Cantant{

    protected String color;
    protected String pais;

    public Canario(String color, String pais) {
        this.color = color;
        this.pais = pais;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public void canta() {
        System.out.println("piopiooo");
    }

    @Override
    public String toString() {
        return "Canario{" +
                "color='" + color + '\'' +
                ", pais='" + pais + '\'' +
                '}';
    }
}
