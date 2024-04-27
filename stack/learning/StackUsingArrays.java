package stack.learning;

class Stack {
    int[] arr;
    int pointer = -1;

    Stack(int capacity) {
        this.arr = new int[capacity];
    }

    public void push(int element) {
        pointer++;
        arr[pointer] = element;
    }

    public int pop() {
        int data = arr[pointer];
        pointer--;
        return data;
    }

    public int peek() {
        return arr[pointer];
    }

    public int size() {
        return arr.length + 1;
    }

}

public class StackUsingArrays {
    public static void main(String[] args) {
        Stack stack = new Stack(50);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("Size: " + stack.size());
        System.out.println("Pop Element is: " + stack.pop());
        System.out.println("Pop Element is: " + stack.pop());
        System.out.println("Peek Element is: " + stack.peek());
    }
}
