package lesson10.linkedList;

public class Main {
    public static void main(String[] args) {
        MyLinkedList ll = new MyLinkedList(10);
        ll.addFirst(11);
        ll.addFirst(12);
        ll.addFirst(13);

        ll.add(4,9);
        ll.add(4,111);
        ll.printList();
        System.out.println(ll.get(3));
    }
}
