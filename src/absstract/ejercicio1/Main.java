package absstract.ejercicio1;

public class Main {
    public static void main(String[] args) {
        Metros mimetro = new Metros("12324x", 40, 2.50);
        Cotxes cotxe = new Cotxes("23222k", 40, "Diesel", 25.85, 0.50);
        Transports Bicicletes = new Bicicletes("x13343", 55, "dinamicas");
        System.out.println("td"+mimetro.calculaTempsDistancia(40,100));
        System.out.println("mp"+mimetro.calculaPreuBitllet(50));

        System.out.println("cd"+cotxe.calculaTempsDistancia(20, 180));

        System.out.println("btd"+Bicicletes.calculaTempsDistancia(70, 100));

    }
}