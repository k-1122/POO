package interfaces.interfaces4;

import java.util.Scanner;

public class Pegasus extends Animal implements Bird, Horse{

    public Pegasus(int age, String name) {
        super(age, name);
    }

    @Override
    public void noise() {
     Scanner sc = new Scanner(System.in);
     System.out.print("Selecciona 1 para Horse, 2 para Bird: ");
     pregunta(sc);
    }
    public void pregunta(Scanner sc){
        int read = sc.nextInt();
        if(read==1) Horse.super.noise();
        if(read==2) Bird.super.noise();
    }
}
