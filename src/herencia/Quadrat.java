package herencia;

public class Quadrat extends ObjecteGeometric {
    float costat;

    public Quadrat(float coord_x, float coord_y, float costat) {
        super(coord_x, coord_y);
        this.costat=costat;
    }
    public float perimetreQuadrat(){
        return (costat * costat);
    }
    public float areaQuadrat(){
        return 4 * costat;
    }
    @Override
    public String toString() {
        return "Quadrat{" +
                "costat=" + costat +
                super.toString();
    }
}
