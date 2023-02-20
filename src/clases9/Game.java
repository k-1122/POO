package clases9;

import clases9.Player;

import java.util.Scanner;

public class Game{
    private Player []Players;
    private Player p= new Player();
    public Game() {
        this.Players = new Player[10];
    }
    public Player[] getPlayers() {
        return Players;
    }
    public void setPlayers(Player[] players) {
        Players = players;
    }
    public Player getP() {
        return p;
    }
    public void setP(Player p) {
        this.p = p;
    }
    public void menu(){
    Scanner sc = new Scanner(System.in);
    Scanner read = new Scanner(System.in);

    int respuesta=0;
    boolean salida=false;
    while(!salida){
        System.out.println("1.Agregar nuevo jugador\n2.Eliminar jugador\n3.Reset de la partida\n4.Mostrar jugadores\n5. Salida");
        respuesta=sc.nextInt();
        switch (respuesta){
            case 1:
                System.out.println("Digite nombre del jugador, coordenada X y coordenada Y:");
                añadirNuevoJugar(read.next(), read.nextInt(), read.nextInt());
                try{
                    if(Players[Players.length-1]!=null);
                 } catch (Exception e) {
                    System.out.println("Vector plè no es podran crear més jugadors fins que no se n'elimini un");
                }
                break;
            case 2:
                System.out.println("Eliminacion del último jugador creado: ");
                elimina();
                break;
            case 3:
                eliminaTotsJugadors();
                break;
            case 4:
                muestraJugadores();
                break;
            case 5:
                salida=true;
        }
    }
}
    private void muestraJugadores() {
        for (int i = 0; i < Players.length; i++) {
            System.out.println(Players[i]);
        }
    }
    private void eliminaTotsJugadors() {
        for (int i = 0; i < Players.length; i++) {
            Players[i]=null;
        }
    }
    public void elimina() {
        for (int i = 9; i >= 0; i--) {
            if (Players[i] != null)
                Players[i]=null;
        }
    }
    public void añadirNuevoJugar(String nom, int a, int b)  {
        for (int i = 0; i < Players.length; i++) {
            if (Players[i] == null){
            Players[i]= new Player(nom, a, b);
            return;
            }
        }
    }





}
