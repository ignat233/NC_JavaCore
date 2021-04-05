package JavaHW2.Chapter4.Task4and5;

import JavaHW2.Chapter2.Task5.Point;

public class Line extends Shape {


    private Point end;

    public Line(Point from, Point end) {
        super(from);
        this.end = end;
    }

    @Override
    public Line clone() {
        return new Line(getXY(), end);
    }

    @Override
    public Point getCenter() {
        double centerX = end.getX() - getXY().getX();
        double centerY = end.getY() - getXY().getY();
        return new Point(centerX,centerY);
    }


}
