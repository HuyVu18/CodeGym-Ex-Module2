package lesson14.bubbleSort;

public class Main {
    public static void main(String[] args) {
        BubbleSort.bubbleSort();
        for (int i = 0; i < BubbleSort.list.length; i++) {
            System.out.println(BubbleSort.list[i] + " ");
        }
    }
}
