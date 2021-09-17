package SwordFingerOffer30;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @Author: xiaohupao
 * @Date: 2021/9/17 19:33
 */
public class MinStack {

    private Deque<Integer> stack1;
    private Deque<Integer> stack2;

    public MinStack(){
        stack1 = new ArrayDeque<>();
        stack2 = new ArrayDeque<>();
    }

    public void push(int x){
        stack1.push(x);
        if (stack2.isEmpty() || stack2.peek() >= x){
            stack2.push(x);
        }
    }

    public void pop(){
        if (stack1.pop().equals(stack2.peek())){
            stack2.pop();
        }
    }

    public int top(){
        return stack1.peek();
    }

    public int min(){
        return stack2.peek();
    }
}
