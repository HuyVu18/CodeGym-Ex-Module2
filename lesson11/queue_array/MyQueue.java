package lesson11.queue_array;

public class MyQueue {
    private int capacity;
    private int[] queueArr;
    private int head = 0;
    private int tail = -1;
    private int currentSize = 0;

    public MyQueue(int queueSize) {
        this.capacity = queueSize;
        queueArr = new int[this.capacity];
    }

    public boolean isQueueFull() {
        boolean stt = false;
        if (currentSize == capacity) {
            stt = true;
        }
        return stt;
    }

    public boolean isQueueEmty() {
        boolean stt = false;
        if (currentSize == 0) {
            stt = true;
        }
        return stt;
    }

    public void enqueue(int item) {
        if (isQueueFull()) {
            System.out.println("Overflow ! Unable to add element: " + item);
        } else {
            tail++;
            if (tail == capacity - 1) {
                tail = 0;
            }
            queueArr[tail] = item;
            currentSize++;
            System.out.println("Element " + item + " is pushed to Queue !");
        }
    }

    public void dequeue() {
        if (isQueueEmty()) {
            System.out.println("Underflow ! Unable to remove element from Queue");
            head = 0;
        } else {
            System.out.println("Pop operation done ! removed: " + queueArr[head]);
        }
        currentSize--;
    }


}
