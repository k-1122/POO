package interfaces;

import java.util.ArrayList;
import java.util.Iterator;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Cantant>Cantantes = new ArrayList<Cantant>();
        Cantantes.add(new Persona("karol",24));
        Cantantes.add(new Canario("amarillo", "Colombia"));
        Cantantes.add(new CantantOpera("fatima", 19));

        Iterator<Cantant> it = Cantantes.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
