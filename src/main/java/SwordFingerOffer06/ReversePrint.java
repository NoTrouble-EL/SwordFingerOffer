package SwordFingerOffer06;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

/**
 * @Author: Wukun
 * @Date: 2021/8/19下午5:29
 */
public class ReversePrint {

    private static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
        }
    }

    public static int[] reversePrint(ListNode head){
        // Create a stack
        Deque<Integer> stack = new ArrayDeque<>();

        // Traversing the linked list
        ListNode temp = head;
        while (temp != null){
            stack.push(temp.val);
            temp = temp.next;
        }

        // Create an array to save the results
        int[] res = new int[stack.size()];
        int index = 0;
        // Take elements from the stack into the array
        while (!stack.isEmpty()){
            res[index++] = stack.pop();
        }

        return res;
    }

    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(3);
        ListNode node2 = new ListNode(2);
        head.next = node1;
        node1.next = node2;

        System.out.println(Arrays.toString(reversePrint(head)));
    }
}
