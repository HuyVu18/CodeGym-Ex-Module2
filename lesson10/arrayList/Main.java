package lesson10.arrayList;

public class Main {
    public static void main(String[] args) {
        Mylist<Integer> intList = new Mylist<>();
        intList.add(0, 1);
        intList.add(1, 10);
        intList.add(2, 100);
        intList.add(3, 1000);

        System.out.println(intList.get(2));
        System.out.println(intList.getSize());

    }
}
