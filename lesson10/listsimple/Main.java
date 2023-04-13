package lesson10.listsimple;

public class Main {
    public static void main(String[] args) {
        Mylist<Integer> listInteger = new Mylist<>();
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(4);

        System.out.println(listInteger);

        listInteger.add(100);
        System.out.println(listInteger);
        System.out.println(listInteger.get(4));


        System.out.println(listInteger.get(-1));
    }
}
