package Point2D_Point3D;

public class Point_3D  extends Point_2D {
    private double z;

    public Point_3D() {
    }

    public Point_3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }
    public double[] getXYZ() {
        return new double[]{this.getX(), this.getY(), this.z};
    }

    @Override
    public String toString() {
        return "Point_3D{" +
                "z=" + z +
                "[x, y, z] = " + getXYZ() +
                super.toString() +
                '}';
    }
}
