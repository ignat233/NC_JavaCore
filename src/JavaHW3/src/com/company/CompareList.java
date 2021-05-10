package com.company;

import java.util.LinkedList;

public class CompareList {

    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<>();
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();

        for(int i =0;i<10000;i++) linkedList.add(i);
        for(int i =0;i<10000;i++) myLinkedList.add(i);

//        long startTime = System.nanoTime();
//        myLinkedList.add(10001);
//        System.out.println(System.nanoTime() -startTime);
//
//        long startTime1 = System.nanoTime();
//        myLinkedList.add(5000,10002);
//        System.out.println(System.nanoTime() -startTime1);
//
//        long startTime5 = System.nanoTime();
//        myLinkedList.set(5000,10003);
//       System.out.println(System.nanoTime() -startTime5);
//
//        long startTime2 = System.nanoTime();
//        myLinkedList.indexOf(6000);
//        System.out.println(System.nanoTime() -startTime2);
//
//        long startTime3 = System.nanoTime();
//        myLinkedList.get(5500);
//        System.out.println(System.nanoTime() -startTime3);
//
//        long startTime4 = System.nanoTime();
//        myLinkedList.remove(4800);
//        System.out.println(System.nanoTime() -startTime4);

        long startTime = System.nanoTime();
        linkedList.add(10001);
        System.out.println(System.nanoTime() -startTime);

        long startTime1 = System.nanoTime();
        linkedList.add(5000,10002);
        System.out.println(System.nanoTime() -startTime1);

        long startTime5 = System.nanoTime();
        linkedList.set(5000,10003);
        System.out.println(System.nanoTime() -startTime5);

        long startTime2 = System.nanoTime();
        linkedList.indexOf(6000);
        System.out.println(System.nanoTime() -startTime2);

        long startTime3 = System.nanoTime();
        linkedList.get(5500);
        System.out.println(System.nanoTime() -startTime3);

        long startTime4 = System.nanoTime();
        linkedList.remove(4800);
        System.out.println(System.nanoTime() -startTime4);
    }
}
