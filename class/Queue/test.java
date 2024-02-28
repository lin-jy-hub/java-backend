package Queue;

public class test {
    public static void main(String[] args) {
        Queue q = new Queue();
        for (int i = 0; i <= 20; ++i)
            q.enqueue(i);
        while (!q.empty())
            System.out.print(q.dequeue() + " ");
    }
}
