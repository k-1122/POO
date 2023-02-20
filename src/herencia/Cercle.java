package herencia;
public class Cercle extends ObjecteGeometric{
    protected float radi;

    public Cercle(float coord_x, float coord_y, float radi) {
        super(coord_x, coord_y);
        this.radi=radi;
    }
    public float perimetreCercle(){
        return (float) (Math.PI * 2 * radi);
    }
    public float areaCercle(){
        return (float) (Math.PI * radi * radi);
    }

    @Override
    public String toString() {
        return "Cercle{" +
                "radi=" + radi +
                super.toString();
    }

}
