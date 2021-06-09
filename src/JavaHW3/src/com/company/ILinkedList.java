package com.company;

public interface ILinkedList<E> extends Iterable<E>{

    void add(E element);

    void add(int index , E element);

    void clear();

    E get(int index);

    int indexOf(E element);

    E remove(int index);

    int size();


    String toString();

    <T> T[] toArray(T[] a);
}
