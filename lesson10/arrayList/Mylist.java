package lesson10.arrayList;

import java.util.Arrays;

public class Mylist<E> {
    private int size = 0;
    private final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public Mylist() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public void MyList(int capacity) {

    }

    private void ensureCapa() {
        if (size >= elements.length) {
            int newSize = elements.length * 2;
            elements = Arrays.copyOf(elements, newSize);
        }
    }

    public void add(int index, E e) {
        ensureCapa();
        for (int i = size - 1; i >= index; i--) {
            elements[i + 1] = elements[i];
        }
        elements[index] = e;
        size++;
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("index " + index + " out of bounds");
        }
    }

    public E remove(int index) {
        checkIndex(index);
        E e = (E) elements[index];
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[size - 1] = null;
        size--;
        return e;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean contains(E e) {
        for (int i = 0; i < size; i++) {
            if (e.equals(elements[i])) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(E e) {
        for (int i = 0; i < size; i++) {
            if (e.equals(elements[i])) {
                return i;
            }
        }
        return -1;
    }

    public E get (int index) {
        checkIndex(index);
        return (E) elements[index];
    }

    public void clear() {
        elements = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    @Override
    public String toString() {
        return "Mylist{" +
                "size=" + size +
                ", elements=" + Arrays.toString(elements) +
                '}';
    }
}
