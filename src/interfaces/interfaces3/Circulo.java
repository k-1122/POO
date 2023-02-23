package interfaces.interfaces3;

public class Circulo extends Figures2D implements Constantes{

    double radio;

    public Circulo(){}
    public Circulo(double radio){

        this.radio= radio;
    }

    @Override
    public double area() {
        return Constantes.PI* Math.pow(radio,2) ;
    }

    @Override
    public double perimetro() {
        return 2 * Constantes.PI*radio;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "radio=" + radio +
                ", idFigura='" + idFigura + '\'' +
                '}';
    }
}
