package Clases.Clases11;

public class Cercle {
    double radio;
    double perimetro;
    double area;

    public Cercle(){
        radio=5;
    }

    public Cercle(double radio){
        this.radio=radio;
    }

    public double getRadio() {
        return radio;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public double getArea() {
        return area;
    }

    public void perimetro(){
        perimetro = 2*Math.PI*radio;
    }
    public void area(){
        area = Math.PI*Math.pow(radio,2);
    }
    public void compara(double radi){
        if (this.radio>radi) System.out.println("El circulo por defecto es mas grande");
        else
            System.out.println("Este objeto es mas grande que el circulo por defecto");
    }

    @Override
    public String toString() {
        return "Cercle{" +
                "radio=" + radio +
                ", perimetro=" + perimetro +
                ", area=" + area +
                '}';
    }
}
