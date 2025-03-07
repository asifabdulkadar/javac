import java.util.Scanner;

class Stack {
    private int[] stack;
    private int top;
    private int size;

    public Stack(int size) {
        this.size = size;
        stack = new int[size];
        top = -1;
    }

    public void push(int value) {
        if (top == size - 1) {
            System.out.println("Stack Overflow!");
            return;
        }
        stack[++top] = value;
        System.out.println(value + " pushed into the stack.");
    }

    public void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow!");
            return;
        }
        System.out.println(stack[top--] + " popped from the stack.");
    }

    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.print("Stack elements: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }
}

public class StackImplementation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack stack = new Stack(5);

        while (true) {
            System.out.println("1. Push\n2. Pop\n3. Display\n4. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to push: ");
                    stack.push(sc.nextInt());
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    stack.display();
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
