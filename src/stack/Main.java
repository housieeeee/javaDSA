package stack;

public class Main {
    public static void main(String[] args) {
        Stack myStack = new Stack(7);

        myStack.push(33);

        myStack.pop();

        myStack.getTop();
        myStack.getHeight();
        myStack.printStack();
    }
}
