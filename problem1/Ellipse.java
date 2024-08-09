package problem1;


public class Ellipse extends Shape {
    private double a; // major axis
    private double b; // minor axis

    public Ellipse(double a, double b) {
        super("Ellipse");
        if (a < b) {
            double temp = a;
            a = b;
            b = temp;
        }
        this.a = a;
        this.b = b;
    }

    @Override
    public double getArea() {
        return Math.PI * a * b;
    }

    @Override
    public double getPerimeter() {
        return Math.PI * 2 * (Math.pow(a, 2) + Math.pow(b, 2)) - (Math.pow(a - b, 2) / 2);
    }
}
