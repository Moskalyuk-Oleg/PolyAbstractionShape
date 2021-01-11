import java.util.ArrayList;

public class Box extends Shape {

    private ArrayList<Shape> shapes = new ArrayList<>();
    private double existence;
    private double volume;

    public Box(double existence) {
        this.existence = existence;
        this.volume = existence;
    }

    public boolean add(Shape shape) {
        if (existence >= shape.getVolume()) {
            shapes.add(shape);
            existence -= shape.getVolume();
            return true;
        } else {
            return false;
        }
    }

    @Override
    public double getVolume() {
        return volume;
    }
}
