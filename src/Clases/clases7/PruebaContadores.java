package Clases.clases7;

public class PruebaContadores {
    public static void main(String[] args) {
        ComptadorDosDigits contDos = new ComptadorDosDigits(46);
        System.out.println(contDos.getComptador());

        try {
            Comptador contador = new Comptador(-1);
        } catch (Exception e) {

            System.out.println("Vuelve a ingresar un valor");
        }


    }
}
