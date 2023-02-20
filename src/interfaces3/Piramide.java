package interfaces3;

public class Piramide extends Figures3D{

    public double lado;
    public double base;
    public double altura;
    double areaBase;
    @Override
    public double area() {
        areaBase=(base * base);
        double apotema = Math.sqrt(Math.pow(altura,2)+Math.pow((base/2),2));
        double areaCarasLaterales= ((base*apotema)/2) * 4;
        double areaPiramide = areaBase + areaCarasLaterales;
        return areaPiramide;
    }

    @Override
    public double perimetro() {
        return 4*lado;
    }

    @Override
    public void volumen() {
    double volumen = (areaBase * altura)/3;
    }
}
