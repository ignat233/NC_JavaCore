package com.company;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyLinkedList<E> implements ILinkedList<E> {

    transient int size = 0;

    transient Node<E> first;

    transient Node<E> last;

    public MyLinkedList() {
    }

//    public String toString() {
//        Iterator<E> it = iterator();
//        if (! it.hasNext())
//            return "[]";
//
//        StringBuilder sb = new StringBuilder();
//        sb.append('[');
//        for (;;) {
//            E e = it.next();
//            sb.append(e == this ? "(this Collection)" : e);
//            if (! it.hasNext())
//                return sb.append(']').toString();
//            sb.append(',').append(' ');
//        }
//    }
    @Override
    public String toString() {
        return "MyLinkedList{" +
                "size=" + size +
                " elements:" + forToString() +
                '}';
    }

    public String forToString() {
        String str = "";
        for (Node<E> x = first; x != null; x = x.nextNode) str +=  x.element;

        return str;
    }

    @Override
    public void add(E element) {
        final Node<E> l = last;
        final Node<E> newNode = new Node<>(last, element, null);
        last = newNode;
        if (l == null) first = newNode;
        else l.nextNode = newNode;
        size++;
        modCount++;
    }

    @Override
    public void add(int index, E element) {
        if (index == size)
            add(element);
        else linkBefore(element, node(index));
    }


    Node<E> node(int index) {
        if (index < (size >> 1)) {
            Node<E> x = first;
            for (int i = 0; i < index; i++)
                x = x.nextNode;
            return x;
        } else {
            Node<E> x = last;
            for (int i = size - 1; i > index; i--)
                x = x.prevNode;
            return x;
        }
    }

    void linkBefore(E e, Node<E> succ) {

        final Node<E> pred = succ.prevNode;
        final Node<E> newNode = new Node<>(pred, e, succ);
        succ.prevNode = newNode;
        if (pred == null)
            first = newNode;
        else
            pred.nextNode = newNode;
        size++;
        modCount++;
    }

    @Override
    public void clear() {
        Node<E> x = first;
        while (x != null) {
            x.element = null;
            x.prevNode = null;
            x.nextNode = null;
            x = x.nextNode;
        }
        size = 0;
    }

    @Override
    public E get(int index) {
        return node(index).element;
    }

    @Override
    public int indexOf(E element) {
        int index = 0;
        if (element == null) {
            for (Node<E> x = first; x != null; x = x.nextNode) {
                if (x.element == null)
                    return index;
                index++;
            }
        } else {
            for (Node<E> x = first; x != null; x = x.nextNode) {
                if (element.equals(x.element))
                    return index;
                index++;
            }
        }
        return -1;
    }

    @Override
    public E remove(int index) {
        final E element = node(index).element;
        final Node<E> next = node(index).nextNode;
        final Node<E> prev = node(index).prevNode;

        if (prev == null) {
            first = next;
        } else {
            prev.nextNode = next;
            node(index).prevNode = null;
        }

        if (next == null) {
            last = prev;
        } else {
            next.prevNode = prev;
            node(index).nextNode = null;
        }

        node(index).element = null;
        size--;
        modCount++;
        return element;
    }


    @Override
    public int size() {
        return size;
    }

    public E set(int index, E element) {
        Node<E> x = node(index);
        E oldVal = x.element;
        x.element = element;
        return oldVal;
    }

    @Override
    public <T> T[] toArray(T[] a) {
        if (a.length < size)
            a = (T[])java.lang.reflect.Array.newInstance(
                    a.getClass().getComponentType(), size);
        int i = 0;
        Object[] result = a;
        for (Node<E> x = first; x != null; x = x.nextNode)
            result[i++] = x.element;

        if (a.length > size)
            a[size] = null;

        return a;
    }

    @Override
    public Iterator<E> iterator() {
        return new ListItr();
    }

    protected transient int modCount = 0;

    private class ListItr implements Iterator<E> {
        int cursor = 0;

        int lastRet = -1;

        int expectedModCount = modCount;


        public boolean hasNext() {
            return cursor != size();
        }



        public E next() {
            checkForComodification();
            try {
                int i = cursor;
                E next = get(i);
                lastRet = i;
                cursor = i + 1;
                return next;
            } catch (IndexOutOfBoundsException e) {
                checkForComodification();
                throw new NoSuchElementException(e);
            }
        }

        final void checkForComodification() {
            if (modCount != expectedModCount)
                throw new ConcurrentModificationException();
        }

    }
}
