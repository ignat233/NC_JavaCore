package com.company;

import java.util.LinkedList;

public class Node<E> {
     E element;
     Node<E> prevNode;
     Node<E> nextNode;

    Node(Node<E> prev, E element,Node<E> next) {
        this.element = element;
        this.nextNode = next;
        this.prevNode = prev;
    }

    @Override
    public String toString() {
        return "Node{" +
                "element=" + element +
                '}';
    }
}
