package Clases.clases6;

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

    long start;
    long end;
    public void iniciar(){
        start=0;

        start=System.currentTimeMillis();
        long segundos=(start/1000)*60;
        System.out.println(segundos);
      }

     public void detener(){
         end=System.currentTimeMillis();
         long segundos=(end/1000)*60;
         long minutos=segundos;
     }


    Calendar c = Calendar.getInstance();
    public static void main(String[] args) {
        Cronometro c = new Cronometro();
        System.out.println();


        System.out.println(System.currentTimeMillis());

        c.setHora((Calendar.HOUR_OF_DAY));
        c.setMinutos((Calendar.MINUTE));
        c.setSegundos((Calendar.SECOND));

        System.out.println(c.getHora() + " :" + c.getMinutos() + ";"+ c.getSegundos());
    }



}
