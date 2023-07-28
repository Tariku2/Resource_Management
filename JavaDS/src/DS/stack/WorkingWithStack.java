package DS.stack;

import java.util.Stack;

public class WorkingWithStack {
    public static void main(String[] args) {
        Stack<Integer>stack=new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(4);
        stack.push(5);
        System.out.println(stack);
        //to element at the top of stack
        System.out.println(stack.peek());
    //Check the size of stack elements
        System.out.println(stack.size());
        //To remove the top element
        System.out.println(stack.pop());
        //Check the size of stack elements after removing the element
        System.out.println(stack.size());
        //Just to check whether the stack is empty or not
        System.out.println(stack.empty());

    }

}
