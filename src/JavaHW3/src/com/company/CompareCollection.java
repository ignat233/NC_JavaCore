package com.company;

import java.util.*;

public class CompareCollection {

    public static void main(String[] args) {
//        LinkedList<Integer> linkedList = new LinkedList<>();
//        ArrayList<Integer> arrayList = new ArrayList<>();
  //      HashSet<Integer> hashSet = new HashSet<>();
    //    LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
     //  TreeSet<Integer> treeSet = new TreeSet<>();
       // HashMap<Integer,Integer> hashMap = new HashMap<>();
       // LinkedHashMap<Integer,Integer> linkedHashMap = new LinkedHashMap<>();
        TreeMap<Integer,Integer> treeMap = new TreeMap<>();



        for(Integer i =0;i<10000;i++) treeMap.put(i,i);

        long startTime = System.nanoTime();
        treeMap.put(5000,10002);
        System.out.println(System.nanoTime() -startTime);


        long startTime2 = System.nanoTime();
        treeMap.remove(4800);
        System.out.println(System.nanoTime() -startTime2);

        long startTime1 = System.nanoTime();
        treeMap.get(5000);
        System.out.println(System.nanoTime() -startTime1);

    }
}
