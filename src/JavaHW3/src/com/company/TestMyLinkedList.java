package com.company;


public class TestMyLinkedList {

    public static void main(String[] args) {

        MyLinkedList<Circle> myLinkedList = new MyLinkedList<>();
        Circle circle = new Circle(1,"red");
        Circle circle1 = new Circle(2,"blue");
        Circle circle2 = new Circle(3,"green");
        Circle circle3 = new Circle(4, "black");
        myLinkedList.add(circle);
        myLinkedList.add(circle1);
        myLinkedList.add(circle2);
        System.out.println(myLinkedList);
        System.out.println(myLinkedList.indexOf(circle1));
        System.out.println(myLinkedList.get(2));
        myLinkedList.add(1,circle3);
        System.out.println(myLinkedList);
        myLinkedList.set(1,circle);
        System.out.println(myLinkedList);
        myLinkedList.clear();
        System.out.println(myLinkedList);



    }
}
