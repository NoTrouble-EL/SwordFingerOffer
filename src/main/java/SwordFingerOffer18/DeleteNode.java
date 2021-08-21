package SwordFingerOffer18;


import java.util.List;

/**
 * @Author: xiaohupao
 * @Date: 2021/8/21 21:11
 */
public class DeleteNode {

    private static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
        }
    }

    public static ListNode deleteNode(ListNode head, int val){
        //
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode temp = dummy;
        while (temp != null){
            if (temp.next.val == val){
                temp.next = temp.next.next;
                break;
            }
            temp = temp.next;
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(4);
        ListNode node1 = new ListNode(5);
        ListNode node2 = new ListNode(1);
        ListNode node3 = new ListNode(9);
        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        ListNode res = deleteNode(head, 1);
        System.out.println(res);
    }
}
