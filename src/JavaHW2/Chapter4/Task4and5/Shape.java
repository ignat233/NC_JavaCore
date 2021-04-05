package JavaHW2.Chapter4.Task4and5;

import JavaHW2.Chapter2.Task5.Point;

public abstract class Shape {

    private Point xy;

    public Shape(Point xy) {
        this.xy = xy;
    }

    public Point getXY() {
        return xy;
    }

    public void moveBy(double dx, double dy){
        xy.translate(dx, dy);
    }



    public abstract Point getCenter();



}
