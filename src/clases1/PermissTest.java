package clases1;

public class PermissTest {
    public static void main(String[] args) {
        PermisConduir pc1 = new PermisConduir("MadMax","b1",
        4500);
        pc1.imprimirPermis();
        pc1.restarPunts(500);
        PermisConduir pc2 = new PermisConduir("eli", "c2",8000 );
        pc2.restarPunts(1000);
        pc2.imprimirPermis();
        System.out.println(pc1.toString() + " "+ pc2.toString());
    }
}
