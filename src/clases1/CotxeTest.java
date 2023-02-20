package clases1;

public class CotxeTest {
    public static void main(String[] args) {
        Cotxe cotxe1 = new Cotxe("BMW", 234344);
        Cotxe cotxe2 = new Cotxe("MAZDA",325252);
        Cotxe cotxe3 = new Cotxe();
        System.out.println(cotxe1.toString() + " "+ cotxe2.toString());

        cotxe3 = cotxe2;
        System.out.println(cotxe3.toString());
    }
}
