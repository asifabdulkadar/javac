import java.util.Scanner;

class Queue {
    private int[] queue;
    private int front, rear, size;

    public Queue(int size) {
        this.size = size;
        queue = new int[size];
        front = -1;
        rear = -1;
    }

    public void enqueue(int value) {
        if (rear == size - 1) {
            System.out.println("Queue Overflow!");
            return;
        }
        if (front == -1) front = 0;
        queue[++rear] = value;
        System.out.println(value + " enqueued.");
    }

    public void dequeue() {
        if (front == -1 || front > rear) {
            System.out.println("Queue Underflow!");
            return;
        }
        System.out.println(queue[front++] + " dequeued.");
    }

    public void display() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.print("Queue elements: ");
        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }
}

public class QueueImplementation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue queue = new Queue(5);

        while (true) {
            System.out.println("1. Enqueue\n2. Dequeue\n3. Display\n4. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to enqueue: ");
                    queue.enqueue(sc.nextInt());
                    break;
                case 2:
                    queue.dequeue();
                    break;
                case 3:
                    queue.display();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid option!");
            }
        }
    }
}
