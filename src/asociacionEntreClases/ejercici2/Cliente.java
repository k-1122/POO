package asociacionEntreClases.ejercici2;


import java.util.Scanner;

public class Cliente {

    public void anuncio(){
        System.out.println("Ingrese Matricula, Numero de Plazas, dias de Alquiler");
    }

public void afegirVehicle2(){

}

    public void afegirVehicle(){

        Scanner read= new Scanner(System.in);
        boolean salir=false;
        System.out.println("Eliga un vehiculo:\n1. clases.Cotxe\n2. Microbusos\n3. Furgoneta\n4. Camions");

        while(!salir) {
            int respuesta= read.nextInt();
            switch (respuesta){
                case 1:
                    anuncio();
                    Cotxes cotxe = new Cotxes(read.next(), read.nextInt(), read.nextInt());
                    System.out.println(cotxe.toString());
                break;
                    case 2:
                    anuncio();
                    Microbusos microbus = new Microbusos(read.next(), read.nextInt(), read.nextInt());
                    System.out.println(microbus.toString());
                break;
                    case 3:
                    System.out.println("Ingrese Matricula, Numero de Plazas, dias de Alquiler, Peso maximo autorizado:");
                    FurgonetesCarga furgo = new FurgonetesCarga(read.next(), read.nextInt(), read.nextInt(), read.nextInt());
                    System.out.println(furgo.toString());
                break;
                    case 4:
                    anuncio();
                    Camions camion = new Camions(read.next(), read.nextInt(), read.nextInt(), read.nextInt());
                break;
                    case 5:
                    salir=true;
                default:
                    break;
            }
        }
    }

}
