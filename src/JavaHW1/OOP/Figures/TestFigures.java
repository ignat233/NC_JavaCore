package JavaHW1.OOP.Figures;

import JavaHW1.OOP.Point.MyPoint;

public class TestFigures {

        public static void main(String[] args) {

        System.out.println("--------------Test Class Circle -------------------");
        Circle circle = new Circle(3.4, "blue");
        System.out.println(circle);
        System.out.println("Area:" + circle.getArea());
        circle.setRadius(5);
        System.out.println(circle);
        System.out.println("Area:" + circle.getArea());
        System.out.println("--------------Test Class Triangle -------------------");
        MyPoint point1 = new MyPoint();
        MyPoint point2 = new MyPoint(0,4);
        MyPoint point3 = new MyPoint(3,4);
        MyPoint point4 = new MyPoint(4,4);
        MyTriangle triangle1 = new MyTriangle(point1,point2,point3);
        System.out.println(triangle1);
        System.out.println("Perimeter:" + triangle1.getPerimeter());
        System.out.println("Type:" + triangle1.getType());
        MyTriangle triangle2 = new MyTriangle(point1,point2,point4);
        System.out.println(triangle2);
        System.out.println("Perimeter:" + triangle2.getPerimeter());
        System.out.println("Type:" +triangle2.getType());
        System.out.println("--------------Test Class Rectangle -------------------");
        Rectangle rectangle = new Rectangle(2,4);
        System.out.println(rectangle);
        System.out.println("Area:" + rectangle.getArea());
        System.out.println("Perimeter:" + rectangle.getPerimeter());

    }

}
