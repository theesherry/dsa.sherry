public class Queue {
    private int rear = -1;
    private int front = 0;
    private int[] arr = new int[4];
    private int size = 0;

    public void enqueue(int data) {
        if (size == arr.length) {
            resize(); // Resizes the array when it’s full
        }

        rear = (rear + 1) % arr.length;
        arr[rear] = data;
        size++;
    }

    public int dequeue() {
        if (size > 0) {
            int data = arr[front];
            front = (front + 1) % arr.length;
            size--;
            return data;
        } else {
            throw new RuntimeException("No data");
        }
    }

    public void show() {
        for (int i = 0; i < size; i++) {
            int index = (front + i) % arr.length;
            System.out.println(arr[index] + " at position " + index);
        }
    }

    public void deshow() {
        System.out.println("Value dequeued is " + dequeue());
    }

    private void resize() {
        int[] newArr = new int[arr.length * 2]; // Double the array size
        for (int i = 0; i < size; i++) {
            newArr[i] = arr[(front + i) % arr.length];
        }
        arr = newArr;
        front = 0;
        rear = size - 1;
    }
}
