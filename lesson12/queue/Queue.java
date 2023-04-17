package lesson12.queue;


public class Queue {
    private Node head;
    private Node tail;

    public Queue(Node head, Node tail) {
        this.head = null;
        this.tail = null;
    }

    public void enQueue(int data) {
        Node temp = new Node(data);
        if (this.tail == null) {
            this.head = this.tail = temp;
        }
        this.tail.next = temp;
    }

    public Node dequeue() {
        if (this.head == null)
            return null;
        Node temp = this.head;
        this.head = this.head.next;
        if (this.head == null)
            this.tail = null;
        return temp;
    }
}
