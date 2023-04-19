package lesson14.insertionSort;

public class Main {
    public static void main(String[] args) {
        InsertionSort.insertionSort();
        for (int i = 0; i < InsertionSort.list.length; i++) {
            System.out.println(InsertionSort.list[i] + " ");
        }
    }
}
