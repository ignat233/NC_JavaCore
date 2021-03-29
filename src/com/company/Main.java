package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
//        Circle in = new Circle(3);
//        System.out.println(in.getArea());
//
//        Rectangle om = new Rectangle(1,2);
//        System.out.println(om.toString());
//        Employee bn = new Employee(1,"3","4",5);
////        System.out.println(bn.raiseSala       ry(100));
////        System.out.println(bn.toString());


        System.out.println("---------------------------- TEST CLASS BOOK---------------------------");
        Book book = new Book();
        book.setBookManual();               //Вводим параметры книги вручную
        System.out.println(book.toString());
        System.out.println("---------------------------- TEST CLASS MyPoint---------------------------");
        MyPoint k = new MyPoint(3,4);
        MyPoint d = new MyPoint();
   //     int[] a = k.getXY();
    //    System.out.println(p.distance(0,0));
      //  p.distance();
        System.out.println(k.discance(d));
        MyTriangle q = new MyTriangle(0,0,3,4,5,0);
        System.out.println(q.getPerimeter());
        System.out.println("---------------------------- TEST CLASS MyComplex---------------------------");
        MyComplex p = new MyComplex(1,-2);
        MyComplex n = new MyComplex(1,3);
        System.out.println(p.isReal());
        System.out.println(p.equals(1,2));
        System.out.println(p.equals(n));
        System.out.println(p.subtractNew(n));
        System.out.println(p.conjugate());
        System.out.println(p.conjugate());
        System.out.println("---------------------------- TEST CLASS MyPolynomial---------------------------");
        int[] b = new int[]{1,2,3,4,5,6};
        int[] s = new int[]{6,5,4,3,2,1};
        MyPolynomial v = new MyPolynomial(b);
        MyPolynomial g = new MyPolynomial(s);
        System.out.println(v.toString());
        System.out.println(v.getDegree());
        System.out.println(v.add(g));
        System.out.println(v.multiply(g));
        System.out.println("------------------------ TEST CLASS Ball and CLASS Container-----------------------");
        Ball ball = new Ball(1,1,1,1,0);
        Container con = new Container(0,0,2,2);
        System.out.println(con.collides(ball));
        ball.move();
        System.out.println(con.collides(ball));

    }

}