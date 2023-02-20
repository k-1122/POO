package clases9;

public class Player {
    private Position p;
    private String nom;
    public Player() {
        this.p = new Position();
        this.nom = "";
    }
    public Player(Position p, String nom) {
        this.p = p;
        this.nom = nom;
    }
    //examen
    public Player(String nom, int posInix, int posIniY){
        p = new Position(posInix, posIniY);
        this.nom = nom;
    }
    public Position getP() {
        return p;
    }
    public void setP(Position p) {
        this.p = p;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
//X hacia la derecha Y hacia arriba
    public void moveRigth(){
        p.incX();
    }
    public void jump(){
        p.incY();
    }
    public void fall(){
        p.decY();
    }
    public void moveLeft(){
        p.decX();
    }

    @Override
    public String toString() {
        return "clases9.Player"+ p +
                ", nom='" + nom;
    }

    public static void main(String[] args) {
        Position p = new Position(5,8);
    Player p1 = new Player(p,"david");


    }
}
