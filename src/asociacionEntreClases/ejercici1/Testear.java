public class Testear {
    public static void main(String[] args) {
        //Casa casaPorDefecto = new Casa();
        //System.out.println(casaPorDefecto.toString());
        Casa casa = new Casa();
        casa.setDireccion("1122ker");
        casa.setSuperficie(250.94);

        Cocina cocina1 = new Cocina();
        cocina1.setisIndependent(true);
        cocina1.setNombreDeFogons(5);
        casa.setCocinaCasa(cocina1);

        Sala sala1 = new Sala();
        sala1.setTipusSala("grande");
        sala1.setNumeroDeTelevisions(2);
        casa.setSalaCasa(sala1);
        System.out.println(casa.toString());

    }
}
