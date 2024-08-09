package problem2;

public class Ellipse extends Shape {
    private double a; // Keep visibility as private
    private double b; // Keep visibility as private

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

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
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

    @Override
    public void scale(double factor) {
        setA(getA() * factor);
        setB(getB() * factor);
    }
}
