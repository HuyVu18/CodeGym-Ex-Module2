package lesson12.stack_array;

public class MyStack {
    private int[] arr;
    private int size;
    private int index = 0;

    public MyStack(int size) {
        this.size = size;
        arr = new int[size];
    }

    public boolean isEmpty() {
        boolean stt = false;
        if (index == 0) {
            stt = true;
        }
        return stt;
    }

    public boolean isFull() {
        boolean stt = false;
        if (index == size) {
            stt = true;
        }
        return stt;
    }

    public void push(int e) {
        if (isFull()) {
            throw new StackOverflowError("Stack is full!");
        }
        arr[index] = e;
        index++;
    }

    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is null");
        }
        return arr[index--];
    }

    public int size() {
        return index;
    }


}
