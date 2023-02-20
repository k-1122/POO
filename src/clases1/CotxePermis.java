package clases1;

import java.util.Scanner;

public class CotxePermis {

    public static void menu(){
        Scanner sc = new Scanner(System.in);
        Scanner read = new Scanner(System.in);
        Cotxe c = new Cotxe();
        PermisConduir p = new PermisConduir();
        int respuesta=0;
        boolean salida=false;
        while(!salida){
            System.out.println("1. Modificar info cotx\n2. Modificar info permis\n3. Mostrar info\n4. Salida");
            respuesta=sc.nextInt();
            switch (respuesta){
                case 1:
                    System.out.println("Ingrese el modelo y la matricula del coche:");
                    c.setModel(read.nextLine());
                    c.setMatricula(read.nextInt());
                    break;
                case 2:
                    System.out.println("Ingresa el nombre, tipo de permiso y puntos: ");
                    p.setNom(read.nextLine());
                    p.setTipusPermis(read.nextLine());
                    p.setPunts(read.nextInt());
                    break;
                case 3:
                    System.out.println(c.toString() + "" + p.toString());
                    break;
                case 4:
                    salida=true;
            }
        }
    }


    public static void modificarInfoCotxe(Cotxe c, Scanner sc){
      c.setMatricula(sc.nextInt());
      c.setModel(sc.nextLine());
    }
    public static void modificarInfoPermis(PermisConduir p, Scanner rd){
      p.setNom(rd.nextLine());
      p.setTipusPermis(rd.nextLine());
      p.setPunts(rd.nextInt());
    }
    public static void mostrarInfo(Cotxe c, PermisConduir p){
        System.out.println(c.toString() + "" + p.toString());
    }
    public static void main(String[] args) {
        menu();

    }

}
