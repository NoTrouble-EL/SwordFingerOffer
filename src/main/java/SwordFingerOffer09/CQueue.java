package SwordFingerOffer09;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @Author: Wukun
 * @Date: 2021/8/19下午5:37
 */
public class CQueue {
    // Create two stacks
    private Deque<Integer> stack1;
    private Deque<Integer> stack2;

    // Initialization stack
    public CQueue(){
        stack1 = new ArrayDeque<>();
        stack2 = new ArrayDeque<>();
    }

    // Insert an integer at the end of the queue
    public void appendTail(int value){
        stack2.push(value);
    }

    // Delete integers at the head of the queue
    public int deleteHead(){
        if (stack1.isEmpty()){
            while (!stack2.isEmpty()){
                stack1.push(stack2.pop());
            }
        }

        if (stack1.isEmpty()){
            return -1;
        }else {
            return stack1.pop();
        }
    }
}
