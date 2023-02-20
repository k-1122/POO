package clases7;

public class ComptadorDosDigits {

    Comptador decenas;
    Comptador unidades;

    public ComptadorDosDigits(Comptador decenas, Comptador unidades) {
        this.decenas = decenas;
        this.unidades = unidades;
    }

    public ComptadorDosDigits(){
        decenas = new Comptador();
        unidades = new Comptador();
    }

    public ComptadorDosDigits(int valor) {
        unidades = new Comptador(valor % 10);
        decenas = new Comptador(valor / 10);
    }

    public int getComptador() {
        return (decenas.getContador()*10)+unidades.getContador();
    }

    boolean comprueba(int x){
        if (x < 0 || x > 99)
            return false;
        else return true;
    }

    public void reset(){
        decenas.reset();
        unidades.reset();
    }

    public void incrementar(){
        unidades.incrementar();
        if(unidades.getContador()==0){
            decenas.incrementar();
        }
    }


}
