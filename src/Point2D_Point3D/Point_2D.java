package Point2D_Point3D;

public class Point_2D {
    private double x, y;

    public Point_2D() {
    }

    public Point_2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setXY(double X, double Y) {
        this.x = x;
        this.y = y;
    }

    public String getXY() {
        return " " + this.x + ", " + this.y + " ";
    }

    @Override
    public String toString() {
        return "Point_2D{" +
                "x=" + x +
                ", y=" + y +
                "[x, y]" + getXY() +
                '}';
    }
}
