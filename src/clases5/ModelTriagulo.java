package clases5;

public class ModelTriagulo {
    public int side1;
    public int side2;
    public int side3;

    public ModelTriagulo(int side1, int side2, int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public int getSide1() {
        return side1;
    }

    public void setSide1(int side1) {
        this.side1 = side1;
    }

    public int getSide2() {
        return side2;
    }

    public void setSide2(int side2) {
        this.side2 = side2;
    }

    public int getSide3() {
        return side3;
    }

    public void setSide3(int side3) {
        this.side3 = side3;
    }
    public int perimetro(int a, int b, int c){
        return a+b+c;
    }
    public double area(int a, int b, int c){

        double semiperimetro = perimetro(a,b,c)/2;
        //a=raiz2s(s-a)(s-b)(s-c)
        double area= semiperimetro * (semiperimetro-a)*(semiperimetro-b)*(semiperimetro-c);
        area=Math.pow(area, 2);
        return area;
    }

    public static void main(String[] args) {
        ModelTriagulo m= new ModelTriagulo(5,6,8);
        m.perimetro(5,6,8);
        System.out.println(m.area(5,6,8));

    }
}
