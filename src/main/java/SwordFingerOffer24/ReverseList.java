package SwordFingerOffer24;

import java.util.List;

/**
 * @Author: xiaohupao
 * @Date: 2021/8/21 21:36
 */
public class ReverseList {

    private static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
        }
    }

    public static ListNode reverseList(ListNode head){
        //corner case
        if (head == null || head.next == null){
            return head;
        }

        ListNode pre = null, cur = head;
        while (cur != null){
            ListNode ne = cur.next;
            cur.next = pre;
            pre = cur;
            cur = ne;
        }

        return pre;
    }

    public static ListNode reverseList1(ListNode head){
        //corner case
        if (head == null || head.next == null){
            return head;
        }

        ListNode res = reverseList1(head.next);
        head.next.next = head;
        head.next = null;

        return res;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(4);
        ListNode node4 = new ListNode(5);
        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        ListNode res = reverseList(head);
        ListNode res1 = reverseList1(res);
        System.out.println(res);
        System.out.println(res1);
    }
}
