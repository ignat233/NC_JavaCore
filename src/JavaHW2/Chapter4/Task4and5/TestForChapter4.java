package JavaHW2.Chapter4.Task4and5;

import JavaHW2.Chapter2.Task5.Point;

public class TestForChapter4 {

    public static void main(String[] args) {

        Point point = new Point(2,7);

        System.out.println("----------Circle-----------");
        Circle circle = new Circle(point,2);
        System.out.println(circle.getCenter());
        circle.moveBy(1,1);
        System.out.println(circle.getCenter());

        System.out.println("-----------Line------------");
        Line line = new Line(point,new Point(5,5));
        System.out.println(line.getCenter());
        line.moveBy(2,3);
        System.out.println(line.getCenter());

        System.out.println("--------Rectangle----------");
        Rectangle rectangle = new Rectangle(point,4,6);
        System.out.println(rectangle.getCenter());
        rectangle.moveBy(1,10);
        System.out.println(rectangle.getCenter());

    }
}
