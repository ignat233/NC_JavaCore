package JavaHW1.OOP.Point;

import java.awt.*;

public class TestPoint {

    public static void main(String[] args) {

        MyPoint point = new MyPoint();
        MyPoint point2 = new MyPoint(3,4);
        System.out.println(point.distance(point2));
        System.out.println(point.distance(3,4));
        System.out.println(point2.distance());
    }
}
