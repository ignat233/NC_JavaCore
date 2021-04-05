package JavaHW2.Chapter4.Task4and5;

import JavaHW2.Chapter2.Task5.Point;

public class Rectangle extends Shape {

    private double width;
    private double height;

    public Rectangle(Point topLeft, double width, double height) {
        super(topLeft);
        this.width = width;
        this.height = height;
    }

    @Override
    public Rectangle clone(){
        return new Rectangle(getXY(), width, height);
    }

    @Override
    public Point getCenter() {
        double centerX = getXY().getX() + width * 0.5;
        double centerY = getXY().getY() - height * 0.5;
        return new Point(centerX,centerY);
    }
}
