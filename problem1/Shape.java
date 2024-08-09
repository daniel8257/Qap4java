package problem1;

public abstract class Shape {
    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    @Override
    public String toString() {
        return name + ": Area = " + getArea() + ", Perimeter = " + getPerimeter();
    }
}
