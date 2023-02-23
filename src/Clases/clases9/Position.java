package Clases.clases9;

import java.util.Scanner;

public class Position {
    int coordenadaX;
    int coordenadaY;

    public Position(int coordenadaX, int coordenadaY) {
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
    }

    public Position() {
        coordenadaX=0;
        coordenadaY=0;

    }

    public int getCoordenadaX() {
        return coordenadaX;
    }

    public void setCoordenadaX(int coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    public int getCoordenadaY() {
        return coordenadaY;
    }

    public void setCoordenadaY(int coordenadaY) {
        this.coordenadaY = coordenadaY;
    }

    public int incX(){
       return coordenadaX++;
    }
    public int incY(){
        return coordenadaY++;
    }
    public int decX(){
        return coordenadaX--;
    }
    public int decY(){
        return coordenadaX--;
    }

    public static void setXY(){
        Scanner sc = new Scanner(System.in);
        Position p= new Position(8,8);
    }

    @Override
    public String toString() {
        return "coordenadaX=" + coordenadaX +
                ", coordenadaY=" + coordenadaY;
    }

    public static void main(String[] args) {
        setXY();
    }
}
