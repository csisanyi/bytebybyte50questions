package _50.coding.interview.questions._20;

import java.util.Stack;

public class ReverseStack {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        reverse(stack);


    }

    public static Stack<Integer> reverse(Stack<Integer> stack) {
        if (stack.isEmpty()) return stack;
        int temp = stack.pop();
        reverse(stack);
        insertAtBottom(stack, temp);
        return stack;
    }

    private static void insertAtBottom(Stack<Integer> stack, int x) {
        if (stack.isEmpty()) {
            stack.push(x);
            return;
        }

        int temp = stack.pop();
        insertAtBottom(stack, x);
        stack.push(temp);
    }
}
