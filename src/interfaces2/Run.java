package interfaces2;

public class Run {
    public static void main(String[] args) {

        Libros libro = new Libros(3444,"Romeo y julieta", 1968);
        System.out.println(libro.toString());

        Revistas revista = new Revistas("Amor naturaleza", 4455, "Naturaleza",2023);
        System.out.println(revista.toString());

    }
}
