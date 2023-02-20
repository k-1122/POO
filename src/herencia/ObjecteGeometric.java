package herencia;

public class ObjecteGeometric {
    protected float coord_x;
    protected float coord_y;

    public ObjecteGeometric(float coord_x, float coord_y){
       this.coord_x=coord_x;
       this.coord_y=coord_y;
    }

    public float getCoord_x() {
        return coord_x;
    }

    public void setCoord_x(float coord_x) {
        this.coord_x = coord_x;
    }

    public float getCoord_y() {
        return coord_y;
    }

    public void setCoord_y(float coord_y) {
        this.coord_y = coord_y;
    }

    @Override
    public String toString() {
        return "ObjecteGeometric{" +
                "coord_x=" + coord_x +
                ", coord_y=" + coord_y +
                '}';
    }
}
