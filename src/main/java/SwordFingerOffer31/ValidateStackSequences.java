package SwordFingerOffer31;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @Author: xiaohupao
 * @Date: 2021/9/17 19:39
 */
public class ValidateStackSequences {

    public static boolean validateStackSequences(int[] pushed, int[] popped){
        Deque<Integer> stack = new ArrayDeque<>();
        int index = 0;
        //遍历输入数组
        for (int num : pushed){
            stack.push(num);
            while (!stack.isEmpty() && stack.peek() == popped[index]){
                stack.pop();
                index++;
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        int[] pushed = {1,2,3,4,5};
        int[] popped = {4,5,3,2,1};
        System.out.println(validateStackSequences(pushed, popped));
    }
}
