package Circle_Cylinder;

public class Cylinder  extends Circle{
    private double height;
    public Cylinder() {
    }
    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight(double v) {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return this.getArea() * this.height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                "Volume=" + this.getArea() * this.height +
                " " + super.toString() +
                '}';
    }
}