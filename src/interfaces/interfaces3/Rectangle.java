package interfaces.interfaces3;

public class Rectangle extends Figures2D {

    double base;
    double altura;

    public Rectangle(double base, double altura) {
        super();
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double area() {
        return base * altura;
    }

    @Override
    public double perimetro() {
        return base * 2 + altura * 2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "base=" + base +
                ", altura=" + altura +
                ", idFigura='" + idFigura + '\'' +
                '}';
    }
}
