package interfaces.interfaces3;

import java.util.ArrayList;
import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(20.8, 15.7);
        rectangle.idFigura="rectangle2";

        Circulo circulo = new Circulo(5);
        circulo.idFigura="circle1";

        Cilindro cilindro = new Cilindro();
        Piramide piramide = new Piramide(4.4, 4.7, 5.5,4.2);

        ArrayList<Figures2D> figures2D = new ArrayList<Figures2D>();
        figures2D.add(circulo);
        figures2D.add(rectangle);


        ArrayList<Figures3D> figures3D = new ArrayList<Figures3D>();
        figures3D.add(piramide);
        figures3D.add(cilindro);

        Iterator<Figures2D> it= figures2D.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }


    }
}
