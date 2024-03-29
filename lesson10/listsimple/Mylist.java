package lesson10.listsimple;

import java.util.Arrays;

public class Mylist<E> {
    private int size;
    final private int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public Mylist() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public void add(E e) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = e;
    }

    public E get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("index: " + i + ", Size " + i);
        }
        return (E) elements[i];
    }

    @Override
    public String toString() {
        return "Mylist{" +
                "size=" + size +
                ", elements=" + Arrays.toString(elements) +
                '}';
    }
}
