package problem2;

public class EquilateralTriangle extends Triangle {

    public EquilateralTriangle(double side) {
        super(side, side, side);
        this.name = "Equilateral Triangle";
    }

    @Override
    public void scale(double factor) {
        setSide1(getSide1() * factor);
        setSide2(getSide2() * factor);
        setSide3(getSide3() * factor);
    }
}
