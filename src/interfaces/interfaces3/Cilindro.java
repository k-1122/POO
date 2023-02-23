package interfaces.interfaces3;

public class Cilindro extends Figures3D implements Calculs3D, Constantes{
    double base;
    double radio;
    double altura;
    @Override
    public double area() {
        return 2* Constantes.PI * radio * (radio+altura);
    }

    @Override
    public double perimetro() {
        return 4 * Constantes.PI * radio;
    }

    @Override
    public double volumen() {
    return base * altura;
    }
}
