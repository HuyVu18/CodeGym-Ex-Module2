package lesson14.selectionSort;

public class Main {
    public static void main(String[] args) {
        SelectionSort.selectionSort();
        for (int i = 0; i < SelectionSort.list.length; i++) {
            System.out.println(SelectionSort.list[i] + " ");
        }
    }
}
