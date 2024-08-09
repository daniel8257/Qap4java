package problem2;

public class Circle extends Ellipse {

    public Circle(double radius) {
        super(radius, radius);
        this.name = "Circle";
    }

    @Override
    public void scale(double factor) {
        // Scale the radius by the factor
        this.setA(this.getA() * factor);
        this.setB(this.getB() * factor);
    }
}
