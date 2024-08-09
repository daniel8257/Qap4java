package problem2;





public class Demo {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle(5),
                new Ellipse(6, 4),
                new Triangle(3, 4, 5),
                new EquilateralTriangle(6)
        };

        System.out.println("Before Scaling:");
        for (Shape shape : shapes) {
            System.out.println(shape);
        }

        scaleAll(shapes, 2);

        System.out.println("After Scaling:");
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }

    public static void scaleAll(Scalable[] objects, double factor) {
        for (Scalable obj : objects) {
            obj.scale(factor);
        }
    }
}
