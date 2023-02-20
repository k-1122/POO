package clases7;

public class Comptador {
    int contador;

    public Comptador(){
        contador=0;
    }

    public Comptador(int contador) throws IllegalArgumentException {
        try {
            if (comprueba(contador)){
                this.contador = contador;
            }
        } catch ( IllegalArgumentException e) {
            System.out.println(("Rango de 0-9" + e));
        }
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
        else {
            reset();
            System.out.println("Fuera de rango");
        }
    }


}
