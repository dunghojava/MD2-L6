package Point_MoveablePoint;

public class MoveablePoint extends Point {
    private double xSpeed, ySpeed;

    public MoveablePoint(double xSpeed, double ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint() {
    }

    public MoveablePoint(double x, double y, double xSpeed, double ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public double getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(double xSpeed) {
        this.xSpeed = xSpeed;
    }

    public double getySpeed() {
        return ySpeed;
    }

    public void setySpeed(double ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(double xSpeed, double ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public String getSpeed() {
        return " " + this.xSpeed + ", " + this.ySpeed;
    }

    public String move() {
        double x = getX() + this.xSpeed;
        double y = getY() + this.ySpeed;
        return "new [x, y] = " + x + ", " + y;
    }

    @Override
    public String toString() {
        return "MoveablePoint{" +
                "xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                "[xSpeed, ySpeed] = " + getSpeed() +
                super.toString() +
                " " + move() +
                '}';
    }
}
