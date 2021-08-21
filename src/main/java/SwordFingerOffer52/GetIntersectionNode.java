package SwordFingerOffer52;

import java.util.List;

/**
 * @Author: xiaohupao
 * @Date: 2021/8/21 21:58
 */
public class GetIntersectionNode {

    private static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
        }
    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB){
        ListNode l1 = headA, l2 = headB;
        while (l1 != l2){
            l1 = l1 == null ? headB : l1.next;
            l2 = l2 == null ? headA: l2.next;
        }

        return l1;
    }

    public static void main(String[] args) {
        ListNode headA = new ListNode(4);
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(8);
        ListNode headB = new ListNode(5);
        ListNode node3 = new ListNode(0);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(1);
        headA.next = node1;
        node1.next = node2;
        node2.next = node4;
        node4.next = node5;
        headB.next = node3;
        node3.next = node6;
        node6.next = node2;

        ListNode res = getIntersectionNode(headA, headB);
        System.out.println(res);
    }
}
