public class Pyramid extends Shape {
    private double s;
    private double height;

    public Pyramid(double s, double height) {
        this.s = s;
        this.height = height;
    }

    @Override
    double getVolume() {
        return height * s * 4 / 3;
    }
}
