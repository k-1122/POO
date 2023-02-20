package clases6;

import java.util.Calendar;
import java.util.Date;

public class Cronometro {

    Date date = new Date();

    public int segundos;
    public int minutos;
    public int hora;
    boolean iniciar=false;
    boolean pausar =false;
    boolean detener = false;


    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }


    public void iniciar(){

      }
    Calendar c = Calendar.getInstance();
    public static void main(String[] args) {
        Cronometro c = new Cronometro();
        System.out.println();
        c.setHora((Calendar.HOUR_OF_DAY));
        c.setMinutos((Calendar.MINUTE));
        c.setSegundos((Calendar.SECOND));

        System.out.println(c.getHora() + " :" + c.getMinutos() + ";"+ c.getSegundos());
    }



}
