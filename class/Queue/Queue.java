package Queue;

import java.util.Arrays;

public class Queue {
    private int[] a;
    private int front;
    private int end;
    private int capacity;

    Queue() {
        capacity = 8;
        front = 0;
        end = 0;
        a = new int[capacity];
    }

    private void check() {
        if (end == capacity) {
            if (front != 0) {
                int len = end - front + 1;
                for (int i = 0; i < len; ++i)
                    a[i] = a[front + i];
                front = 0;
                end = len;
            }
            if (end == capacity) {
                capacity *= 2;
                int[] b = new int[capacity];
                b = Arrays.copyOf(a, capacity);
                a = b;
            }
        }
    }

    public void enqueue(int val) {
        check();
        a[end++] = val;
    }

    public int dequeue() {
        return a[front++];
    }

    public boolean empty() {
        return end - front == 0;
    }

    public int getSize() {
        return end - front + 1;
    }
}
