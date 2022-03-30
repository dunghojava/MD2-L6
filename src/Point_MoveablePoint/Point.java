package Point_MoveablePoint;

public class Point {
    private double x, y;

    public Point() {
    }

    public Point(double x, double y) {
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

    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public String getXY() {
        return " " + this.x + ", " + this.y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                "[x, y] =" + getXY() +
                '}';
    }
}
