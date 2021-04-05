package JavaHW2.Chapter4.Task4and5;

import JavaHW2.Chapter2.Task5.Point;

public class Circle extends Shape {

    private double radius;

    public Circle(Point center, double radius) {
        super(center);
        this.radius = radius;
    }

    @Override
    public Point getCenter() {
        return getXY();
    }

    @Override
    public Circle clone() {
        return new Circle(getXY(), radius);
    }
}
