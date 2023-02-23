package Clases.clases7;

public class Comptador {
    int contador;

    public Comptador(){
        contador=0;
    }

    public Comptador(int contador) {

        if(comprueba(contador)) this.contador = contador;
        else throw new IllegalArgumentException("Rango de 0-9" );

    }

    public int getContador() {
        return contador;
    }

    boolean comprueba(int x){
        if (x < 0 || x > 9)
            return false;
        else return true;
    }

    public void reset(){
        contador=0;
    }
    public void incrementar(){
        if(contador!=9)
            contador++;
        else
            reset();
    }

    @Override
    public String toString() {
        return "Comptador{" +
                "contador=" + contador +
                '}';
    }
}
