package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private String color;
    private double topBase;
    private double bottomBase;
    private double height;

    public IsoscelesTrapezoid(String color, double topBase, double bottomBase, double height) {
        this.color = color;
        this.topBase = topBase;
        this.bottomBase = bottomBase;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * (topBase + bottomBase) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: "
                + getArea() + " sq. units, top base: "
                + topBase + " units, bottom base: " + bottomBase
                + " units, height: " + height + " units, color: " + color);
    }
}
